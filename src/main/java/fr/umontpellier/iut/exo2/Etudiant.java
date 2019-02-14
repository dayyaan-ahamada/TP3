package fr.umontpellier.iut.exo2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Etudiant {

    private String nom;
    private String prenom;
    private LocalDate datenaissance;
    private String mail;
    private String adrpostale;
    private ArrayList<Note> listeNote;

    public Etudiant() {}

    public Etudiant(String nom, String prenom, LocalDate datenaissance, String mail, String adrpostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.datenaissance = datenaissance;
        this.mail = mail;
        this.adrpostale = adrpostale;
        listeNote = new ArrayList<Note>();
    }

    @Override
    public String toString() {
        return this.nom + " " + this.prenom + " / " + this.datenaissance + " / " +
                this.mail + " / " + this.adrpostale;
    }

    public void setNom(String prenom, String nom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public void noter(Matiere m, int note){
        Note n = new Note(m,note);
        listeNote.add(n);
    }
    public float calculerMoyenne(){
        float moyenne = 0;
        int total =0, coeffTotal = 0;
        for (int i=0; i<listeNote.size(); i++){
            total += listeNote.get(i).getNote() * listeNote.get(i).getMatiere().getCoeff();
            coeffTotal += listeNote.get(i).getMatiere().getCoeff();
        }
        moyenne = (float)total / (float)coeffTotal;
        return moyenne;
    }

}