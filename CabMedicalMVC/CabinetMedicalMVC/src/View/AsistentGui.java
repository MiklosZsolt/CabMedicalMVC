package View;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class AsistentGui extends JFrame {
    private JPanel mainPanel;
    private JPanel panelAsistent = new JPanel();
    private JTable table = new JTable();
    private JButton insertButton;
    private JButton deleteButton;
    private JButton updateButton;
    private JButton cancelButton;
    private JButton btnFiltration;
    private JButton btnRefresh = new JButton("Reincarca");
    private JScrollPane scrollPane = new JScrollPane();

    private DefaultTableModel tableModel;
    private JLabel lblId = new JLabel("ID:");
    private JTextField txtId = new JTextField();
    private JLabel lblCNP = new JLabel("CNP:");
    private JTextField txtCNP = new JTextField();
    private JLabel lblNume = new JLabel("Nume:");
    private JTextField txtNume = new JTextField();
    private JLabel lblVarsta = new JLabel("Varsta:");
    private JTextField txtVarsta = new JTextField();
    private JLabel lblMedic = new JLabel("Medic:");
    private JTextField txtMedic = new JTextField();
    private JLabel Filtration = new JLabel("Filtrare:");
    private JLabel lblDiagnostic = new JLabel("Diagnostic:");
    private JTextField txtDiagnostic = new JTextField();

    private JLabel lblVarstafiltrare = new JLabel("Varsta2:");
    private JTextField txtVarstafiltrare = new JTextField();
    private JButton eng= new JButton();
    private JButton sp= new JButton();
    private JButton fr= new JButton();
    private JButton ro= new JButton();






    public AsistentGui() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        initComponents();
        JPanel MainPanel = new JPanel(new BorderLayout());
        MainPanel.add(panelAsistent, BorderLayout.CENTER);
        setContentPane(MainPanel);
        setTitle("Fereastra Asistent");
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
       // cancelButton = new JButton("Inapoi");
       // buttonsPanel.add(cancelButton);
        btnFiltration = new JButton("Filtrare");
        buttonsPanel.add(btnFiltration);
        buttonsPanel.add(btnRefresh);
        buttonsPanel.add(verticalSpacer);

        eng = new JButton("ENG");
        buttonsPanel.add(eng);
        sp =new JButton("SP");
        buttonsPanel.add(sp);
        fr = new JButton("FR");
        buttonsPanel.add(fr);
        ro = new JButton("RO");
        buttonsPanel.add(ro);

        JPanel topPanel = new JPanel(new BorderLayout());
        //JLabel titleLabel = new JLabel("Asistent", SwingConstants.CENTER);
       // titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
       // topPanel.add(titleLabel, BorderLayout.CENTER);
        topPanel.add(buttonsPanel, BorderLayout.EAST);
        //JLabel filtrationLabel = new JLabel("Filtration");
        //mainPanel.add(filtrationLabel, BorderLayout.NORTH);

        JPanel fieldsPanel = new JPanel(new GridLayout(9, 2));
        fieldsPanel.add(lblId);
        fieldsPanel.add(txtId);
        fieldsPanel.add(lblCNP);
        fieldsPanel.add(txtCNP);
        fieldsPanel.add(lblNume);
        fieldsPanel.add(txtNume);
        fieldsPanel.add(lblVarsta);
        fieldsPanel.add(txtVarsta);
        fieldsPanel.add(lblMedic);
        fieldsPanel.add(txtMedic);
        fieldsPanel.add(lblDiagnostic);
        fieldsPanel.add(txtDiagnostic);
        fieldsPanel.add(lblVarstafiltrare);
        fieldsPanel.add(txtVarstafiltrare);


        panelAsistent.setLayout(new BorderLayout());
        panelAsistent.add(topPanel, BorderLayout.NORTH);
        panelAsistent.add(mainPanel, BorderLayout.CENTER);
        panelAsistent.add(fieldsPanel, BorderLayout.SOUTH);

    }

    public void setTable(DefaultTableModel model) {
        table.setModel(model);
    }
    public JButton getInsertButton() {
        return insertButton;
    }

    public JTextField getTxtCNP() {
        return txtCNP;
    }
    public JTextField getTxtNume() {
        return txtNume;
    }
    public JTextField getTxtId() {
        return txtId;
    }
    public JTextField getTxtVarsta() {
        return txtVarsta;
    }
    public JButton getBtnRefresh(){
        return btnRefresh;
    }
    public JButton getUpdateButton(){
        return updateButton;
    }
    public JButton getDeleteButton(){
        return deleteButton;
    }
    public JTextField getTxtMedic(){
        return txtMedic;
    }
    public JTextField getTxtDiagnostic(){
        return txtDiagnostic;
    }
    public JTextField getTxtVarstafiltrare(){
        return txtVarstafiltrare;
    }
    public JButton getBtnFiltration(){
        return btnFiltration;
    }
    public JButton getEngButton(){
        return eng;
    }
    public JTable getTable()
    {
        return table;
    }

    public JLabel getLblId(){
        return lblId;
    }
    public JLabel getLblNume(){
        return lblNume;
    }
    public JLabel getLblVarsta(){
        return lblVarsta;
    }
    public JLabel getlblMedic(){
        return lblMedic;
    }
    public JLabel getLblDiagnostic(){
        return lblDiagnostic;
    }
    public JButton getSP(){
        return sp;
    }
    public JButton getCancelButton(){
        return cancelButton;
    }
    public JButton getFR(){
        return fr;
    }
    public JButton getRO(){return ro;}


}
