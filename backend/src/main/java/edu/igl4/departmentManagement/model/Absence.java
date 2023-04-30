package edu.igl4.departmentManagement.model;

import edu.igl4.departmentManagement.model.id.AbsenceId;
import jakarta.persistence.*;

@Entity
@AssociationOverrides(value = {
        @AssociationOverride(name = "primaryKey.cours", joinColumns = @JoinColumn(name = "cours_id")),
        @AssociationOverride(name = "primaryKey.etudiant", joinColumns = @JoinColumn(name = "etudiant_id"))
})
public class Absence {
    @EmbeddedId
    private AbsenceId primaryKey = new AbsenceId();

    private String horaires;
    private String date;
    private Boolean raison;

    public Absence() {
    }

    public Absence(AbsenceId primaryKey, String horaires, String date, Boolean raison) {
        this.primaryKey = primaryKey;
        this.horaires = horaires;
        this.date = date;
        this.raison = raison;
    }

    public AbsenceId getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(AbsenceId primaryKey) {
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

    public String getHoraires() {
        return horaires;
    }

    public void setHoraires(String horaires) {
        this.horaires = horaires;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getRaison() {
        return raison;
    }

    public void setRaison(Boolean raison) {
        this.raison = raison;
    }
}
