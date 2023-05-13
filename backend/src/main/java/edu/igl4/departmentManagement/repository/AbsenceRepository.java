package edu.igl4.departmentManagement.repository;

import edu.igl4.departmentManagement.model.Absence;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface AbsenceRepository extends CrudRepository<Absence, Long> {
}
