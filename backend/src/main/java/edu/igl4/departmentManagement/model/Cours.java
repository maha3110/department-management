package edu.igl4.departmentManagement.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Cours {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	String nom;
	
	String code;
	
	float volumeHoraire;
	
	String type;

	/*@ManyToMany(mappedBy = "coursList")
	private List<Section> sections;*/

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
/*
	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}*/
}
