package edu.igl4.departmentManagement.repository;

import edu.igl4.departmentManagement.model.Section;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SectionRepository extends PagingAndSortingRepository<Section, Long>, CrudRepository<Section, Long> {
}
