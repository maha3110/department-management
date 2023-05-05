package edu.igl4.departmentManagement.repository;

import edu.igl4.departmentManagement.model.Affectation;
import edu.igl4.departmentManagement.model.id.AffectationId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface AffectationRepository extends CrudRepository<Affectation, AffectationId> {
}
