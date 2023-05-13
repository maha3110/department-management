package edu.igl4.departmentManagement.model.id.Converter;

import edu.igl4.departmentManagement.model.id.AbsenceId;
import edu.igl4.departmentManagement.model.id.HoraireId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class AbsenceIdConverter implements Converter<String, AbsenceId> {

@Override
    public AbsenceId convert(String source) {
        String[] ids = source.substring(1).split("-");
        AbsenceId id = new AbsenceId();
        id.setCoursId(Long.parseLong(ids[1]));
        id.setEtudiantId(Long.parseLong(ids[0]));
        return id;
    }
}
