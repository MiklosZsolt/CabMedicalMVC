package View;

import javax.swing.*;
import java.awt.*;

public class LoginGui extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton eng = new JButton("ENG");
    private JButton sp = new JButton("SP");
    private JButton fr = new JButton("FR");
    private JButton ro = new JButton("RO");
    JLabel usernameLabel;
    JLabel passwordLabel;



    public LoginGui() {
        super("Login");

        // set up the login form components
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(5, 2));
        usernameLabel = new JLabel("Nume: ");
        usernameField = new JTextField();
        passwordLabel = new JLabel("Parola: ");
        passwordField = new JPasswordField();
        loginButton = new JButton("Logare");


        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);
        loginPanel.add(eng);
        loginPanel.add(sp);
        loginPanel.add(fr);
        loginPanel.add(ro);

        // set up the main frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 150));
        setResizable(false);
        setContentPane(loginPanel);
        pack();
        setLocationRelativeTo(null);
    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void showSuccessMessage() {
        JOptionPane.showMessageDialog(this, "Login successful!");
    }

    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public JButton getLoginButton() {
      return loginButton;
    }
    public JButton getEng(){return eng;}

    public JLabel getlblUsername() {
        return usernameLabel;
    }

    public JLabel getPasswordLabel() {
        return passwordLabel;
    }
    public JButton getSP(){
        return sp;
    }
    public JButton getFR(){
        return fr;
    }
    public JButton getRO(){
        return ro;
    }




}







