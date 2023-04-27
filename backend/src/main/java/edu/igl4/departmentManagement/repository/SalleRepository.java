package edu.igl4.departmentManagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import edu.igl4.departmentManagement.model.Salle;


@RepositoryRestResource
public interface SalleRepository extends CrudRepository<Salle, Long> {

}
