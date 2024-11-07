package tn.esprit.tic.se.springproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Bloc")
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idbloc",nullable = false)
    private Long idbloc;
    private String nomBloc;
    private Long capaciteBloc;

    @OneToMany(cascade =  CascadeType.ALL,mappedBy = "bloc")

    private Set<Chambre> chambres ;

    @ManyToOne
    private Foyer foyerr;
}
