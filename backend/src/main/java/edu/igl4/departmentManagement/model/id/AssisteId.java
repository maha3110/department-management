package edu.igl4.departmentManagement.model.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AssisteId implements Serializable {

    @Column(name = "cours_id")
    long coursId;

    @Column(name = "enseignant_id")
    long enseignantId;

    public long getCoursId() {
        return coursId;
    }

    public void setCoursId(long coursId) {
        this.coursId = coursId;
    }

    public long getEnseignantId() {
        return enseignantId;
    }

    public void setEnseignantId(long enseignantId) {
        this.enseignantId = enseignantId;
    }

    @Override
    public String toString() {
        return "@" + coursId + "-" + enseignantId ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssisteId assisteId = (AssisteId) o;
        return coursId == assisteId.coursId && enseignantId == assisteId.enseignantId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coursId, enseignantId);
    }
}
