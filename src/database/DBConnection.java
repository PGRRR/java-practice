package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
    private Connection con;
    private Statement st;
    private ResultSet rs;

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql:localhost:3080/spring", "root", "123789");
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println("Database connect error" + e.getMessage());
        }
    }

    public boolean isAdmin(String adminID, String adminPassword) {
        try {
            String SQL = "SELECT * FROM ADMIN WHERE adminID = " + adminID + " AND adminPassword = " + adminPassword;
            rs = st.executeQuery(SQL);
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Database search error" + e.getMessage());
        }
        return false;
    }
}
