package edu.igl4.departmentManagement.model.id.Converter;

import edu.igl4.departmentManagement.model.id.AssisteId;
import org.springframework.core.convert.converter.Converter;

public class AssistIdConverter implements Converter<String, AssisteId> {
    @Override
    public AssisteId convert(String source) {
        String[] ids = source.substring(1).split("-");
        AssisteId id = new AssisteId();
        id.setCoursId(Long.parseLong(ids[0]));
        id.setEnseignantId(Long.parseLong(ids[1]));
        return id;
    }
}
