package tn.esprit.tic.se.springproject.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.tic.se.springproject.entities.Foyer;

import java.util.List;

public interface FoyerRepository extends CrudRepository<Foyer,Long> {
    List<Foyer> findByCapaciteFoyerGreaterThan(Long Capacite);
    List<Foyer>findByUniversiteeNomUniversite(String nom);

}
