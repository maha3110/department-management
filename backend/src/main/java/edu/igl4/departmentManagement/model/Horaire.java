package edu.igl4.departmentManagement.model;


import edu.igl4.departmentManagement.model.id.HoraireId;
import jakarta.persistence.*;

import java.time.DayOfWeek;



@Entity
public class Horaire {

    @EmbeddedId
    HoraireId id = new HoraireId();

    @ManyToOne
    @JoinColumn(name = "cours_id")
    @MapsId("coursId")
    Cours cours;

    @ManyToOne
    @JoinColumn(name = "salle_id")
    @MapsId("salleId")
    Salle salle;

    String annee;

    int semestre;
    DayOfWeek jour;

    String horaire;

    public HoraireId getId() {
        return id;
    }

    public void setId(HoraireId id) {
        this.id = id;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
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

    public DayOfWeek getJour() {
        return jour;
    }

    public void setJour(DayOfWeek jour) {
        this.jour = jour;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }
}
