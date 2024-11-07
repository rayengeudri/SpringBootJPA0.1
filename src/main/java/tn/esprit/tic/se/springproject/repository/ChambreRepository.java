package tn.esprit.tic.se.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.se.springproject.entities.Chambre;
import tn.esprit.tic.se.springproject.entities.TypeChambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    List<Chambre>findByBlocIdblocAndTypeC(Long idBloc, TypeChambre typeC);
    List<Chambre>findByReservationsEstValide(boolean estValide);
    List<Chambre>findByBlocIdblocAndBlocCapaciteBlocGreaterThan(Long idBloc , Long capacite);
    List<Chambre>findByBlocNomBlocAndBlocCapaciteBlocGreaterThan(String nom , Long capacite);

}
