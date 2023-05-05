package edu.igl4.departmentManagement.repository;

import edu.igl4.departmentManagement.model.Assist;
import edu.igl4.departmentManagement.model.id.AssisteId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AssistRepository extends CrudRepository<Assist, AssisteId> {
}
