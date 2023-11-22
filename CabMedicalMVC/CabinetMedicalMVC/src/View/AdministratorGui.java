package View;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class AdministratorGui extends JFrame {
    private JPanel mainPanel;
    private JPanel panelAdministrator = new JPanel();
    private JTable table = new JTable();
    private JButton insertButton;
    private JButton eng = new JButton("ENG");
    private JButton deleteButton;
    private JButton updateButton;
    private JButton cancelButton;
    private JButton okButton;
    private JButton btnRefresh = new JButton("Reincarca");
    private JButton btnAdauga = new JButton("Adauga");
    private JButton btnActualizeaza = new JButton("Actualizare");
    private JButton btnSterge = new JButton("Sterge");
    private JButton sp = new JButton("SP");
    private JButton fr = new JButton("FR");
    private JButton ro = new JButton("RO");



    private JScrollPane scrollPane = new JScrollPane();

    private DefaultTableModel tableModel;
    private JLabel lblUsername = new JLabel("Nume:");
    private JTextField txtUsername = new JTextField();
    private JLabel lblParola = new JLabel("Parola:");
    private JTextField txtParola = new JTextField();
    private JLabel lblRol = new JLabel("Rol:");
    private JTextField txtRol = new JTextField();
    private JLabel lblIdUtilizator = new JLabel("IdUtilizator");
    private JTextField txtIdUtilizator = new JTextField();
    private JLabel lblSpecialitate = new JLabel("Specialitate:");
    private JTextField txtSpecialitate = new JTextField();
    private JLabel lblCNP = new JLabel("CNP");
    private JTextField txtCNP = new JTextField();
    private JLabel lblidMedic = new JLabel("idMedic");
    private JTextField txtidMedic = new JTextField();


    public AdministratorGui() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        initComponents();
        JPanel MainPanel = new JPanel(new BorderLayout());
        MainPanel.add(panelAdministrator, BorderLayout.CENTER);
        setContentPane(MainPanel);
        setTitle("Fereastra Administrator");
    }

    protected void initComponents() {
        Component verticalSpacer = Box.createVerticalStrut(20);

        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        mainPanel = new JPanel(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(table);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        insertButton = new JButton("Adauga");
        buttonsPanel.add(insertButton);
        deleteButton = new JButton("Sterge");
        buttonsPanel.add(deleteButton);
        updateButton = new JButton("Actualizeaza");
        buttonsPanel.add(updateButton);
        cancelButton = new JButton("Inapoi");
        buttonsPanel.add(cancelButton);
        okButton = new JButton("OK");
        eng = new JButton("ENG");
        sp = new JButton("SP");
        buttonsPanel.add(okButton);
        buttonsPanel.add(btnRefresh);
        buttonsPanel.add(verticalSpacer);
        buttonsPanel.add(sp);
        buttonsPanel.add(eng);
        buttonsPanel.add(fr);
        buttonsPanel.add(ro);



        JPanel topPanel = new JPanel(new BorderLayout());
       // JLabel titleLabel = new JLabel(SwingConstants.CENTER);
       // titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
      //  topPanel.add(titleLabel, BorderLayout.CENTER);
        topPanel.add(buttonsPanel, BorderLayout.EAST);

        JPanel fieldsPanel = new JPanel(new GridLayout(11, 3));
        fieldsPanel.add(lblIdUtilizator);
        fieldsPanel.add(txtIdUtilizator);
        fieldsPanel.add(lblUsername);
        fieldsPanel.add(txtUsername);
        fieldsPanel.add(lblParola);
        fieldsPanel.add(txtParola);
        fieldsPanel.add(lblRol);
        fieldsPanel.add(txtRol);
        fieldsPanel.add(lblSpecialitate);
        fieldsPanel.add(txtSpecialitate);
        fieldsPanel.add(lblCNP);
        fieldsPanel.add(txtCNP);
        fieldsPanel.add(lblidMedic);
        fieldsPanel.add(txtidMedic);

        panelAdministrator.setLayout(new BorderLayout());
        panelAdministrator.add(topPanel, BorderLayout.NORTH);
        panelAdministrator.add(mainPanel, BorderLayout.CENTER);
        panelAdministrator.add(fieldsPanel, BorderLayout.SOUTH);
    }

    public void setTable(DefaultTableModel model) {
        // seteaza modelul tabelului
        table.setModel(model);
    }
    public JButton getDeleteButton() {
        return deleteButton;
    }
    public JButton getBtnRefresh() {
        return btnRefresh;
    }

    public JTextField gettxtIdUtilizator() {
        return txtIdUtilizator;
    }
    public JButton getInsertButton() {
        return insertButton;
    }

    public JTextField getNameT() {
        return txtUsername;
    }

    public JTextField getPasswordT() {
        return txtParola;
    }
    public JTextField getRole(){
        return txtRol;
    }

    public JTextField getidT() {
        return txtIdUtilizator;
    }
    public JButton getUpdateButton() {
        return updateButton;
    }
    public JButton getCancelButton() {
        return cancelButton;
    }

    public JTextField getSpecialitate() {
        return txtSpecialitate;
    }

    public JTextField getTxtCNP() {
        return txtCNP;
    }
    public JButton getEngButton(){
        return eng;
    }
    public JLabel getLblUsername() {
        return lblUsername;
    }
    public JLabel getLblIdUtilizator() {
        return lblIdUtilizator;
    }
    public JLabel getLblRol() {
        return lblRol;
    }
    public JButton getBtnCancel() {
        return cancelButton;
    }
    public JButton getBtnActualizeaza() {
        return btnActualizeaza;
    }
    public JButton getBtnAdauga() {
        return btnAdauga;
    }
    public JButton getBtnSterge() {
        return btnSterge;
    }
    public JLabel getlblidMedic() {
        return lblidMedic;
    }
    public JLabel getLblSpecialitate() {
        return lblSpecialitate;
    }
    public JLabel getLblParola() {
        return lblParola;
    }

    public JTable getTable()
    {
        return table;
    }
    public JButton getSP()
    {
        return sp;
    }
    public JButton getFR()
    {
        return fr;
    }
    public JButton getRO()
    {
        return ro;
    }


}
