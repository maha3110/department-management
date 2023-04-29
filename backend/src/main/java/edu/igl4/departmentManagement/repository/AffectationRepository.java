package edu.igl4.departmentManagement.repository;

import edu.igl4.departmentManagement.model.Affectation;
import edu.igl4.departmentManagement.model.AffectationId;
import org.springframework.data.repository.CrudRepository;

public interface AffectationRepository extends CrudRepository<Affectation, AffectationId> {
}
