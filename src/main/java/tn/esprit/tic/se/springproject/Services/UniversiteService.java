package tn.esprit.tic.se.springproject.Services;

import tn.esprit.tic.se.springproject.entities.Foyer;
import tn.esprit.tic.se.springproject.entities.Universite;
import tn.esprit.tic.se.springproject.repository.UniversiteRepository;

import java.util.List;

public class UniversiteService implements IUniversiteService{
    UniversiteRepository universiteRepository;
    @Override
    public List<Universite> retrieveAllUniversites() {
        return (List<Universite>)universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public void removeUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }
}
