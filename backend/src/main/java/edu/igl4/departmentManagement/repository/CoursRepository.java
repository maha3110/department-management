package edu.igl4.departmentManagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import edu.igl4.departmentManagement.model.Cours;

@RepositoryRestResource
public interface CoursRepository extends CrudRepository<Cours, Long> {
}
