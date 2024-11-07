package tn.esprit.tic.se.springproject.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTache")
    private Long idTache;

    @Column(nullable = false)
    private LocalDate dateTache;

    @Column(nullable = false)
    private Integer duree;

    @Column(nullable = false)
    private Float tarifHoraire;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TypeTache typeTache;
}
