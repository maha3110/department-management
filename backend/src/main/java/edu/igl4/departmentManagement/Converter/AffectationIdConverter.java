package edu.igl4.departmentManagement.Converter;

import org.springframework.core.convert.converter.Converter;
import edu.igl4.departmentManagement.model.id.AffectationId;

public class AffectationIdConverter implements Converter<String, AffectationId> {
    @Override
    public AffectationId convert(String source) {
        String[] ids = source.substring(1).split("-");
        AffectationId id = new AffectationId();
        id.setCoursId(Long.parseLong(ids[0]));
        id.setEtudiantId(Long.parseLong(ids[1]));
        return id;
    }
}
