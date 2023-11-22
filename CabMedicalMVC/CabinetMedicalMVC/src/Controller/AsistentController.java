package Controller;

import Model.LanguageObservable;
import Model.Pacient;
import Model.UtilizatorPersistenta;
import View.AsistentGui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class AsistentController {
    public final AsistentGui asistentview;
    public final UtilizatorPersistenta utilizatorPersistenta;
    private final LanguageObservable languageObservable;


    public AsistentController(){
        this.asistentview = new AsistentGui();
        this.utilizatorPersistenta = new UtilizatorPersistenta();
        this.languageObservable = new LanguageObservable();

        JButton btnENG = this.asistentview.getEngButton();
        btnENG.addActionListener(e -> {
            Locale.setDefault(new Locale("en","US"));
            ResourceBundle.getBundle("MessageBundle");
            languageObservable.setLanguage("en_US");
        });

        languageObservable.addObserver((observable, arg) -> {
            String language = (String) arg;
            ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", new Locale(language.substring(0, 2), language.substring(4)));
            // String usCancel = bundle.getString("cancelButton");
            String usIdUtilizator = bundle.getString("IdUtilizator");
            String usAdauga = bundle.getString("Adauga");
            String usNume = bundle.getString("Nume");
            String usParola = bundle.getString("Parola");
            String usSpecialitate = bundle.getString("Specialitate");
            String usIdMedic = bundle.getString("idMedic");
            String usSterge = bundle.getString("Sterge");
            String usActualizare = bundle.getString("Actualizare");
           // String usIesire = bundle.getString("Inapoi");
            String ussRefresh =bundle.getString("Reincarca");
            String usFiltration =bundle.getString("Filtrare");
            String usVarsta =bundle.getString("Varsta");
            String usDiagnostic = bundle.getString("Diagnostic");


            DefaultTableModel model = (DefaultTableModel) asistentview.getTable().getModel();
            model.setColumnIdentifiers(new Object[] {usIdUtilizator, usNume,  usParola,  usVarsta});



            asistentview.getLblId().setText(usIdUtilizator);
            asistentview.getUpdateButton().setText(usActualizare);
            asistentview.getInsertButton().setText(usAdauga);
            asistentview.getDeleteButton().setText(usSterge);
            asistentview.getlblMedic().setText(usIdMedic);
            asistentview.getLblNume().setText(usNume);
            asistentview.getBtnRefresh().setText(ussRefresh);
            asistentview.getLblVarsta().setText(usVarsta);
            asistentview.getBtnFiltration().setText(usFiltration);
            asistentview.getLblDiagnostic().setText(usDiagnostic);
            //asistentview.getCancelButton().setText(usIesire);



        });
        JButton btnFR = this.asistentview.getFR();
        btnFR.addActionListener(e -> {
            Locale.setDefault(new Locale("fr","FR"));
            ResourceBundle.getBundle("MessageBundle");
            languageObservable.setLanguage("fr_FR");
        });

        languageObservable.addObserver((observable, arg) -> {
            String language = (String) arg;
            ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", new Locale(language.substring(0, 2), language.substring(4)));
            // String usCancel = bundle.getString("cancelButton");
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
            String usFiltration =bundle.getString("Filtrare");
            String usVarsta =bundle.getString("Varsta");
            String usDiagnostic = bundle.getString("Diagnostic");
            //String usCNP = bundle.getString("CNP");


            DefaultTableModel model = (DefaultTableModel) asistentview.getTable().getModel();
            model.setColumnIdentifiers(new Object[] {usIdUtilizator, usNume,  usParola,  usVarsta});



            asistentview.getLblId().setText(usIdUtilizator);
            asistentview.getUpdateButton().setText(usActualizare);
            asistentview.getInsertButton().setText(usAdauga);
            asistentview.getDeleteButton().setText(usSterge);
            asistentview.getlblMedic().setText(usIdMedic);
            asistentview.getLblNume().setText(usNume);
            asistentview.getBtnRefresh().setText(ussRefresh);
            asistentview.getLblVarsta().setText(usVarsta);
            asistentview.getBtnFiltration().setText(usFiltration);
            asistentview.getLblDiagnostic().setText(usDiagnostic);
            //asistentview.getlbl


        });


        JButton btnSpanish = this.asistentview.getSP();
        btnSpanish.addActionListener(e -> {
            Locale.setDefault(new Locale("sp","SP"));
            ResourceBundle.getBundle("MessageBundle");
            languageObservable.setLanguage("sp_SP");
        });
        languageObservable.addObserver((observable, arg) -> {
            String language = (String) arg;
            ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", new Locale(language.substring(0, 2), language.substring(4)));
            // String usCancel = bundle.getString("cancelButton");
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
            String usFiltration =bundle.getString("Filtrare");
            String usVarsta =bundle.getString("Varsta");
            String usDiagnostic = bundle.getString("Diagnostic");


            DefaultTableModel model = (DefaultTableModel) asistentview.getTable().getModel();
            model.setColumnIdentifiers(new Object[] {usIdUtilizator, usNume,  usParola,  usVarsta});



            asistentview.getLblId().setText(usIdUtilizator);
            asistentview.getUpdateButton().setText(usActualizare);
            asistentview.getInsertButton().setText(usAdauga);
            asistentview.getDeleteButton().setText(usSterge);
            asistentview.getlblMedic().setText(usIdMedic);
            asistentview.getLblNume().setText(usNume);
            asistentview.getBtnRefresh().setText(ussRefresh);
            asistentview.getLblVarsta().setText(usVarsta);
            asistentview.getBtnFiltration().setText(usFiltration);
            asistentview.getLblDiagnostic().setText(usDiagnostic);
          //  asistentview.getCancelButton().setText(usIesire);


        });


        JButton btnRO = this.asistentview.getRO();
        btnRO.addActionListener(e -> {
            Locale.setDefault(new Locale("ro","RO"));
            ResourceBundle.getBundle("MessageBundle");
            languageObservable.setLanguage("ro_RO");
        });
        languageObservable.addObserver((observable, arg) -> {
            String language = (String) arg;
            ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", new Locale(language.substring(0, 2), language.substring(4)));
            // String usCancel = bundle.getString("cancelButton");
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
            String usFiltration =bundle.getString("Filtrare");
            String usVarsta =bundle.getString("Varsta");
            String usDiagnostic = bundle.getString("Diagnostic");


            DefaultTableModel model = (DefaultTableModel) asistentview.getTable().getModel();
            model.setColumnIdentifiers(new Object[] {usIdUtilizator, usNume,  usParola,  usVarsta});



            asistentview.getLblId().setText(usIdUtilizator);
            asistentview.getUpdateButton().setText(usActualizare);
            asistentview.getInsertButton().setText(usAdauga);
            asistentview.getDeleteButton().setText(usSterge);
            asistentview.getlblMedic().setText(usIdMedic);
            asistentview.getLblNume().setText(usNume);
            asistentview.getBtnRefresh().setText(ussRefresh);
            asistentview.getLblVarsta().setText(usVarsta);
            asistentview.getBtnFiltration().setText(usFiltration);
            asistentview.getLblDiagnostic().setText(usDiagnostic);
           // asistentview.get().setText(usIesire);


        });


        JButton btnRefresh = asistentview.getBtnRefresh();
        btnRefresh.addActionListener(e -> afisarePacienti());

        JButton btnInsert = asistentview.getInsertButton();
        btnInsert.addActionListener(e -> {
            try {
                adaugaPacient();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });
        JButton btnFiltrare = asistentview.getBtnFiltration();
        btnFiltrare.addActionListener(e -> afisarePacientiFiltrati());

        JButton btnUpdate = asistentview.getUpdateButton();
        btnUpdate.addActionListener(e -> {
            try {
                actualizarePacient();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });

        JButton btnSterge = asistentview.getDeleteButton();
        btnSterge.addActionListener(e -> {
            try {
                stergePacient();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    public void afisarePacienti() {
        List<Pacient> pacienti = utilizatorPersistenta.getAllPatient();
        System.out.println(pacienti.size());
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0 && column != 1 && column != 2 && column != 3;
            }
        };
        model.addColumn("id");
        model.addColumn("CNP");
        model.addColumn("Nume");
        model.addColumn("Varsta");



        for (Pacient u : pacienti) {

            model.addRow(new Object[]{u.getId(), u.getCNP(), u.getNume(), u.getVarsta()});

        }

        asistentview.setTable(model);
    }
    public void afisarePacientiFiltrati() {
        String numeMedic = asistentview.getTxtMedic().getText();
        String diagnostic = asistentview.getTxtDiagnostic().getText();
        String varstaText = asistentview.getTxtVarstafiltrare().getText();
        int varsta = 0;

        System.out.println(numeMedic + diagnostic + varstaText);

        if (!varstaText.isEmpty()) {
            try {
                varsta = Integer.parseInt(varstaText);
            } catch (NumberFormatException e) {
                System.out.println("Varsta introdusa nu este un numar valid. Se va folosi valoarea 0.");
            }
        }

        List<Pacient> pacienti;
        try {
            pacienti = utilizatorPersistenta.filtrarePacienti(numeMedic, diagnostic, varsta);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (pacienti.isEmpty()) {
            System.out.println("Lista de pacienti este goala.");
        }

        System.out.println(pacienti.size());
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0 && column != 1 && column != 2 && column != 3;
            }
        };
        model.addColumn("id");
        model.addColumn("CNP");
        model.addColumn("Nume");
        model.addColumn("Varsta");

        for (Pacient u : pacienti) {
            model.addRow(new Object[]{u.getId(), u.getCNP(), u.getNume(), u.getVarsta()});
        }

        asistentview.setTable(model);
    }


    public void adaugaPacient() throws SQLException {
        boolean ok;
        String nume = asistentview.getTxtNume().getText();
        int id = Integer.parseInt(asistentview.getTxtId().getText());
        int cnp = Integer.parseInt(asistentview.getTxtCNP().getText());
        int varsta = Integer.parseInt(asistentview.getTxtVarsta().getText());

        Pacient pacient = new Pacient(id, cnp, nume, varsta);

        ok = utilizatorPersistenta.adaugaPacient(pacient);

        if (ok) {
            JOptionPane.showMessageDialog(new JFrame("JOptionPane"), "Adaugare efectuata cu succes!", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(new JFrame("JOptionPane"), "Username deja existent!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void actualizarePacient() throws SQLException {
        boolean ok;
        int id = Integer.parseInt(asistentview.getTxtId().getText());
        String nume = asistentview.getTxtNume().getText();
        int varsta = Integer.parseInt(asistentview.getTxtVarsta().getText());



        Pacient pacient = new Pacient(id, nume, varsta);

        ok = utilizatorPersistenta.actualizarePacient(pacient);


        if(ok) {
            JOptionPane.showMessageDialog(new JFrame("JOptionPane"),"Actualizare efectuata cu succes!","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(new JFrame("JOptionPane"),"Actualizarea nu s-a efectuat!","Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void stergePacient() throws SQLException {
        boolean ok;
        ok = utilizatorPersistenta.stergePacient(Integer.parseInt(asistentview.getTxtId().getText()));
        if (ok) {
            JOptionPane.showMessageDialog(new JFrame("JOptionPane"), "Stergere efectuata cu succes!", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(new JFrame("JOptionPane"), "Stergerea nu s-a efectuat!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void showAsistentGui () {
        afisarePacienti();
        asistentview.setVisible(true);
    }
}
