package edu.igl4.departmentManagement.repository;

import edu.igl4.departmentManagement.model.Absence;
import edu.igl4.departmentManagement.model.id.AbsenceId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface AbsenceRepository extends CrudRepository<Absence, AbsenceId> {
    Absence findByPrimaryKeyEtudiantIdAndPrimaryKeyCoursId(Long etudiantId, Long coursId);
    List<Absence> findByPrimaryKeyEtudiantId(Long etudiantId);
    List<Absence> findByPrimaryKeyCoursId(Long coursId);
}
