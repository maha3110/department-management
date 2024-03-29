package edu.igl4.departmentManagement.repository;

import edu.igl4.departmentManagement.model.Enseignant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EnseignantRepository extends PagingAndSortingRepository<Enseignant, Long>, CrudRepository<Enseignant, Long> {
}
