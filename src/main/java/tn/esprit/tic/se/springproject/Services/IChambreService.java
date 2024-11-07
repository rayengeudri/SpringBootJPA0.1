package tn.esprit.tic.se.springproject.Services;

import tn.esprit.tic.se.springproject.entities.Bloc;
import tn.esprit.tic.se.springproject.entities.Chambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre(Chambre c);
    Chambre retrieveChambre(Long idChambre);
    void removeChambre(Long idChambre);
}
