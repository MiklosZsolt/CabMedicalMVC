
package Model;

public class Utilizator {
    private int id;
    private String nume;
    private String parola;
    private String rol;

    private String specialitate;
    private String CNP;


    public String getSpecialitate() {
        return specialitate;
    }

    public void setSpecialitate(String specialitate) {
        this.specialitate = specialitate;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

//    public Utilizator(int id, String nume, String rol, String s)
//    {
//        this.nume = "";
//        this.parola = "";
//        this.rol = "";
//        this.id = 0;
//    }

    public Utilizator(String nume, String parola, String rol,int id, String specialitate, String CNP) {
        this.nume = nume;
        this.parola = parola;
        this.rol = rol;
        this.id = id;
        this.specialitate = specialitate;
        this.CNP = CNP;
    }
    public Utilizator(String nume, String parola, String rol,int id) {
        this.nume = nume;
        this.parola = parola;
        this.rol = rol;
        this.id = id;
    }


    public Utilizator() {

    }
//    public Utilizator utilizator = new Utilizatori();

    public String getNumeUtilizator() {
        return this.nume;
    }

    public String  getParolaUtilizator() {
        return this.parola;
    }

    public String getRolUtilizator() {
        return this.rol;
    }
//
//    public void setNumeUtilizator(String nume) {
//        this.nume = nume;
//    }
//
//    public void setParolaUtilizator(String parola) {
//        this.parola = parola;
//    }
//
//    public void setRolUtilizator(String rol) {
//        this.rol = rol;
//    }

    public String getNume() {
        return nume;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getParola() {
        return parola;
    }
}