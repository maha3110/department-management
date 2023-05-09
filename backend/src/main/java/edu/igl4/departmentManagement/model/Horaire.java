package edu.igl4.departmentManagement.model;


import edu.igl4.departmentManagement.model.id.HoraireId;
import jakarta.persistence.*;

import java.time.DayOfWeek;
import java.time.LocalTime;



@Entity
public class Horaire {

    @EmbeddedId
    HoraireId id = new HoraireId();

    @ManyToOne
    @JoinColumn(name = "assist_id")
    @MapsId("assistId")
    Assist assist;

    @ManyToOne
    @JoinColumn(name = "salle_id")
    @MapsId("salleId")
    Salle salle;

    DayOfWeek jour;

    LocalTime heureDebut;

    float duree;


    public HoraireId getId() {
        return id;
    }

    public void setId(HoraireId id) {
        this.id = id;
    }


    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Assist getAssist() {
        return assist;
    }

    public void setAssist(Assist assist) {
        this.assist = assist;
    }

    public DayOfWeek getJour() {
        return jour;
    }

    public void setJour(DayOfWeek jour) {
        this.jour = jour;
    }

    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(LocalTime heureDebut) {
        this.heureDebut = heureDebut;
    }

    public float getDuree() {
        return duree;
    }

    public void setDuree(float duree) {
        this.duree = duree;
    }
}
