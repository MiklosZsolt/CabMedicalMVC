package Model;

import java.security.Principal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UtilizatorPersistenta {
    Connection connection = ConnectareBD.getInstance().getConnection();

    public Utilizator getAuthenticatedUser(String nume, String parola) {
        String comandaSQL = "SELECT * FROM utilizatori WHERE Nume=? AND Parola=?;";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Utilizator utilizator = null;

        try {
            statement = connection.prepareStatement(comandaSQL);
            statement.setString(1, nume);
            statement.setString(2, parola);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String rol = resultSet.getString("rol");
                utilizator = new Utilizator(nume, parola, rol, id);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
        return utilizator;
    }

    public List<Utilizator> getAllUsers() {
        List<Utilizator> utilizator = new ArrayList<>();
        String comandaSQL = "SELECT * FROM utilizatori";
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.prepareStatement(comandaSQL);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nume = resultSet.getString("nume");
                String parola = resultSet.getString("parola");
                String rol = resultSet.getString("rol");
                String specialitate = resultSet.getString("specialitate");
                String cnp = resultSet.getString("CNP");
                Utilizator ut = new Utilizator(nume, parola, rol, id, specialitate, cnp);
                utilizator.add(ut);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }

        return utilizator;


    }


    public boolean adaugareUtilizator(Utilizator utl) throws SQLException {
        String comandaSQL = "INSERT INTO utilizatori VALUES(? ,?, ?, ?,?,?);";
        PreparedStatement statement = connection.prepareStatement(comandaSQL);
        statement.setInt(1, utl.getId());
        statement.setString(2, utl.getNume());
        statement.setString(3, utl.getParola());
        statement.setString(4, utl.getRolUtilizator());
        statement.setString(5, utl.getSpecialitate());
        statement.setString(6, utl.getCNP());


        int affectedRows = statement.executeUpdate();

        if (affectedRows == 0) {
            throw new SQLException("Creating User failed!");
        }
        return true;
    }

    public boolean stergereUtilizator(int id) throws SQLException {
        String comandaSQL = "DELETE FROM utilizatori WHERE id = ?;";
        PreparedStatement statement = connection.prepareStatement(comandaSQL);
        statement.setInt(1, id);
        int affectedRows = statement.executeUpdate();

        if (affectedRows == 0) {
            throw new SQLException("Deleting User failed, user with id: " + id + " does not exist!");
        }
        return true;
    }

    public boolean actualizareUtilizator(Utilizator utl) throws SQLException {
        String comandaSQL = "UPDATE utilizatori SET ";
        List<String> coloane = new ArrayList<>();
        if (utl.getNume() != null && !utl.getNume().isEmpty()) {
            coloane.add("nume=?");
        }
        if (utl.getParola() != null && !utl.getParola().isEmpty()) {
            coloane.add("parola=?");
        }
        if (utl.getRolUtilizator() != null && !utl.getRolUtilizator().isEmpty()) {
            coloane.add("rol=?");
        }
        if (utl.getSpecialitate() != null && !utl.getSpecialitate().isEmpty()) {
            coloane.add("specialitate=?");
        }
        if (utl.getCNP() != null && !utl.getCNP().isEmpty()) {
            coloane.add("CNP=?");
        }
        comandaSQL += String.join(",", coloane) + " WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(comandaSQL);
        int index = 1;
        if (utl.getNume() != null && !utl.getNume().isEmpty()) {
            statement.setString(index++, utl.getNume());
        }
        if (utl.getParola() != null && !utl.getParola().isEmpty()) {
            statement.setString(index++, utl.getParola());
        }
        if (utl.getRolUtilizator() != null && !utl.getRolUtilizator().isEmpty()) {
            statement.setString(index++, utl.getRolUtilizator());
        }
        if (utl.getSpecialitate() != null && !utl.getSpecialitate().isEmpty()) {
            statement.setString(index++, utl.getSpecialitate());
        }
        if (utl.getCNP() != null && !utl.getCNP().isEmpty()) {
            statement.setString(index++, utl.getCNP());
        }
        statement.setInt(index++, utl.getId());

        int affectedRows = statement.executeUpdate();

        if (affectedRows == 0) {
            throw new SQLException("Updating User failed!");
        }
        return true;
    }


    ////////////////////////////////////////////////////

    public List<Pacient> getAllPatient() {
        List<Pacient> pacienti = new ArrayList<>();
        String comandaSQL = "SELECT * FROM pacienti";
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.prepareStatement(comandaSQL);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                int CNP = resultSet.getInt("CNP");
                String nume = resultSet.getString("nume");
                int varsta = resultSet.getInt("Varsta");
                Pacient p = new Pacient(id, CNP, nume, varsta);
                pacienti.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }

        return pacienti;
    }

    public boolean adaugaPacient(Pacient pacient) throws SQLException {
        String comandaSQL = "INSERT INTO pacienti VALUES(? ,?, ?, ?);";
        PreparedStatement statement = connection.prepareStatement(comandaSQL);
        statement.setInt(1, pacient.getId());
        statement.setInt(2, pacient.getCNP());
        statement.setString(3, pacient.getNume());
        statement.setInt(4, pacient.getVarsta());



        int affectedRows = statement.executeUpdate();

        if (affectedRows == 0) {
            throw new SQLException("Creating User failed!");
        }
        return true;
    }

    public boolean actualizarePacient(Pacient pacient) throws SQLException {
        String comandaSQL = "UPDATE pacienti SET nume=?, varsta=? WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(comandaSQL);

        statement.setString(1, pacient.getNume());
        statement.setInt(2, Integer.parseInt(String.valueOf(pacient.getVarsta())));
        statement.setInt(3, Integer.parseInt(String.valueOf(pacient.getId())));

        int affectedRows = statement.executeUpdate();

        if (affectedRows == 0) {
            throw new SQLException("Updating User failed!");
        }
        return true;
    }
    public boolean stergePacient(int id) throws SQLException {
        String comandaSQLCheck = "SELECT COUNT(*) FROM consultatii WHERE idpacient = ?";
        String comandaSQLDeleteConsultatii = "DELETE FROM consultatii WHERE idpacient = ?";
        String comandaSQLDeletePacient = "DELETE FROM pacienti WHERE id = ?";

        PreparedStatement statementCheck = connection.prepareStatement(comandaSQLCheck);
        statementCheck.setInt(1, id);
        ResultSet resultSet = statementCheck.executeQuery();

        resultSet.next();
        int numarConsultatii = resultSet.getInt(1);

        if (numarConsultatii > 0) {
            PreparedStatement statementDeleteConsultatii = connection.prepareStatement(comandaSQLDeleteConsultatii);
            statementDeleteConsultatii.setInt(1, id);
            statementDeleteConsultatii.executeUpdate();
        }

        PreparedStatement statementDeletePacient = connection.prepareStatement(comandaSQLDeletePacient);
        statementDeletePacient.setInt(1, id);
        int affectedRows = statementDeletePacient.executeUpdate();

        if (affectedRows == 0) {
            throw new SQLException("Deleting User failed, user with id: " + id + " does not exist!");
        }

        return true;
    }
    public List<Pacient> filtrarePacienti(String nume, String diagnostic, int varsta) throws SQLException {
        List<Pacient> pacienti = new ArrayList<>();

        String comandaSQL = "SELECT DISTINCT p.* FROM pacienti p " +
                "JOIN consultatii c ON p.id = c.idpacient " +
                "JOIN utilizatori u ON c.idmedic = u.id " +
                "WHERE 1=1";

        // Adaugam clauza WHERE daca exista criterii de filtrare
        if (nume != null && !nume.isEmpty()) {
            comandaSQL += " AND u.nume = ?";
        }
        if (diagnostic != null && !diagnostic.isEmpty()) {
            comandaSQL += " AND c.diagnostic = ?";
        }
        if (varsta > 0) {
            comandaSQL += " AND p.varsta >= ?";
        }


        // Cream statement-ul si setam parametrii daca exista criterii de filtrare
        PreparedStatement statement = connection.prepareStatement(comandaSQL);
        int index = 1;
        if (nume != null && !nume.isEmpty()) {
            statement.setString(index++, nume);
        }
        if (diagnostic != null && !diagnostic.isEmpty()) {
            statement.setString(index++, diagnostic);
        }
        if (varsta > 0) {
            statement.setInt(index++, varsta);
        }

        // Executam interogarea si adaugam rezultatele in lista de pacienti
        ResultSet result = statement.executeQuery();
        while (result.next()) {
            Pacient pacient = new Pacient();
            pacient.setId(result.getInt("id"));
            pacient.setCNP(result.getInt("CNP"));
            pacient.setNume(result.getString("Nume"));
            pacient.setVarsta(result.getInt("Varsta"));
            pacienti.add(pacient);
        }

        return pacienti;
    }


    public List<Pacient> getDoctorPatients(int doctorId) {
        List<Pacient> drpatients = new ArrayList<>();
        String comandaSQL = "SELECT p.id, p.nume, c.simptome, c.diagnostic, c.tratament " +
                "FROM pacienti p " +
                "JOIN consultatii c ON p.id = c.idpacient " +
                "WHERE c.idmedic = ?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.prepareStatement(comandaSQL);
            statement.setInt(1, doctorId);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nume = resultSet.getString("nume");
                String simptome = resultSet.getString("simptome");
                String diagnostic = resultSet.getString("diagnostic");
                String tratament = resultSet.getString("tratament");
                Pacient dp = new Pacient(id, nume, simptome, diagnostic, tratament);
                drpatients.add(dp);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }

        return drpatients;
    }
    public int getIdUtilizator(String nume, String parola) {
        try {
            String comandaSQL = "SELECT id FROM utilizatori WHERE nume=? AND parola=?";
            PreparedStatement pstmt = connection.prepareStatement(comandaSQL);
            pstmt.setString(1, nume);
            pstmt.setString(2, parola);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                System.out.println(id);
                return id;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return -1; // înseamnă că nu s-a găsit utilizatorul în baza de date
    }
    public boolean actualizeazaConsultatie(Consultatii consultatii) throws SQLException {
        String comandaSQL = "UPDATE consultatii SET ";
        boolean hasParams = false;

        if (consultatii.getSimptome() != null && !consultatii.getSimptome().isEmpty()) {
            comandaSQL += "simptome=?, ";
            hasParams = true;
        }
        if (consultatii.getDiagnostic() != null && !consultatii.getDiagnostic().isEmpty()) {
            comandaSQL += "diagnostic=?, ";
            hasParams = true;
        }
        if (consultatii.getTratament() != null && !consultatii.getTratament().isEmpty()) {
            comandaSQL += "tratament=?, ";
            hasParams = true;
        }

        if (!hasParams) {
            return false; // nu avem parametrii, nu modificăm nimic
        }

        comandaSQL = comandaSQL.substring(0, comandaSQL.length() - 2); // eliminăm ultima virgulă și spațiul
        comandaSQL += " WHERE idpacient=?";
        PreparedStatement statement = connection.prepareStatement(comandaSQL);

        int index = 1;
        if (consultatii.getSimptome() != null && !consultatii.getSimptome().isEmpty()) {
            statement.setString(index++, consultatii.getSimptome());
        }
        if (consultatii.getDiagnostic() != null && !consultatii.getDiagnostic().isEmpty()) {
            statement.setString(index++, consultatii.getDiagnostic());
        }
        if (consultatii.getTratament() != null && !consultatii.getTratament().isEmpty()) {
            statement.setString(index++, consultatii.getTratament());
        }
        statement.setInt(index, Integer.parseInt(String.valueOf(consultatii.getIdpacienti())));

        int affectedRows = statement.executeUpdate();

        if (affectedRows == 0) {
            throw new SQLException("Updating User failed!");
        }
        return true;
    }


    public List<Pacient> filtrarePacientiDoctor(String diagnostic, String tratament, int idmedic) throws SQLException {
        List<Pacient> pacienti = new ArrayList<>();
        System.out.println(diagnostic + tratament);
        String comandaSQL = "SELECT DISTINCT p.* FROM pacienti p " +
                "JOIN consultatii c ON p.id = c.idpacient " +
                "JOIN utilizatori u ON c.idmedic = u.id " +
                "WHERE 1=1";

        // Adaugam clauza WHERE daca exista criterii de filtrare

        if (diagnostic != null && !diagnostic.isEmpty()) {
            comandaSQL += " AND c.Diagnostic = ?";
        }
        if (tratament != null && !tratament.isEmpty()) {
            comandaSQL += " AND c.Tratament = ?";
        }

        // Adăugăm clauza WHERE pentru a filtra după id-ul medicului
        comandaSQL += " AND u.id = ?";

        // Cream statement-ul si setam parametrii daca exista criterii de filtrare
        PreparedStatement statement = connection.prepareStatement(comandaSQL);
        int index = 1;

        if (diagnostic != null && !diagnostic.isEmpty()) {
            statement.setString(index++, diagnostic);
        }
        if (tratament != null && !tratament.isEmpty()) {
            statement.setString(index++, tratament);
        }

        // Setam parametrul pentru id-ul medicului
        statement.setInt(index++, idmedic);

        // Executam interogarea si adaugam rezultatele in lista de pacienti
        ResultSet result = statement.executeQuery();
        System.out.println("Numar pacienti gasiti: " + result.getFetchSize());
        while (result.next()) {
            Pacient pacient = new Pacient();
            pacient.setId(result.getInt("id"));
            pacient.setCNP(result.getInt("CNP"));
            pacient.setNume(result.getString("Nume"));
            pacienti.add(pacient);
            System.out.println("Nume pacient: " + pacient.getNume());
        }

        return pacienti;
    }











}





