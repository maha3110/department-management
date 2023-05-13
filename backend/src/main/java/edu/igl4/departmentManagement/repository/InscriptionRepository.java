package edu.igl4.departmentManagement.repository;

import edu.igl4.departmentManagement.model.Inscription;
import edu.igl4.departmentManagement.model.projection.InscriptionProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(excerptProjection = InscriptionProjection.class)
public interface InscriptionRepository extends CrudRepository<Inscription, Long> {
}
