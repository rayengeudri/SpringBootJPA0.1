package tn.esprit.tic.se.springproject.Services;

import org.springframework.stereotype.Service;
import tn.esprit.tic.se.springproject.entities.Bloc;
import tn.esprit.tic.se.springproject.entities.Foyer;

import java.util.List;

@Service
public interface IBlocService {
    List<Bloc> retrieveAllBlocs();
    Bloc addBloc(Bloc b);
    Bloc updateBloc(Bloc b);
    Bloc retrieveBloc(Long idbloc);
    void removeBloc(Long idbloc);
}

