package edu.igl4.departmentManagement.model.id;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


import java.io.Serializable;

@Embeddable
public class AbsenceId implements Serializable {
    @Column(name = "cours_id")
    long   coursId;
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
        return "@" + etudiantId + "-" + coursId ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbsenceId)) return false;
        AbsenceId that = (AbsenceId) o;
        return getCoursId() == that.getCoursId() && getEtudiantId() == that.getEtudiantId();
    }

}
