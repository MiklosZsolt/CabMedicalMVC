package Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdministratorPersistent {
    private Connection connection;

    public AdministratorPersistent(Connection connection) {
        this.connection = connection;
    }

    public AdministratorPersistent() {
    }

    //    public List<Utilizatori> getAllUsers() throws SQLException {
//        List<Utilizatori> utilizatori = new ArrayList<>();
//        String comandaSQL = "SELECT * FROM utilizatori";
//        PreparedStatement statement = null;
//        ResultSet resultSet = null;
//
//        try {
//            statement = connection.prepareStatement(comandaSQL);
//            resultSet = statement.executeQuery();
//
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String nume = resultSet.getString("nume");
//                String parola = resultSet.getString("parola");
//                String rol = resultSet.getString("rol");
//                Utilizatori ut = new Utilizatori(nume, parola, rol, id);
//                utilizatori.add(ut);
//            }
//        } catch (SQLException e) {
//            System.out.println("Error: " + e.getMessage());
//        } finally {
//            try {
//                if (resultSet != null) {
//                    resultSet.close();
//                }
//                if (statement != null) {
//                    statement.close();
//                }
//            } catch (SQLException e) {
//                System.out.println("Error closing resources: " + e.getMessage());
//            }
//        }
//
//        return utilizatori;
//    }
//
//    public boolean adaugareUtilizator(Utilizatori utl) throws SQLException {
//        String comandaSQL = "INSERT INTO utilizatori VALUES(? ,?, ?, ?);";
//        PreparedStatement statement = connection.prepareStatement(comandaSQL);
//        statement.setInt(1, utl.getId());
//        statement.setString(2, utl.getNume());
//        statement.setString(3, utl.getParola());
//        statement.setString(4, utl.getRolUtilizatori());
//
//        int affectedRows = statement.executeUpdate();
//
//        if (affectedRows == 0) {
//            throw new SQLException("Creating User failed!");
//        }
//
//        return true;
//    }
//
//    public boolean stergereUtilizator(int id) throws SQLException {
//        String comandaSQL = "DELETE FROM utilizatori WHERE id = ?;";
//        PreparedStatement statement = connection.prepareStatement(comandaSQL);
//        statement.setInt(1, id);
//        int affectedRows = statement.executeUpdate();
//
//        if (affectedRows == 0) {
//            throw new SQLException("Deleting User failed, user with id: " + id + " does not exist!");
//        }
//
//        return true;
//    }
//
//    public boolean actualizareUtilizator(Utilizatori utl) throws SQLException {
//        String comandaSQL = "UPDATE utilizatori SET nume=?, parola=?, rol=? WHERE id=?";
//        PreparedStatement statement = connection.prepareStatement(comandaSQL);
//        statement.setString(1, utl.getNume());
//        statement.setString(2, utl.getParola());
//        statement.setString(3, utl.getRolUtilizatori());
//        statement.setInt(4, utl.getId());
//
//        int affectedRows = statement.executeUpdate();
//
//        if (affectedRows == 0) {
//            throw new SQLException("Updating User failed!");
//        }
//
//        return true;
//    }
}
