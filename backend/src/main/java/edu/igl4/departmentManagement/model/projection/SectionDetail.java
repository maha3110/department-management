package edu.igl4.departmentManagement.model.projection;

import edu.igl4.departmentManagement.model.Cours;
import edu.igl4.departmentManagement.model.Enseignant;
import edu.igl4.departmentManagement.model.Section;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "sectionDetail", types = {Section.class})
public interface SectionDetail extends Sections{
    List<Cours> getCours();
    Enseignant getCordinateur();
}
