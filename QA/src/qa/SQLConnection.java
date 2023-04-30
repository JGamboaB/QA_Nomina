package qa;
import java.sql.*;

//https://www.youtube.com/watch?v=GJTnJ_EBFY8

public class SQLConnection{

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
