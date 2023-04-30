package edu.igl4.departmentManagement.model.id;

import edu.igl4.departmentManagement.model.Cours;
import edu.igl4.departmentManagement.model.Etudiant;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class AbsenceId implements Serializable {
    @ManyToOne(cascade = CascadeType.ALL)
    private Cours cours;
    @ManyToOne(cascade = CascadeType.ALL)
    private Etudiant etudiant;

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
}
