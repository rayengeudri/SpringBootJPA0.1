package tn.esprit.tic.se.springproject.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.tic.se.springproject.entities.Etudiant;

public interface EtudiantRepository extends CrudRepository<Etudiant,Long> {
}
