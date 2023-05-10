package edu.igl4.departmentManagement.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Enseignant extends Personne {

    private String grade;

    @OneToMany(mappedBy = "enseignant")
    private List<Assist> assists;

    @OneToMany(mappedBy = "cordinateur")
    private List<Section> sectionsCordinees;

    public List<Assist> getAssists() {
        return assists;
    }

    public void setAssists(List<Assist> assists) {
        this.assists = assists;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public List<Section> getSectionsCordinees() {
        return sectionsCordinees;
    }

    public void setSectionsCordinees(List<Section> sectionsCordinees) {
        this.sectionsCordinees = sectionsCordinees;
    }
}
