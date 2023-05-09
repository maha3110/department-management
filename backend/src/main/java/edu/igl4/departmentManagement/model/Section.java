package edu.igl4.departmentManagement.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nom;
    private String niveau;


    @OneToMany(mappedBy = "section")
    private List<Inscription> inscription;

    @ManyToOne
    Enseignant cordinateur;



    public Section() {
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public List<Inscription> getInscription() {
        return inscription;
    }

    public void setInscription(List<Inscription> inscription) {
        this.inscription = inscription;
    }

    public Enseignant getCordinateur() {
        return cordinateur;
    }

    public void setCordinateur(Enseignant cordinateur) {
        this.cordinateur = cordinateur;
    }
    
    


}
