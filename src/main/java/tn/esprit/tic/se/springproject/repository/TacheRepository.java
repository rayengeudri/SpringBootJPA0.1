package tn.esprit.tic.se.springproject.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.tic.se.springproject.entities.Tache;

public interface TacheRepository extends CrudRepository<Tache,Long> {
}
