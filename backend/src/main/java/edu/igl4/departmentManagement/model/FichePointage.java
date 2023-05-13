package edu.igl4.departmentManagement.model;


import jakarta.persistence.*;

@Entity
public class FichePointage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String date;
    private String periode;
    private String type;
    private String raison;

    @ManyToOne
    @JoinColumn(name = "personne_id")
    private Personne personne;

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public FichePointage() {
    }

    public FichePointage(String date, String periode, String type, String raison) {
        this.date = date;
        this.periode = periode;
        this.type = type;
        this.raison = raison;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }
}
