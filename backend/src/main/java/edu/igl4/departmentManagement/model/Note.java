package edu.igl4.departmentManagement.model;

import edu.igl4.departmentManagement.model.id.NoteId;
import jakarta.persistence.*;

@Entity
public class Note {
    @EmbeddedId
    private NoteId noteId = new NoteId();

    @ManyToOne
    @JoinColumn(name= "inscription_id")
    @MapsId("inscriptionId")
    Inscription inscription;

    @ManyToOne
    @JoinColumn(name = "cours_id")
    @MapsId("coursId")
    Cours cours;

    float noteCC;
    float noteTp;
    float noteExamen;

    public NoteId getNoteId() {
        return noteId;
    }

    public void setNoteId(NoteId noteId) {
        this.noteId = noteId;
    }

}