package tn.esprit.tic.se.springproject.Services;

import tn.esprit.tic.se.springproject.entities.Etudiant;

import java.util.List;

public interface IEtudiantservice {
    List<Etudiant> retrieveAllEtudiants();
    Etudiant addEtudiant(Etudiant e);
    Etudiant updateEtudiant(Etudiant e);
    Etudiant retrieveEtudiant(Long idetudiant);
    Void removeEtudiant (Long idetudiant);
}
