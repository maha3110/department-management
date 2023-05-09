package edu.igl4.departmentManagement.model.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class NoteId implements Serializable {

    @Column(name = "inscription_id")
    long inscriptionId;

    @Column(name = "cours_id")
    long coursId;

    public long getInscriptionId() {
        return inscriptionId;
    }

    public void setInscriptionId(long inscriptionId) {
        this.inscriptionId = inscriptionId;
    }

    public long getCoursId() {
        return coursId;
    }

    public void setCoursId(long coursId) {
        this.coursId = coursId;
    }

    @Override
    public String toString() {
        return "@" + inscriptionId + "-" + coursId ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteId noteId = (NoteId) o;
        return inscriptionId == noteId.inscriptionId && coursId == noteId.coursId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(inscriptionId, coursId);
    }
}