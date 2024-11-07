package tn.esprit.tic.se.springproject.Services;

import tn.esprit.tic.se.springproject.entities.Chambre;
import tn.esprit.tic.se.springproject.repository.ChambreRepository;

import java.util.List;

public class ChambreService implements IChambreService{

    ChambreRepository chambreRepository;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return (List<Chambre>) chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public void removeChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }
}
