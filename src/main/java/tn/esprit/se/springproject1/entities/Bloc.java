package tn.esprit.se.springproject1.entities;
import jakarta.persistence.* ;


import java.util.List;
@Entity
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBloc;

    private String nomBloc;
    private Long capaciteBloc;


    public Integer getIdBloc() {
        return idBloc;
    }

    public String getNomBloc() {
        return nomBloc;
    }

    public void setNomBloc(String nomBloc) {
        this.nomBloc = nomBloc;
    }

    public void setIdBloc(Integer idBloc) {
        this.idBloc = idBloc;
    }

    public Long getCapaciteBloc() {
        return capaciteBloc;
    }

    public void setCapaciteBloc(Long capaciteBloc) {
        this.capaciteBloc = capaciteBloc;
    }
}

