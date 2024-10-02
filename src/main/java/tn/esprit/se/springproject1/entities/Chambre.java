package tn.esprit.se.springproject1.entities;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
@Column (nullable = false)
    private Long numeroChambre;
    @Column (nullable = false)
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;




}
