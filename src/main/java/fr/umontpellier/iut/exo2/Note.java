package fr.umontpellier.iut.exo2;

public class Note {
    private Matiere matiere;
    private float note;

    public Note(Matiere matiere, float note){
        this.matiere = matiere;
        this.note = note;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public float getNote() {
        return note;
    }

}
