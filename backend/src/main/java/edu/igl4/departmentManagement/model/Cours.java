package edu.igl4.departmentManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Cours {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	String nom;
	
	String code;
	
	float volumeHoraire;
	
	String type;

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
