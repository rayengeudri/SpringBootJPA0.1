package tn.esprit.se.springproject1.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;
@Entity
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    @Column (nullable = false)
    private String nomEt;
    @Column (nullable = false)
    private String prenomEt;
    @Column (nullable = false , unique = true)
    private Integer cin;
    private String ecole;
    @Temporal (TemporalType.DATE)
    private Date dateNaissance;






}
