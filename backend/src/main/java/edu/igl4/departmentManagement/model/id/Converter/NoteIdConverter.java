package edu.igl4.departmentManagement.model.id.Converter;


import edu.igl4.departmentManagement.model.id.NoteId;
import org.springframework.core.convert.converter.Converter;

public class NoteIdConverter implements Converter<String, NoteId> {

    @Override
    public NoteId convert(String source) {
        String[] ids = source.substring(1).split("-");
        NoteId id = new NoteId();
        id.setInscriptionId(Long.parseLong(ids[0]));
        id.setCoursId(Long.parseLong(ids[1]));
        return id;
    }
}
