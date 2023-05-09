package edu.igl4.departmentManagement.repository;

import edu.igl4.departmentManagement.model.Note;
import edu.igl4.departmentManagement.model.id.NoteId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NoteRepository extends CrudRepository<Note, NoteId> {
}