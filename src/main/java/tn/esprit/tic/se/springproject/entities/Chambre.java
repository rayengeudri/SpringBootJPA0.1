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
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idChambre")
    private Long idChambre;

    @Column(nullable = false)
    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
     private TypeChambre typeC;

    @ManyToOne
    private Bloc bloc;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations ;
}



