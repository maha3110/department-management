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
    private String annee;

    @OneToMany(mappedBy = "section")
    private List<Etudiant> etudiants;

    public Section() {
    }

    public Section(String nom, String niveau, String annee) {
        this.nom = nom;
        this.niveau = niveau;
        this.annee = annee;
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

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
    
    


}
