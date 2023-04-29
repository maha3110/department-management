package edu.igl4.departmentManagement.repository;

import edu.igl4.departmentManagement.model.Affectation;
import edu.igl4.departmentManagement.model.AffectationId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AffectationRepository extends CrudRepository<Affectation, AffectationId> {
    Affectation findByPrimaryKeyEtudiantIdAndPrimaryKeyCoursId(Long etudiantId, Long coursId);
}
