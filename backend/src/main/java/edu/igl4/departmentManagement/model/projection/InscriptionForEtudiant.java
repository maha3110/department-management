package edu.igl4.departmentManagement.model.projection;

import edu.igl4.departmentManagement.model.Inscription;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inscriptionsForEtudiant", types = {Inscription.class})
public interface InscriptionForEtudiant {
    long getId();
    Sections getSection();
    String getAnnee();
}
