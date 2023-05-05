package edu.igl4.departmentManagement.repository;

import edu.igl4.departmentManagement.model.Horaire;
import edu.igl4.departmentManagement.model.id.HoraireId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HoraireRepository extends CrudRepository<Horaire, HoraireId> {
}
