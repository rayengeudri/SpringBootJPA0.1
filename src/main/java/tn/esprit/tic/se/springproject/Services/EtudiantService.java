package tn.esprit.tic.se.springproject.Services;

import org.springframework.stereotype.Service;
import tn.esprit.tic.se.springproject.entities.Etudiant;
import tn.esprit.tic.se.springproject.repository.EtudiantRepository;

import java.util.List;


public class EtudiantService implements IEtudiantservice {
    EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (List<Etudiant>) etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idetudiant) {
        return etudiantRepository.findById(idetudiant).get();
    }

    @Override
    public Void removeEtudiant(Long idetudiant) {
        return null;
    }
}
