package fr.umontpellier.iut.exo2;

import java.time.LocalDate;

public class Etudiant {

    private String nom;
    private String prenom;
    private LocalDate datenaissance;
    private String mail;
    private String adrpostale;

    public Etudiant() {}

    public Etudiant(String nom, String prenom, LocalDate datenaissance, String mail, String adrpostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.datenaissance = datenaissance;
        this.mail = mail;
        this.adrpostale = adrpostale;
    }

    @Override
    public String toString() {
        return this.nom + " " + this.prenom + " / " + this.datenaissance + " / " + this.mail + " / " + this.adrpostale;
    }

    public void setNom(String prenom, String nom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}