package edu.igl4.departmentManagement.repository;

import edu.igl4.departmentManagement.model.FichePointage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FichePointageRepository extends CrudRepository<FichePointage, Long> {
}
