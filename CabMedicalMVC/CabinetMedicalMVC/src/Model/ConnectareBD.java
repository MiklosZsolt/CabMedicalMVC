package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectareBD {
    private static ConnectareBD instance;
    private static Connection connection;
    private String url = "jdbc:mysql://localhost:3306/cabinetmedical";
    private String username = "root";
    private String password = "";

    public ConnectareBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
            if (connection != null && !connection.isClosed()) {
                System.out.println("Conexiunea la baza de date este deschisă.");
            } else {
                System.out.println("Conexiunea la baza de date este închisă.");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error connecting to the database: " + ex.getMessage());
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    public static ConnectareBD getInstance() {
        if (instance == null) {
            instance = new ConnectareBD();
        }
        return instance;
    }

    public void testConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                System.out.println("Conexiunea la baza de date este deschisă.");
            } else {
                System.out.println("Conexiunea la baza de date este închisă.");
            }
        } catch (SQLException e) {
            System.out.println("Eroare la verificarea stării conexiunii la baza de date: " + e.getMessage());
        }
    }
}
