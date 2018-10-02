package ControlDeVersions;

public class Usuari {

    private String nom;
    private String cognom;
    private int edat;
    private String dataAlta;

    public Usuari(String nom, String cognom, int edat, String pdata) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
        dataAlta = pdata;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public int getEdat() {
        return edat;
    }

    public String getDataAlta() {
        return dataAlta;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setDataAlta(String dataAlta) {
        this.dataAlta = dataAlta;
    }
    
    public void calculaEdat(){
        
    }

}