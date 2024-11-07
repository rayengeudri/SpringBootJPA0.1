package tn.esprit.tic.se.springproject.Services;

import tn.esprit.tic.se.springproject.entities.Foyer;
import tn.esprit.tic.se.springproject.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversites();
    Universite addUniversite(Universite u);
    Universite updateUniversite(Universite u);
    Universite retrieveUniversite(Long idUniversite);
    void removeUniversite(Long idUniversite);
}
