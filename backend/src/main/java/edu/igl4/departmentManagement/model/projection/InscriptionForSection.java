package edu.igl4.departmentManagement.model.projection;

import edu.igl4.departmentManagement.model.Inscription;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inscriptionsForSection", types = {Inscription.class})
public interface InscriptionForSection {
    long getId();
    Etudiants getEtudiant();
    String getAnnee();
}

