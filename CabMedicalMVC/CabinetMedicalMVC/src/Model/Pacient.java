package Model;
import Model.Consultatii;
public class Pacient extends Consultatii{
    private int id;
    private int CNP;
    private String Nume;
    private int Varsta;

    public Pacient() {
    }

    public Pacient(int id, String nume, String simptome, String diagnostic, String tratament) {
        this.id = id;
        this.Nume = nume;
        this.setSimptome(simptome);
        this.setTratament(diagnostic);
        this.setDiagnostic(tratament);

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Pacient(int id, int CNP, String nume, int varsta) {
        this.id = id;
        this.CNP = CNP;
        this.Nume = nume;
        this.Varsta = varsta;
    }
    public Pacient(int id, String nume, int varsta) {
        this.id = id;
        this.Nume = nume;
        this.Varsta = varsta;
    }

    public int getCNP() {
        return CNP;
    }

    public void setCNP(int CNP) {
        this.CNP = CNP;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public int getVarsta() {
        return Varsta;
    }

    public void setVarsta(int varsta) {
        Varsta = varsta;
    }
}
