package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MedicGui extends JFrame{
    private JPanel mainPanel;
    private JPanel panelMedic = new JPanel();
    private JTable table = new JTable();
    private JButton insertButton;
    private JButton deleteButton;
    private JButton updateButton;
    private JButton cancelButton;
    private JButton FiltrateButton;
    private JButton okButton;
    private JButton eng;
    private JButton btnRefresh = new JButton("Reincarca");
    private JButton btnAdauga = new JButton("Adauga");
    private JButton btnActualizeaza = new JButton("Actualizeaza");
    private JButton btnSterge = new JButton("Sterge");

    private JScrollPane scrollPane = new JScrollPane();

    private DefaultTableModel tableModel;
    private JLabel lblUsername = new JLabel("Nume");
    private JTextField txtUsername = new JTextField();
    private JLabel lbl = new JLabel("Parola");
    private JTextField txtParola = new JTextField();
    private JLabel lblSimptome = new JLabel("Simptome");
    private JTextField txtSimptome = new JTextField();
    private JLabel lblIdUtilizator = new JLabel("idPacient");
    private JTextField txtIdUtilizator = new JTextField();
    private JLabel lblTratament = new JLabel("Tratament");
    private JTextField txtTratament = new JTextField();
    private JLabel lblDiagnostic = new JLabel("Diagnostic");
    private JTextField txtDiagnostic = new JTextField();
    private JLabel lblIdMedic = new JLabel("idMedic");
    private JTextField txtIdMedic = new JTextField();
    private JButton sp = new JButton("SP");
    private JButton fr = new JButton("FR");
    private JButton ro = new JButton("RO");




    public MedicGui() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        initComponents();
        JPanel MainPanel = new JPanel(new BorderLayout());
        MainPanel.add(panelMedic, BorderLayout.CENTER);
        setContentPane(MainPanel);
        setTitle("Fereastra Medic");
    }

    protected void initComponents() {
        Component verticalSpacer = Box.createVerticalStrut(20);

        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        mainPanel = new JPanel(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(table);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

       // insertButton = new JButton("Adauga");
       // buttonsPanel.add(insertButton);
       // deleteButton = new JButton("Sterge");
       // buttonsPanel.add(deleteButton);
        updateButton = new JButton("Actualizeaza");
        buttonsPanel.add(updateButton);
        //cancelButton = new JButton("Inapoi");
       // buttonsPanel.add(cancelButton);
        okButton = new JButton("OK");
        buttonsPanel.add(okButton);
        buttonsPanel.add(btnRefresh);
        FiltrateButton = new JButton("Filtrare");
        buttonsPanel.add(FiltrateButton);
        buttonsPanel.add(verticalSpacer);
        eng = new JButton("ENG");
        buttonsPanel.add(eng);
        sp = new JButton("SP");
        buttonsPanel.add(sp);
        fr = new JButton("FR");
        buttonsPanel.add(fr);
        ro = new JButton("RO");
        buttonsPanel.add(ro);


        JPanel topPanel = new JPanel(new BorderLayout());
        // JLabel titleLabel = new JLabel("Utilizatori", SwingConstants.CENTER);
      //  titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
      //  topPanel.add(titleLabel, BorderLayout.CENTER);
        topPanel.add(buttonsPanel, BorderLayout.EAST);

        JPanel fieldsPanel = new JPanel(new GridLayout(11, 3));
        fieldsPanel.add(lblIdUtilizator);
        fieldsPanel.add(txtIdUtilizator);
        fieldsPanel.add(lblUsername);
        fieldsPanel.add(txtUsername);
        fieldsPanel.add(lblTratament);
        fieldsPanel.add(txtTratament);
        fieldsPanel.add(lblDiagnostic);
        fieldsPanel.add(txtDiagnostic);
        fieldsPanel.add(lblSimptome);
        fieldsPanel.add(txtSimptome);
        fieldsPanel.add(lblIdMedic);
        fieldsPanel.add(txtIdMedic);

        panelMedic.setLayout(new BorderLayout());
        panelMedic.add(topPanel, BorderLayout.NORTH);
        panelMedic.add(mainPanel, BorderLayout.CENTER);
        panelMedic.add(fieldsPanel, BorderLayout.SOUTH);
    }

    public JTextField getTxtUsername(){
        return txtUsername;
    }
    public JTextField getTxtParola(){
        return txtParola;
    }
    public JButton getOkButton(){
        return okButton;
    }
    public JTextField getTxtIdMedic(){
        return txtIdMedic;
    }


    public void setTable(DefaultTableModel model) {
        // seteaza modelul tabelului
        table.setModel(model);
    }

    public JButton getBtnRefresh() {
        return  btnRefresh;
    }
    public JButton getUpdateButton(){
        return updateButton;
    }
    public JTextField getTxtIdUtilizator(){
        return txtIdUtilizator;
    }
    public JTextField getTxtDiagnostic(){
        return txtDiagnostic;
    }
    public JTextField getTxtSimptome(){
        return txtSimptome;
    }
    public JTextField getTxtTratament(){
        return txtTratament;
    }
    public JButton getFiltrateButton(){
        return FiltrateButton;
    }


    public JButton getEng() {
        return eng;
    }
    public JTable getTable()
    {
        return table;
    }
    public JButton getInsertButton(){
        return insertButton;
    }
    public JButton getDeleteButton(){
        return deleteButton;
    }
    public JLabel getLblDiagnostic(){
        return lblDiagnostic;
    }
    public JLabel getLblUsername(){
        return lblUsername;
    }
    public JLabel getLblSimptome(){
        return lblSimptome;
    }
    public JLabel getLblIdMedic(){
        return lblIdMedic;
    }public JLabel getLblTratament(){
        return lblTratament;
    }
    public JLabel getLblIdUtilizator(){
        return lblIdUtilizator;
    }
    public JButton getCancelButton(){
        return cancelButton;
    }
    public JButton getSP(){
        return sp;
    }
    public JButton getFR(){
        return fr;
    }


}
