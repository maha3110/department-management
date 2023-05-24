package edu.igl4.departmentManagement.model.projection;

import edu.igl4.departmentManagement.model.Inscription;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inscriptions", types = {Inscription.class})
public interface Inscriptions {
    long getId();
    Sections getSection();
    Etudiants getEtudiant();
    String getAnnee();
}
