package edu.igl4.departmentManagement.model.projection;

import edu.igl4.departmentManagement.model.Inscription;
import edu.igl4.departmentManagement.model.Section;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "Inscription", types = {Inscription.class})
public interface InscriptionProjection {
    Section getSection();
    String getAnnee();
}
