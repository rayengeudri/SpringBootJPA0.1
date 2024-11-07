package tn.esprit.tic.se.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table (name="Foyer")
public class Foyer implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idFoyer")
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer ;

    @OneToOne
    private Universite universitee;

    @OneToMany(mappedBy = "foyerr", cascade = CascadeType.ALL)
    private Set<Bloc> blocs ;
}
