package tn.esprit.se.springproject1.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Tache {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTache;
    @Column (nullable = false)
    private Date dateTache;
    @Column (nullable = false)
    private Integer duree;
    @Column (nullable = false)
    private Float tarifHoraire;

    @Enumerated(EnumType.STRING)
    private TypeTache typeTache;


    public Date getDateTache() {
        return dateTache;
    }

    public void setDateTache(Date dateTache) {
        this.dateTache = dateTache;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public Float getTarifHoraire() {
        return tarifHoraire;
    }

    public void setTarifHoraire(Float tarifHoraire) {
        this.tarifHoraire = tarifHoraire;
    }

    public Long getIdTache() {
        return idTache;
    }

    public void setIdTache(Long idTache) {
        this.idTache = idTache;
    }
}

