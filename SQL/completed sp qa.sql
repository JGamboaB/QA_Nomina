use QA
GO

CREATE PROCEDURE [sp_calcular_deducciones_patrono]
    AS
    BEGIN
        SET NOCOUNT ON;

        -- Obtener la suma de salarios de la tabla tbl_empleados
        DECLARE @suma_salarios BIGINT;
        SELECT @suma_salarios = SUM(salario) FROM tbl_empleados;

        -- Obtener la suma de porcentajes de deducciones de la tabla tbl_deducciones
        DECLARE @suma_porcentajes FLOAT;
        SELECT @suma_porcentajes = SUM(porcentaje) FROM tbl_deducciones WHERE tipo_deduccion_id = 2;

        -- Calcular el monto a pagar por el patrono
        DECLARE @monto_a_pagar FLOAT;
        SET @monto_a_pagar = ROUND(@suma_salarios * @suma_porcentajes,3);

        -- Insertar los resultados en la tabla tbl_deducciones_al_patrono
        INSERT INTO tbl_deducciones_al_patrono (curdate, monto_a_pagar, monto_total_bruto)
        VALUES (GETDATE(), @monto_a_pagar, @suma_salarios);
END
GO

CREATE PROCEDURE [sp_calcular_deducciones_empleado]
    AS
    BEGIN
        SET NOCOUNT ON;

        BEGIN TRANSACTION;

        DECLARE @porcentaje FLOAT;
        SELECT @porcentaje = SUM(porcentaje) FROM tbl_deducciones WHERE tipo_deduccion_id = 1;

        IF (@porcentaje IS NOT NULL)
        BEGIN
            DECLARE
                @empleado_cedula BIGINT,
                @empleado_salario BIGINT,
                @deduccion_cargas_sociales FLOAT,
                @decciones_impuesto FLOAT,
                @salario_bruto FLOAT;

            -- Create temporary table to hold employee cedulas and salaries
            CREATE TABLE #temp_empleados ([cedula] BIGINT PRIMARY KEY,[salario] BIGINT NOT NULL)

            -- Insert cedula and salary of all employees into temporary table
            INSERT INTO #temp_empleados ([cedula], [salario])
            SELECT [cedula], [salario] FROM [tbl_empleados];

            DECLARE empleado_cursor CURSOR FOR SELECT cedula, salario FROM #temp_empleados;

            OPEN empleado_cursor;

            FETCH NEXT FROM empleado_cursor INTO @empleado_cedula, @empleado_salario;

            WHILE @@FETCH_STATUS = 0
            BEGIN
                SET @deduccion_cargas_sociales = @empleado_salario * (@porcentaje + (SELECT aporte_asociacion FROM tbl_empleados WHERE cedula = @empleado_cedula));
                SET @decciones_impuesto =
                    CASE
                        WHEN @empleado_salario BETWEEN 941000 AND 1381000 THEN (@empleado_salario-941000)*0.1
                        WHEN @empleado_salario > 1381000 AND @empleado_salario <= 2243000 THEN (@empleado_salario-1381000)*0.15 + 44000
                        WHEN @empleado_salario > 2243000 AND @empleado_salario <= 4845000 THEN (@empleado_salario-2243000)*0.2 + 44000 + 156300
                        WHEN @empleado_salario > 4845000 THEN (@empleado_salario-4845000)*0.25 + 44000 + 156300 + 484400
                        ELSE 0
                    END

                SET @salario_bruto = @empleado_salario - (@deduccion_cargas_sociales + @deduccion_cargas_sociales);

                INSERT INTO [tbl_deducciones_por_empleado] ([deduccion_cargas_sociales], [deduccion_impuesto], [salario_neto], [empleado_id],[curdate])
                    VALUES
                        (@deduccion_cargas_sociales,
                        @decciones_impuesto,
                        @salario_bruto,
                        @empleado_cedula,
                        GETDATE());

                FETCH NEXT FROM empleado_cursor INTO @empleado_cedula, @empleado_salario;
            END
            -- Drop temporary table
            DROP TABLE #temp_empleados;

            CLOSE empleado_cursor;
            DEALLOCATE empleado_cursor;

            IF @@ERROR <> 0
                BEGIN
                    ROLLBACK TRANSACTION;
                END
            ELSE
                BEGIN
                    COMMIT TRANSACTION;
                END
            END
END
GO

