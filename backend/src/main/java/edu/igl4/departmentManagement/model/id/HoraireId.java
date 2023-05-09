package edu.igl4.departmentManagement.model.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class HoraireId implements Serializable {

    @Column(name = "assist_id")
    long assistId;

    @Column(name = "salle_id")
    long salleId;

    public long getassistId() {
        return assistId;
    }

    public void setassistId(long assistId) {
        this.assistId = assistId;
    }

    public long getSalleId() {
        return salleId;
    }

    public void setSalleId(long salleId) {
        this.salleId = salleId;
    }

    @Override
    public String toString() {
        return "@" + assistId + "-" + salleId ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoraireId horaireId = (HoraireId) o;
        return assistId == horaireId.assistId && salleId == horaireId.salleId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(assistId, salleId);
    }
}

