package edu.igl4.departmentManagement.model.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class HoraireId implements Serializable {

    @Column(name = "cours_id")
    long coursId;

    @Column(name = "salle_id")
    long salleId;

    public long getCoursId() {
        return coursId;
    }

    public void setCoursId(long coursId) {
        this.coursId = coursId;
    }

    public long getSalleId() {
        return salleId;
    }

    public void setSalleId(long salleId) {
        this.salleId = salleId;
    }

    @Override
    public String toString() {
        return "@" + coursId + "-" + salleId ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoraireId horaireId = (HoraireId) o;
        return coursId == horaireId.coursId && salleId == horaireId.salleId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coursId, salleId);
    }
}

