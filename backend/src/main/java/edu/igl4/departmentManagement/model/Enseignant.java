package edu.igl4.departmentManagement.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Enseignant extends Personne {

    private String grade;

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    @OneToMany(mappedBy = "enseignant")
    private List<Assist> assists;

    @OneToMany(mappedBy = "cordinateur")
    private List<Section> sections;

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
}
