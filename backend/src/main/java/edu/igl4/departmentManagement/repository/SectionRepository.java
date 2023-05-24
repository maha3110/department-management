package edu.igl4.departmentManagement.repository;

import edu.igl4.departmentManagement.model.Section;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface SectionRepository extends PagingAndSortingRepository<Section, Long>, CrudRepository<Section, Long> {
    @RestResource(path = "byNom")
    List<Section> findAllByNom(String nom);
    @RestResource(path = "byNomAndNiveau")
    List<Section> findAllByNomAndNiveau(String nom, int niveau);
}
