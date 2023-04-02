package org.example;

public class Medicament {
    private String nom;
    private Posologie posologie;
    //CardioVasc, Respiratoire...
    private SystemBiologique sb;


    public Medicament(String nom, Posologie posologie, SystemBiologique sb) {
        sb.addMedicaments(this);
        this.nom = nom;
        this.posologie = posologie;
        this.sb = sb;
    }

    public String getNom() {
        return nom;
    }

    public Posologie getPosologie() {
        return posologie;
    }

    public SystemBiologique getSb() {
        return sb;
    }
}
