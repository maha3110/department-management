package edu.igl4.departmentManagement.repository;

import edu.igl4.departmentManagement.model.Etudiant;
import edu.igl4.departmentManagement.model.projection.Etudiants;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = Etudiants.class)
public interface EtudiantRepository extends PagingAndSortingRepository<Etudiant, Long>, CrudRepository<Etudiant, Long> {

}
