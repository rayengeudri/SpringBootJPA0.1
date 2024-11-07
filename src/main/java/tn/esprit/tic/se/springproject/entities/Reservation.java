package tn.esprit.tic.se.springproject.entities;


import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Reservation {
    @Id
    @Column(name = "idReservation", nullable = false)
    private String idReservation;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date anneeUniversitaire;

    @Column(nullable = false)
    public boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;



}
