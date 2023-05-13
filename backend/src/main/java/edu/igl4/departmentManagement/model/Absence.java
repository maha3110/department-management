package edu.igl4.departmentManagement.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"cours_id", "etudiant_id", "date"}) )
public class Absence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    @JoinColumn(name = "cours_id")
    Cours cours;

    @ManyToOne
    @JoinColumn(name = "etudiant_id")
    Etudiant etudiant;

    @Column(name = "date")
    private Date date;

    private Boolean estJustifie;

    public Absence() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
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
