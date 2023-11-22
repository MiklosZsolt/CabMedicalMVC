package Controller;

import Model.LanguageObservable;
import Model.UtilizatorPersistenta;
import Model.Utilizator;

import View.LoginGui;

import javax.swing.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class LoginController {
    private final LoginGui loginView;
    private final UtilizatorPersistenta utilizatorPersistenta;
    private final LanguageObservable languageObservable;

    public LoginController() {
        this.loginView = new LoginGui();
        this.utilizatorPersistenta = new UtilizatorPersistenta();
        this.languageObservable = new LanguageObservable();

        JButton btnEnglish = this.loginView.getEng();
        btnEnglish.addActionListener(e -> {
            Locale.setDefault(new Locale("en","US"));
            ResourceBundle.getBundle("MessageBundle");
            languageObservable.setLanguage("en_US");
        });

        languageObservable.addObserver((observable, arg) -> {
            String language = (String) arg;
            ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", new Locale(language.substring(0, 2), language.substring(4)));
           // String usCancel = bundle.getString("cancelButton");
            String usLogin = bundle.getString("Logare");
           // String usLoginForm = bundle.getString("autentificareutilizator");
            String usnumeUtilizator = bundle.getString("Nume");
            String parola = bundle.getString("Parola");

           // loginView.getbtn().setText(usCancel);
            loginView.getLoginButton().setText(usLogin);
            loginView.getlblUsername().setText(usnumeUtilizator);
            loginView.getPasswordLabel().setText(parola);
            //loginView.getlbLoginForm().setText(usLoginForm);
        });
        JButton btnRO = this.loginView.getRO();
        btnRO.addActionListener(e -> {
            Locale.setDefault(new Locale("ro","RO"));
            ResourceBundle.getBundle("MessageBundle");
            languageObservable.setLanguage("ro_RO");
        });

        languageObservable.addObserver((observable, arg) -> {
            String language = (String) arg;
            ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", new Locale(language.substring(0, 2), language.substring(4)));
            // String usCancel = bundle.getString("cancelButton");
            String usLogin = bundle.getString("Logare");
            // String usLoginForm = bundle.getString("autentificareutilizator");
            String usnumeUtilizator = bundle.getString("Nume");
            String parola = bundle.getString("Parola");

            // loginView.getbtn().setText(usCancel);
            loginView.getLoginButton().setText(usLogin);
            loginView.getlblUsername().setText(usnumeUtilizator);
            loginView.getPasswordLabel().setText(parola);
            //loginView.getlbLoginForm().setText(usLoginForm);
        });


        JButton btnFR = this.loginView.getFR();
        btnFR.addActionListener(e -> {
            Locale.setDefault(new Locale("fr","FR"));
            ResourceBundle.getBundle("MessageBundle");
            languageObservable.setLanguage("fr_FR");
        });

        languageObservable.addObserver((observable, arg) -> {
            String language = (String) arg;
            ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", new Locale(language.substring(0, 2), language.substring(4)));
            // String usCancel = bundle.getString("cancelButton");
            String usLogin = bundle.getString("Logare");
            // String usLoginForm = bundle.getString("autentificareutilizator");
            String usnumeUtilizator = bundle.getString("Nume");
            String parola = bundle.getString("Parola");

            // loginView.getbtn().setText(usCancel);
            loginView.getLoginButton().setText(usLogin);
            loginView.getlblUsername().setText(usnumeUtilizator);
            loginView.getPasswordLabel().setText(parola);
            //loginView.getlbLoginForm().setText(usLoginForm);
        });

        JButton btnSpanish = this.loginView.getSP();
        btnSpanish.addActionListener(e -> {
            Locale.setDefault(new Locale("sp","SP"));
            ResourceBundle.getBundle("MessageBundle");
            languageObservable.setLanguage("sp_SP");
        });

        languageObservable.addObserver((observable, arg) -> {
            String language = (String) arg;
            ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", new Locale(language.substring(0, 2), language.substring(4)));
            // String usCancel = bundle.getString("cancelButton");
            String usLogin = bundle.getString("Logare");
            // String usLoginForm = bundle.getString("autentificareutilizator");
            String usnumeUtilizator = bundle.getString("Nume");
            String parola = bundle.getString("Parola");

            // loginView.getbtn().setText(usCancel);
            loginView.getLoginButton().setText(usLogin);
            loginView.getlblUsername().setText(usnumeUtilizator);
            loginView.getPasswordLabel().setText(parola);
            //loginView.getlbLoginForm().setText(usLoginForm);
        });




        JButton loginButton = loginView.getLoginButton();
        loginButton.addActionListener(e -> {
            String numeUtilizator = loginView.getUsernameField().getText();
            String parola = new String(loginView.getPasswordField().getPassword());

            Utilizator utilizator = utilizatorPersistenta.getAuthenticatedUser(numeUtilizator, parola);

            if (utilizator == null) {
                loginView.showErrorMessage("Utilizatorul nu exista!");
            } else if (!utilizator.getParola().equals(parola)) {
                loginView.showErrorMessage("Parola incorecta!");
            } else {
                if (utilizator.getRolUtilizator().equals("admin")) {
                    AdministratorController administratorController = new AdministratorController();
                    administratorController.showAdminGUI();
                    loginView.dispose();
                    loginView.showSuccessMessage();
                }
                if (utilizator.getRolUtilizator().equals("asistent")) {
                    AsistentController asistentController = new AsistentController();
                    asistentController.showAsistentGui();
                    loginView.dispose();
                    loginView.showSuccessMessage();
                }
                if (utilizator.getRolUtilizator().equals("medic")) {
                    MedicController medicController = new MedicController();
                    medicController.showMedicGui();
                    loginView.dispose();
                    loginView.showSuccessMessage();
                }




            }


        });
    }
    public void showLoginGUI() {
        loginView.setVisible(true);
    }
}
