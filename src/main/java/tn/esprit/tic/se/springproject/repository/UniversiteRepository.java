package tn.esprit.tic.se.springproject.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.tic.se.springproject.entities.TypeTache;
import tn.esprit.tic.se.springproject.entities.Universite;

public interface UniversiteRepository extends CrudRepository<Universite,Long> {
}
