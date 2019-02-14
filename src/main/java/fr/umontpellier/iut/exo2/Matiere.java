package fr.umontpellier.iut.exo2;

public class Matiere {

    private String intitule;
    private int coefficient;
    private Professeur prof;

    public Matiere(String intitule, int coefficient, Professeur prof) {
        this.intitule = intitule;
        this.coefficient = coefficient;
        this.prof = prof;
    }

    public int getCoeff() {
        return coefficient;
    }

}