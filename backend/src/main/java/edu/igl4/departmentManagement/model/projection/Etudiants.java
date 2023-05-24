package edu.igl4.departmentManagement.model.projection;

import edu.igl4.departmentManagement.model.Etudiant;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "etudiants", types = {Etudiant.class})
public interface Etudiants {
    long getId();
    String getNom();
    String getPrenom();
    String getDateNaissance();
}
