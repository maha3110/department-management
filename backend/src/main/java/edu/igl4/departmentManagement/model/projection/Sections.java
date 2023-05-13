package edu.igl4.departmentManagement.model.projection;

import edu.igl4.departmentManagement.model.Section;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "sections", types = {Section.class})
public interface Sections {
    String getNom();
    int getNiveau();
}
