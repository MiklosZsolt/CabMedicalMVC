package Controller;

import Model.LanguageObservable;
import Model.Utilizator;
import Model.UtilizatorPersistenta;
import View.AdministratorGui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class AdministratorController {
    private final AdministratorGui administratorView;
    private final UtilizatorPersistenta utilizatorPersistenta;
    private final LanguageObservable languageObservable;



    public AdministratorController() {
        this.administratorView = new AdministratorGui();
        this.utilizatorPersistenta = new UtilizatorPersistenta();
        this.languageObservable = new LanguageObservable();

        JButton btnSterge = administratorView.getDeleteButton();
        btnSterge.addActionListener(e -> {
            try {
                stergereUtilizator();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });
        JButton btnENG = this.administratorView.getEngButton();
        btnENG.addActionListener(e -> {
            Locale.setDefault(new Locale("en","US"));
            ResourceBundle.getBundle("MessageBundle");
            languageObservable.setLanguage("en_US");
        });
        languageObservable.addObserver((observable, arg) -> {
            String language = (String) arg;
            ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", new Locale(language.substring(0, 2), language.substring(4)));
            // String usCancel = bundle.getString("cancelButton");
            String usrol = bundle.getString("Rol");
            String usIdUtilizator = bundle.getString("IdUtilizator");
            String usAdauga = bundle.getString("Adauga");
            String usNume = bundle.getString("Nume");
            String usParola = bundle.getString("Parola");
            String usSpecialitate = bundle.getString("Specialitate");
            String usIdMedic = bundle.getString("idMedic");
            String usSterge = bundle.getString("Sterge");
            String usActualizare = bundle.getString("Actualizare");
            String usIesire = bundle.getString("Inapoi");
            String ussRefresh =bundle.getString("Reincarca");


            DefaultTableModel model = (DefaultTableModel) administratorView.getTable().getModel();
            model.setColumnIdentifiers(new Object[] {usIdUtilizator, usNume,  usParola,  usrol, usSpecialitate});



            administratorView.getLblRol().setText(usrol);
            administratorView.getLblIdUtilizator().setText(usIdUtilizator);
            administratorView.getUpdateButton().setText(usActualizare);
            administratorView.getCancelButton().setText(usIesire);
            administratorView.getInsertButton().setText(usAdauga);
            administratorView.getDeleteButton().setText(usSterge);
            administratorView.getlblidMedic().setText(usIdMedic);
            administratorView.getLblSpecialitate().setText(usSpecialitate);
            administratorView.getLblParola().setText(usParola);
            administratorView.getLblUsername().setText(usNume);
            administratorView.getBtnRefresh().setText(ussRefresh);




        });
        JButton btnSP = this.administratorView.getSP();
        btnSP.addActionListener(e -> {
            Locale.setDefault(new Locale("sp","SP"));
            ResourceBundle.getBundle("MessageBundle");
            languageObservable.setLanguage("sp_SP");
        });
        languageObservable.addObserver((observable, arg) -> {
            String language = (String) arg;
            ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", new Locale(language.substring(0, 2), language.substring(4)));
            // String usCancel = bundle.getString("cancelButton");
            String usrol = bundle.getString("Rol");
            String usIdUtilizator = bundle.getString("IdUtilizator");
            String usAdauga = bundle.getString("Adauga");
            String usNume = bundle.getString("Nume");
            String usParola = bundle.getString("Parola");
            String usSpecialitate = bundle.getString("Specialitate");
            String usIdMedic = bundle.getString("idMedic");
            String usSterge = bundle.getString("Sterge");
            String usActualizare = bundle.getString("Actualizare");
            String usIesire = bundle.getString("Inapoi");
            String ussRefresh =bundle.getString("Reincarca");


            DefaultTableModel model = (DefaultTableModel) administratorView.getTable().getModel();
            model.setColumnIdentifiers(new Object[] {usIdUtilizator, usNume,  usParola,  usrol, usSpecialitate});



            administratorView.getLblRol().setText(usrol);
            administratorView.getLblIdUtilizator().setText(usIdUtilizator);
            administratorView.getUpdateButton().setText(usActualizare);
            administratorView.getCancelButton().setText(usIesire);
            administratorView.getInsertButton().setText(usAdauga);
            administratorView.getDeleteButton().setText(usSterge);
            administratorView.getlblidMedic().setText(usIdMedic);
            administratorView.getLblSpecialitate().setText(usSpecialitate);
            administratorView.getLblParola().setText(usParola);
            administratorView.getLblUsername().setText(usNume);
            administratorView.getBtnRefresh().setText(ussRefresh);

        });

        JButton btnFR = this.administratorView.getFR();
        btnFR.addActionListener(e -> {
            Locale.setDefault(new Locale("fr","FR"));
            ResourceBundle.getBundle("MessageBundle");
            languageObservable.setLanguage("fr_FR");
        });
        languageObservable.addObserver((observable, arg) -> {
            String language = (String) arg;
            ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", new Locale(language.substring(0, 2), language.substring(4)));
            // String usCancel = bundle.getString("cancelButton");
            String usrol = bundle.getString("Rol");
            String usIdUtilizator = bundle.getString("IdUtilizator");
            String usAdauga = bundle.getString("Adauga");
            String usNume = bundle.getString("Nume");
            String usParola = bundle.getString("Parola");
            String usSpecialitate = bundle.getString("Specialitate");
            String usIdMedic = bundle.getString("idMedic");
            String usSterge = bundle.getString("Sterge");
            String usActualizare = bundle.getString("Actualizare");
            String usIesire = bundle.getString("Inapoi");
            String ussRefresh =bundle.getString("Reincarca");


            DefaultTableModel model = (DefaultTableModel) administratorView.getTable().getModel();
            model.setColumnIdentifiers(new Object[] {usIdUtilizator, usNume,  usParola,  usrol, usSpecialitate});



            administratorView.getLblRol().setText(usrol);
            administratorView.getLblIdUtilizator().setText(usIdUtilizator);
            administratorView.getUpdateButton().setText(usActualizare);
            administratorView.getCancelButton().setText(usIesire);
            administratorView.getInsertButton().setText(usAdauga);
            administratorView.getDeleteButton().setText(usSterge);
            administratorView.getlblidMedic().setText(usIdMedic);
            administratorView.getLblSpecialitate().setText(usSpecialitate);
            administratorView.getLblParola().setText(usParola);
            administratorView.getLblUsername().setText(usNume);
            administratorView.getBtnRefresh().setText(ussRefresh);




        });

        JButton btnRO = this.administratorView.getRO();
        btnRO.addActionListener(e -> {
            Locale.setDefault(new Locale("ro","RO"));
            ResourceBundle.getBundle("MessageBundle");
            languageObservable.setLanguage("fr_RO");
        });
        languageObservable.addObserver((observable, arg) -> {
            String language = (String) arg;
            ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", new Locale(language.substring(0, 2), language.substring(4)));
            // String usCancel = bundle.getString("cancelButton");
            String usrol = bundle.getString("Rol");
            String usIdUtilizator = bundle.getString("IdUtilizator");
            String usAdauga = bundle.getString("Adauga");
            String usNume = bundle.getString("Nume");
            String usParola = bundle.getString("Parola");
            String usSpecialitate = bundle.getString("Specialitate");
            String usIdMedic = bundle.getString("idMedic");
            String usSterge = bundle.getString("Sterge");
            String usActualizare = bundle.getString("Actualizare");
            String usIesire = bundle.getString("Inapoi");
            String ussRefresh =bundle.getString("Reincarca");


            DefaultTableModel model = (DefaultTableModel) administratorView.getTable().getModel();
            model.setColumnIdentifiers(new Object[] {usIdUtilizator, usNume,  usParola,  usrol, usSpecialitate});



            administratorView.getLblRol().setText(usrol);
            administratorView.getLblIdUtilizator().setText(usIdUtilizator);
            administratorView.getUpdateButton().setText(usActualizare);
            administratorView.getCancelButton().setText(usIesire);
            administratorView.getInsertButton().setText(usAdauga);
            administratorView.getDeleteButton().setText(usSterge);
            administratorView.getlblidMedic().setText(usIdMedic);
            administratorView.getLblSpecialitate().setText(usSpecialitate);
            administratorView.getLblParola().setText(usParola);
            administratorView.getLblUsername().setText(usNume);
            administratorView.getBtnRefresh().setText(ussRefresh);




        });




        JButton btnInsert = administratorView.getInsertButton();
        btnInsert.addActionListener(e -> {
            try {
                adaugareUtilizator();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });
        JButton btnRefresh = administratorView.getBtnRefresh();
        btnRefresh.addActionListener(e -> afisareUtilizatori());


        JButton btnUpdate = administratorView.getUpdateButton();
        btnUpdate.addActionListener(e -> {
            try {
                actualizareUtilizator();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });



        JButton btnCancel = administratorView.getCancelButton();
        btnCancel.addActionListener(e -> administratorView.dispose());
    }


    public void afisareUtilizatori() {
        List<Utilizator> utilizatori = utilizatorPersistenta.getAllUsers();
        System.out.println(utilizatori.size());
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0 && column != 1 && column != 2 && column != 3 && column != 4 && column != 5;
            }
        };
        model.addColumn("id");
        model.addColumn("Nume");
        model.addColumn("Parola");
        model.addColumn("Rol");
        model.addColumn("Specialitate");
        model.addColumn("CNP");


        for (Utilizator u : utilizatori) {

            model.addRow(new Object[]{u.getId(), u.getNumeUtilizator(), u.getParolaUtilizator(), u.getRolUtilizator(), u.getSpecialitate(), u.getCNP()});
            System.out.println(u.getRolUtilizator());
        }

        administratorView.setTable(model);
    }

    public void stergereUtilizator() throws SQLException {
        boolean ok;
        ok = utilizatorPersistenta.stergereUtilizator(Integer.parseInt(administratorView.gettxtIdUtilizator().getText()));
        if (ok) {
            JOptionPane.showMessageDialog(new JFrame("JOptionPane"), "Stergere efectuata cu succes!", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(new JFrame("JOptionPane"), "Stergerea nu s-a efectuat!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void adaugareUtilizator() throws SQLException {
        boolean ok;
        String nume = administratorView.getNameT().getText();
        String parola = administratorView.getPasswordT().getText();
        String rol = administratorView.getRole().getText();
        int id = Integer.parseInt(administratorView.getidT().getText());
        String specialitate = administratorView.getSpecialitate().getText();
        String cnp = administratorView.getTxtCNP().getText();

        Utilizator utl = new Utilizator(nume, parola, rol, id, specialitate, cnp);

        ok = utilizatorPersistenta.adaugareUtilizator(utl);

        if (ok) {
            JOptionPane.showMessageDialog(new JFrame("JOptionPane"), "Adaugare efectuata cu succes!", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(new JFrame("JOptionPane"), "Username deja existent!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void actualizareUtilizator() throws SQLException {
        boolean ok;
        String nume = administratorView.getNameT().getText();
        String parola = administratorView.getPasswordT().getText();
        String rol = administratorView.getRole().getText();
        int id = Integer.parseInt(administratorView.getidT().getText());
        String specialitate = administratorView.getSpecialitate().getText();
        String cnp = administratorView.getTxtCNP().getText();
        Utilizator utl = new Utilizator(nume, parola, rol, id, specialitate, cnp);

        ok = utilizatorPersistenta.actualizareUtilizator(utl);


        if(ok) {
            JOptionPane.showMessageDialog(new JFrame("JOptionPane"),"Actualizare efectuata cu succes!","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(new JFrame("JOptionPane"),"Actualizarea nu s-a efectuat!","Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }


        public void showAdminGUI () {
            afisareUtilizatori();
            administratorView.setVisible(true);
        }


    }

