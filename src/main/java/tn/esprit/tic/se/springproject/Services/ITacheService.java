package tn.esprit.tic.se.springproject.Services;

import tn.esprit.tic.se.springproject.entities.Foyer;
import tn.esprit.tic.se.springproject.entities.Tache;

import java.util.List;

public interface ITacheService {
    List<Tache> retrieveAllTaches();
    Tache addTache(Tache f);
    Tache updateTache(Tache f);
    Tache retrieveTache(Long idTache);
    void removeTache(Long idTache);
}
