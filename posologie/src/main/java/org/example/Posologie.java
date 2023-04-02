package org.example;

public class Posologie {
    Type type = Type.JOURNALIERE;
    double valeur = 0;
    MinMax minMax = null;

    public Posologie(Type type,double valeur,MinMax minMax) {

        if(type==null){
            throw new RuntimeException("typ doit etre non null");
        }
        this.type = type;

        if (type == Type.JOURNALIERE) {
            if(valeur <= 0){
                throw new RuntimeException("La val doit etre strict sup à 0");
            }
            this.valeur = valeur;
        }

        if (type == Type.VARIABLE) {
            if(minMax == null){
                throw new RuntimeException("minMax doit etre non null");
            }
            this.minMax = minMax;
        }
   }

    public Type getType() {
        return type;
    }

    public double getValeur() {
        return valeur;
    }

    public MinMax getMinMax() {
        return minMax;
    }

    public double calculPosologieJournaliere(double poids) {
        return poids * valeur;
    }

    public MinMax calculPosologieMinMax(double poids) {
        return new MinMax(minMax.min * poids, minMax.max * poids);
    }

    public static class MinMax {
        private double min = 0;
        private double max = 0;
        public MinMax(double min, double max) {
            if(min <= 0){
                throw new RuntimeException("min doit etre strict sup à 0");
            }
            if(max <= 0){
                throw new RuntimeException("max doit etre strict sup à 0");
            }
            if(min >= max){
                throw new RuntimeException("max doit etre strict sup à min");
            }
            this.min = min;
            this.max = max;
        }
        public double getMin() {
            return min;
        }
        public double getMax() {
            return max;
        }
        @Override
        public String toString() {
            return min+"mg/kg/j min ET "+max+"mg/kg/j max";
        }
    }
}
