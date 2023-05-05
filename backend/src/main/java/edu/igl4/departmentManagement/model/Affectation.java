package edu.igl4.departmentManagement.model;

import edu.igl4.departmentManagement.model.id.AffectationId;
import jakarta.persistence.*;

@Entity
public class Affectation {

    @EmbeddedId
    private AffectationId id = new AffectationId();

    @ManyToOne
    @JoinColumn(name = "cours_id")
    @MapsId("coursId")
    Cours cours;

    @ManyToOne
    @JoinColumn(name = "etudiant_id")
    @MapsId("etudiantId")
    Etudiant etudiant;

    private int note;
    private String annee;

    public Affectation() {
    }

    public Affectation(AffectationId id, int note, String annee) {
        this.id = id;
        this.note = note;
        this.annee = annee;
    }

    public AffectationId getId() {
        return id;
    }

    public void setId(AffectationId id) {
        this.id = id;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }
}
