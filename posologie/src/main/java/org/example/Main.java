package org.example;

public class Main {
    public static void main(String[] args) {

        Posologie posologie = new Posologie(Type.JOURNALIERE,60,null);

        SystemBiologique sb = new SystemBiologique("Systemique");

        Medicament paracetamol = new Medicament("Paracetamol",posologie,sb);

        double poids =10;

        double posologieFinale = paracetamol.getPosologie().calculPosologieJournaliere(poids);

        System.out.println("Calcul de la Pos finale du medicament " + paracetamol.getNom() + " de posologie par defaut de "+paracetamol.getPosologie().getValeur()+" mg/kg/j pour un enfant de " + poids +" kg : "+posologieFinale+"mg/j");

        Posologie posologie2 = new Posologie(Type.VARIABLE,0,new Posologie.MinMax(100,200));

        SystemBiologique sb2 = new SystemBiologique("Infectueux");

        Medicament cefotaxime = new Medicament("Cefotaxime",posologie2,sb2);

        Posologie.MinMax posologieFinale2 = cefotaxime.getPosologie().calculPosologieMinMax(10);

        System.out.println("Calcul de la Pos finale du medicament " +  cefotaxime.getNom() + " de posologie par defaut de "+ cefotaxime.getPosologie().getMinMax().getMin()+"mg/kg/j min "+cefotaxime.getPosologie().getMinMax().getMax()+"mg/kg/j max pour un enfant de " + poids +" kg : "+posologieFinale2);

    }
}