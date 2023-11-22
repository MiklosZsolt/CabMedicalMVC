import Controller.LoginController;
import Model.ConnectareBD;
import Model.UtilizatorPersistenta;
//import View.LoginView;

import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
       LoginController loginController = new LoginController();
       loginController.showLoginGUI();
    }
}