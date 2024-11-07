package tn.esprit.tic.se.springproject.Services;

import tn.esprit.tic.se.springproject.entities.Foyer;
import tn.esprit.tic.se.springproject.entities.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservations();
    Reservation addReservation(Reservation r);
    Reservation updateReservation(Reservation r);
    Reservation retrieveReservation(String idReservation);
    void removeReservation(String idReservation);

}
