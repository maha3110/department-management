package edu.igl4.departmentManagement.Converter;

import edu.igl4.departmentManagement.model.id.AbsenceId;
import org.springframework.core.convert.converter.Converter;

public class AbsenceIdConverter implements Converter<String, AbsenceId> {
@Override
    public AbsenceId convert(String source) {
        String[] ids = source.substring(1).split("-");
        AbsenceId id = new AbsenceId();
        id.setCoursId(Long.parseLong(ids[0]));
        id.setEtudiantId(Long.parseLong(ids[1]));
        return id;
    }
}
