package edu.igl4.departmentManagement.repository;

import edu.igl4.departmentManagement.model.CadreAdministratif;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CadreAdministratifRepository extends CrudRepository<CadreAdministratif, Long> {
}
