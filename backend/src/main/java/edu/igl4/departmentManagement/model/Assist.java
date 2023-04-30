package edu.igl4.departmentManagement.model;

import edu.igl4.departmentManagement.model.id.AssisteId;
import jakarta.persistence.*;

@Entity
public class Assist {

    @EmbeddedId
    AssisteId id = new AssisteId();

    @ManyToOne
    @JoinColumn(name = "cours_id")
    @MapsId("coursId")
    Cours cours;

    @ManyToOne
    @JoinColumn(name = "enseignant_id")
    @MapsId("enseignantId")
    Enseignant enseignant;

    String annee;

    int semestre;

    public AssisteId getId() {
        return id;
    }

    public void setId(AssisteId id) {
        this.id = id;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
