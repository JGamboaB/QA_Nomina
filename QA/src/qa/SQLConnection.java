package qa;
import java.sql.*;

//https://www.youtube.com/watch?v=GJTnJ_EBFY8

public class SQLConnection{
    private Connection conn;
    private final String sql_name = "DESKTOP-58M6DC9"; //change
    private final String db_name = "QA"; //"QA_test"; //change
    private final String url = "jdbc:sqlserver://" + sql_name + ":1433;Database="+db_name+";encrypt=true;trustServerCertificate=true;integratedSecurity=true;";
        
    public SQLConnection() throws SQLException{
        if (conn == null || conn.isClosed()){
            conn = DriverManager.getConnection(url);
            System.out.println("Connection Established");
        }
    }
    
    public ResultSet ver_d_patronales() throws SQLException{
        String sql = "SELECT * FROM  tbl_deducciones_al_patrono ORDER BY codigo DESC;";
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        boolean hasResults = stmt.execute();
        
        if (hasResults){
            ResultSet rs = stmt.getResultSet();
            return rs;
        } return null;
    }
    
    public ResultSet calc_d_patronales() throws SQLException{
        CallableStatement stmt = conn.prepareCall("{call sp_calcular_deducciones_patrono}");
        
        boolean hasResults = stmt.execute();
        
        if (hasResults){
            ResultSet rs = stmt.getResultSet();
            return rs;
        } return null;
    }
    
    public void select() throws SQLException{
        // Select Statement Example
        String sql = """
                     select e.nombre, td.descripcion from tbl_empleados as e
                         JOIN tbl_departamento td on td.codigo = e.departamento_id
                         where e.departamento_id = 1;""";
        System.out.println(sql);
        try (Statement statement = conn.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                String name = resultSet.getString("nombre");
                String desc = resultSet.getString("descripcion");
                System.out.println(" Name: " + name + " Description: " + desc);
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        String sql_name = "DESKTOP-58M6DC9"; //change
        String db_name = "QA_test"; //change
        String url = "jdbc:sqlserver://" + sql_name + ":1433;Database="+db_name+";encrypt=true;trustServerCertificate=true;integratedSecurity=true;";

        try {
            try (Connection conn = DriverManager.getConnection(url)) {
                System.out.println("Connection Established");
                
                // Select Statement Example
                String sql = "SELECT * FROM TEST";
                System.out.println(sql);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    double salary = resultSet.getDouble("salary");
                    System.out.println(id + " Name: " + name + " Salary: " + salary);
                }
                resultSet.close();
                statement.close();

                //SP Call
                CallableStatement stmt = conn.prepareCall("{call GetTableRow(?)}");
                System.out.println("\nStored Procedure:");
                stmt.setInt(1, 5); // input parameter, id = 5
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                  int id = rs.getInt("id");
                  String name = rs.getString("name");
                  int salary = rs.getInt("salary");
                  System.out.println("ID "+ id + " Name: " + name + " Salary: " + salary);
                }
            }
            
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
