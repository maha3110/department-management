package edu.igl4.departmentManagement.model.projection;

import edu.igl4.departmentManagement.model.Etudiant;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "etudiantDetail", types ={Etudiant.class} )
public interface EtudiantDetail extends Etudiants {
    String getEmail();
    String getAdresse();
    String getTelephone();
}
