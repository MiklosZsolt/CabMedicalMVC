package Model;

public class Consultatii{
    private int idpacienti;
    private int idmedic;
    private int idconsultatie;
    private  String dataconsultatie;
    private String simptome;
    private String diagnostic;
    private String tratament;

    public Consultatii(int idpacienti, int idmedic, int idconsultatie, String dataconsultatie, String simptome, String diagnostic, String tratament) {
        this.idpacienti = idpacienti;
        this.idmedic = idmedic;
        this.idconsultatie = idconsultatie;
        this.dataconsultatie = dataconsultatie;
        this.simptome = simptome;
        this.diagnostic = diagnostic;
        this.tratament = tratament;
    }
//    public Consultatii(int id, String nume, String simptome, String diagnostic, String tratament) {
//        super();
//        this.setId(id);
//        this.setNume(nume);
//        this.setSimptome(simptome);
//        this.setDiagnostic(diagnostic);
//        this.setTratament(tratament);
//    }


    public Consultatii() {
    }

    public Consultatii(int id, String nume, String diagnostic, String tratament, String simptome) {
    }

    public Consultatii(int id, String diagnostic, String tratament, String simptome) {
        this.idpacienti = id;
        this.diagnostic = diagnostic;
        this.tratament = tratament;
        this.simptome =simptome;
    }

    public int getIdpacienti() {
        return idpacienti;
    }

    public void setIdpacienti(int idpacienti) {
        this.idpacienti = idpacienti;
    }

    public int getIdmedic() {
        return idmedic;
    }

    public void setIdmedic(int idmedic) {
        this.idmedic = idmedic;
    }

    public int getIdconsultatie() {
        return idconsultatie;
    }

    public void setIdconsultatie(int idconsultatie) {
        this.idconsultatie = idconsultatie;
    }

    public String getDataconsultatie() {
        return dataconsultatie;
    }

    public void setDataconsultatie(String dataconsultatie) {
        this.dataconsultatie = dataconsultatie;
    }

    public String getSimptome() {
        return simptome;
    }

    public void setSimptome(String simptome) {
        this.simptome = simptome;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getTratament() {
        return tratament;
    }

    public void setTratament(String tratament) {
        this.tratament = tratament;
    }
}
