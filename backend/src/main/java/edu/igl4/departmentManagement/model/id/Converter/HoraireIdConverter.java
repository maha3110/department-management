package edu.igl4.departmentManagement.model.id.Converter;

import edu.igl4.departmentManagement.model.id.HoraireId;
import org.springframework.core.convert.converter.Converter;

public class HoraireIdConverter implements Converter<String, HoraireId> {
    @Override
    public HoraireId convert(String source) {
        String[] ids = source.substring(1).split("-");
        HoraireId id = new HoraireId();
        id.setassistId(Long.parseLong(ids[0]));
        id.setSalleId(Long.parseLong(ids[1]));
        return id;
    }
}
