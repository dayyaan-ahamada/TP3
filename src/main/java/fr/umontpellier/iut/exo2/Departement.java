package fr.umontpellier.iut.exo2;

import fr.umontpellier.iut.exo1.Etudiant;

import java.util.ArrayList;

public class Departement {

    private String specialite;
    private String adrpostale;
    private ArrayList<Etudiant> listEtudiant;

    public Departement(String specialite, String adrpostale) {
        this.specialite = specialite;
        this.adrpostale = adrpostale;
        this.listEtudiant = new ArrayList<Etudiant>();
    }

    @Override
    public String toString() {
        String s = "\n=============== [" + this.specialite + " - " + this.adrpostale +"] ===============" + "\n" + "\n";
        int taille = this.listEtudiant.size();
        for(int i = 0; i < taille; i++) {
            s += i+1 + " - " + this.listEtudiant.get(i).toString() + "\n";
        }
        return s;
    }

    public void inscrire (Etudiant etud) {
        this.listEtudiant.add(etud);
    }

    public void desinscrire (Etudiant etud) {
        this.listEtudiant.remove(etud);
    }



}