package tn.esprit.tic.se.springproject.Services;

import tn.esprit.tic.se.springproject.entities.Tache;
import tn.esprit.tic.se.springproject.repository.TacheRepository;

import java.util.List;

public class TacheService implements ITacheService {
    TacheRepository tacheRepository;
    @Override
    public List<Tache> retrieveAllTaches() {
        return (List<Tache>) tacheRepository.findAll();
    }

    @Override
    public Tache addTache(Tache f) {
        return tacheRepository.save(f);
    }

    @Override
    public Tache updateTache(Tache f) {
        return tacheRepository.save(f);
    }

    @Override
    public Tache retrieveTache(Long idTache) {
        return tacheRepository.findById(idTache).get();
    }

    @Override
    public void removeTache(Long idTache) {
            tacheRepository.deleteById(idTache);
    }
}
