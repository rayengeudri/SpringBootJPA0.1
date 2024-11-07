package tn.esprit.tic.se.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.se.springproject.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,String>{

}
