package org.example;

import java.util.ArrayList;
import java.util.List;

public class SystemBiologique {

    private String nom;
    private List<Medicament> medicaments = new ArrayList<>();

    public SystemBiologique(String nom) {
        this.nom = nom;
    }

    public List<Medicament> addMedicaments(Medicament m){

        medicaments.add(m);

        return  medicaments;
    }
}
