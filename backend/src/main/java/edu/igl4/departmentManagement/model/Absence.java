package edu.igl4.departmentManagement.model;

import edu.igl4.departmentManagement.model.id.AbsenceId;
import jakarta.persistence.*;

@Entity
public class Absence {
    @EmbeddedId
    private AbsenceId id = new AbsenceId();

    @ManyToOne
    @JoinColumn(name = "cours_id")
    @MapsId("coursId")
    Cours cours;

    @ManyToOne
    @JoinColumn(name = "etudiant_id")
    @MapsId("etudiantId")
    Etudiant etudiant;

    private String horaires;
    private String date;
    private Boolean raison;

    public Absence() {
    }

    public Absence(AbsenceId id, String horaires, String date, Boolean raison) {
        this.id = id;
        this.horaires = horaires;
        this.date = date;
        this.raison = raison;
    }

    public AbsenceId getId() {
        return id;
    }

    public void setId(AbsenceId id) {
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

    public String getHoraires() {
        return horaires;
    }

    public void setHoraires(String horaires) {
        this.horaires = horaires;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getRaison() {
        return raison;
    }

    public void setRaison(Boolean raison) {
        this.raison = raison;
    }
}
