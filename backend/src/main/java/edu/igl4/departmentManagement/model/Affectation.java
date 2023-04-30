package edu.igl4.departmentManagement.model;

import edu.igl4.departmentManagement.model.id.AffectationId;
import jakarta.persistence.*;

@Entity
@AssociationOverrides(value = {
        @AssociationOverride(name = "primaryKey.cours", joinColumns = @JoinColumn(name = "cours_id")),
        @AssociationOverride(name = "primaryKey.etudiant", joinColumns = @JoinColumn(name = "etudiant_id"))
})
public class Affectation {
    @EmbeddedId
    private AffectationId primaryKey = new AffectationId();

    private String nom;
    private String annee;

    public Affectation() {
    }

    public Affectation(AffectationId primaryKey, String nom, String annee) {
        this.primaryKey = primaryKey;
        this.nom = nom;
        this.annee = annee;
    }

    public AffectationId getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(AffectationId primaryKey) {
        this.primaryKey = primaryKey;
    }

    @Transient
    public Cours getCours() {
        return getPrimaryKey().getCours();
    }

    public void setCours(Cours cours) {
        getPrimaryKey().setCours(cours);
    }

    @Transient
    public Etudiant getEtudiant() {
        return getPrimaryKey().getEtudiant();
    }

    public void setEtudiant(Etudiant etudiant) {
        getPrimaryKey().setEtudiant(etudiant);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }
}
