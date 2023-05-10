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

	@OneToMany(mappedBy = "cours")
	private List<Assist> assists;

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

	public List<Assist> getAssists() {
		return assists;
	}

	public void setAssists(List<Assist> assists) {
		this.assists = assists;
	}
}
