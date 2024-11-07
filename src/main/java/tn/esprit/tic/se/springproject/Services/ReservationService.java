package tn.esprit.tic.se.springproject.Services;

import tn.esprit.tic.se.springproject.entities.Reservation;
import tn.esprit.tic.se.springproject.repository.ReservationRepository;

import java.util.List;

public class ReservationService implements IReservationService{
    ReservationRepository reservationRepository;
    @Override
    public List<Reservation> retrieveAllReservations() {
        return (List<Reservation>) reservationRepository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    @Override
    public void removeReservation(String idReservation) {
        reservationRepository.deleteById(idReservation);
    }
}
