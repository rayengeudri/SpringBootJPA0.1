package tn.esprit.tic.se.springproject.entities;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniversite")
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;

        @OneToOne(mappedBy = "universitee")
        private Foyer foyer ;


}
