
package tn.esprit.se.springproject1.entities;

import jakarta.persistence.*;

import java.util.Date;


@Entity
public class Reservation {
    @Id

    private String idReservation;
    @Temporal (TemporalType.DATE)
    private Date anneeUniversitaire;
    private boolean estValide;

    public String getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public Date getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public void setAnneeUniversitaire(Date anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    public boolean isEstValide() {
        return estValide;
    }

    public void setEstValide(boolean estValide) {
        this.estValide = estValide;
    }
}

