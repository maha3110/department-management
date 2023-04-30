package edu.igl4.departmentManagement.model.id;

import edu.igl4.departmentManagement.model.Cours;
import edu.igl4.departmentManagement.model.Etudiant;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class AffectationId implements Serializable {
    @Column(name = "cours_id")
    long coursId;
    @Column(name = "etudiant_id")
    long etudiantId;


    public long getCoursId() {
        return coursId;
    }

    public void setCoursId(long coursId) {
        this.coursId = coursId;
    }

    public long getEtudiantId() {
        return etudiantId;
    }

    public void setEtudiantId(long etudiantId) {
        this.etudiantId = etudiantId;
    }

    @Override
    public String toString() {
        return "@" + coursId + "-" + etudiantId ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AffectationId)) return false;
        AffectationId that = (AffectationId) o;
        return getCoursId() == that.getCoursId() && getEtudiantId() == that.getEtudiantId();
    }
}
