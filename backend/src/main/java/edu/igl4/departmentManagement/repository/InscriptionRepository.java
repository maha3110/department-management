package edu.igl4.departmentManagement.repository;

import edu.igl4.departmentManagement.model.Inscription;
import edu.igl4.departmentManagement.model.projection.Inscriptions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;


@RepositoryRestResource(excerptProjection = Inscriptions.class)
public interface InscriptionRepository extends PagingAndSortingRepository<Inscription,Long>, CrudRepository<Inscription, Long> {
    @RestResource(path = "byEtudiant")
    List<Inscription> findAllByEtudiant_Id(Long etudiantId);
    @RestResource(path = "bySectionAndAnnee")
    List<Inscription> findAllBySection_IdAndAnnee(Long sectionId, String annee);
}
