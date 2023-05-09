package edu.igl4.departmentManagement.model;

import edu.igl4.departmentManagement.model.id.AbsenceId;
import jakarta.persistence.*;

import java.util.Date;

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

    private Date date;
    private Boolean estJustifie;

    public Absence() {
    }


    public AbsenceId getId() {
        return id;
    }

    public void setId(AbsenceId id) {
        this.id = id;
    }


    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Boolean getEstJustifie() {
        return estJustifie;
    }

    public void setEstJustifie(Boolean estJustifie) {
        this.estJustifie = estJustifie;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
