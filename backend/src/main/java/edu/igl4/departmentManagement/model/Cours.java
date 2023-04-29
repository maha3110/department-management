package edu.igl4.departmentManagement.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Cours {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	String nom;
	
	String code;
	
	float volumeHoraire;
	
	String type;

	@OneToMany(mappedBy = "primaryKey.cours" , cascade = CascadeType.ALL)
	private List<Affectation> affectations;

	public List<Affectation> getAffectations() {
		return affectations;
	}

	public void setAffectations(List<Affectation> affectations) {
		this.affectations = affectations;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public float getVolumeHoraire() {
		return volumeHoraire;
	}

	public void setVolumeHoraire(float volumeHoraire) {
		this.volumeHoraire = volumeHoraire;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}
