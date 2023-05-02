create database QA
GO

use QA
GO

CREATE TABLE [tbl_departamento] (
[codigo] INT IDENTITY(1,1) PRIMARY KEY,
[descripcion] VARCHAR(50) NOT NULL
)
GO

CREATE TABLE [tbl_tipos_deducciones] (
[codigo] INT IDENTITY(1,1) PRIMARY KEY,
[nombre] VARCHAR(50) NOT NULL
)
GO

CREATE TABLE [tbl_deducciones] (
[codigo] INT IDENTITY(1,1) PRIMARY KEY,
[nombres] VARCHAR(50) NOT NULL,
[porcentaje] FLOAT NOT NULL,
[tipo_deduccion_id] INT NOT NULL
)
GO

CREATE TABLE [tbl_empleados] (
[cedula] BIGINT PRIMARY KEY,
[nombre] VARCHAR(50) NOT NULL,
[apellido1] VARCHAR(50) NOT NULL,
[apellido2] VARCHAR(50) NOT NULL,
[salario] BIGINT NOT NULL,
[fecha_nacimiento] VARCHAR(50) NOT NULL,
[departamento_id] INT NOT NULL,
[aporte_asociacion] FLOAT NOT NULL DEFAULT 0
)
GO

CREATE TABLE [tbl_deducciones_por_empleado] (
[codigo] BIGINT IDENTITY(1,1) PRIMARY KEY,
[deduccion_cargas_sociales] FLOAT NOT NULL,
[deduccion_impuesto] FLOAT NOT NULL,
[salario_neto] INT NOT NULL,
[empleado_id] BIGINT NOT NULL,
[curdate] DATETIME NOT NULL,
)
GO


CREATE TABLE [tbl_deducciones_al_patrono] (
[codigo] BIGINT IDENTITY(1,1) PRIMARY KEY,
[curdate] DATETIME NOT NULL,
[monto_a_pagar] FLOAT NOT NULL,
[monto_total_bruto] BIGINT NOT NULL,
)
GO

INSERT INTO [tbl_tipos_deducciones] ([nombre]) VALUES
    ('Obrero'),('Impuesto de renta');
GO

INSERT INTO [tbl_deducciones] ([nombres], [porcentaje], [tipo_deduccion_id]) VALUES
	('Seguro de Enfermedad y Maternidad (SEM)', '0.055', '1'),
	('Invalidez, Vejez y Muerte (IVM)', '0.0417', '1'),
	('Aporte Trabajador Banco Popular', '0.01', '1'),
	('Seguro de Enfermedad y Maternidad', '0.0925', '2'),
	('Invalidez, Vejez y Muerte', '0.0542', '2'),
	('Cuota Patronal Banco Popular', ' 0.0025 ', '2'),
	('Asignaciones Familiares', ' 0.05 ', '2'),
	('Instituto Mixto de Ayuda Social (IMAS)', '0.005', '2'),
	('Instituto Nacional de Aprendizaje (INA)', '0.015', '2'),
	('Aporte Patrono Banco Popular', '0.0025', '2'),
	('Fondo de Capitalización Laboral', '0.015', '2'),
	('Fondo de Pensiones Complementarias', '0.02', '2'),
	('Instituto Nacional de Seguros', '0.01', '2');
GO


INSERT INTO [tbl_departamento] ([descripcion]) VALUES
	('Recursos Humanos'),
	('Finanzas'),
	('Marketing'),
	('Ventas'),
	('Producción'),
	('Logística'),
	('Investigación y Desarrollo'),
	('Servicio al cliente'),
	('Comunicación'),
	('Tecnología de la Información'),
	('Auditoría'),
	('Legal'),
	('Compras'),
	('Relaciones Públicas'),
	('Contabilidad'),
	('Planificación Estratégica'),
	('Desarrollo de Negocios'),
	('Recursos Materiales'),
	('Seguridad e Higiene'),
	('Calidad'),
	('Innovación'),
	('Administración'),
	('Análisis de datos'),
	('Diseño y creatividad');
GO

INSERT INTO [tbl_empleados] ([cedula], [nombre], [apellido1], [apellido2], [salario], [fecha_nacimiento], [departamento_id], [aporte_asociacion]) VALUES
	('0', 'SARA', 'CHACON', 'PAUT', '11658757', '08/12/2005 01:13', '7', '0.0338'),
	('100010233', 'ROSALINA', 'MONGE', 'CARBONERO', '3587628', '03/09/1979 14:34', '9', '0.003'),
	('100010370', 'DOMINGO CASIMIRO', 'RIVERA', 'BONILLA', '5997307', '15/10/1967 10:03', '15', '0.0336'),
	('100010415', 'FRANCISCO', 'ARIAS', 'MENA', '7998821', '19/02/1978 17:54', '2', '0.0384');
GO

ALTER TABLE [tbl_empleados] ADD FOREIGN KEY ([departamento_id]) REFERENCES
[tbl_departamento] ([codigo])
GO
ALTER TABLE [tbl_deducciones] ADD FOREIGN KEY ([tipo_deduccion_id]) REFERENCES
[tbl_tipos_deducciones] ([codigo])
GO
ALTER TABLE [tbl_deducciones_por_empleado] ADD FOREIGN KEY ([empleado_id])
REFERENCES [tbl_empleados] ([cedula])
GO