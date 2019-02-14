package fr.umontpellier.iut.exo2;

import fr.umontpellier.iut.exo1.Departement;
import fr.umontpellier.iut.exo1.Etudiant;

import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {
    public static void main(String[] args) {
        LocalDate naissance = LocalDate.of(2001, Month.FEBRUARY, 5);
        Etudiant lolo = new Etudiant("lolo","yes",naissance,"loloj@yahoo.fr","3, rue ah yes");
        Etudiant toto = lolo;
        System.out.println(lolo.toString());
        System.out.println(toto.toString());
        Departement depInfo = new Departement("Informatique","Batiment K");
        depInfo.inscrire(toto);
        depInfo.inscrire(lolo);
        LocalDate datenaissancePaul = LocalDate.of(1999, Month.NOVEMBER, 15);
        Etudiant dayyaan = new Etudiant("Dayyaan","Ahamada",datenaissancePaul,"dayyaanahamada@gmail.com","6, rue des pensées");
        LocalDate paulNaissance = LocalDate.of(2000, Month.AUGUST, 3);
        Etudiant paul = new Etudiant("Paul","Aire",paulNaissance,"Paul.aire@etu.umontpellier.fr","8, rue des pensées");
        depInfo.inscrire(dayyaan);
        depInfo.inscrire(paul);
        depInfo.desinscrire(toto);
        System.out.println(depInfo.toString());

    }
}