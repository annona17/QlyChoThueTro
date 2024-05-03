package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
    public static Connection con;

    public DAO(){
        if(con == null) {
            String dbUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=QLyThueTro;instance=SERVER_NA;encrypt=true;TrustServerCertificate=true;";
            String dbClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

            try {
                Class.forName(dbClass);
                con = DriverManager.getConnection (dbUrl, "sa", "123");
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
