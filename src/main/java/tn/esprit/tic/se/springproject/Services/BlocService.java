package tn.esprit.tic.se.springproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tic.se.springproject.entities.Bloc;
import tn.esprit.tic.se.springproject.repository.BlocRepository;
import tn.esprit.tic.se.springproject.repository.ChambreRepository;

import java.util.List;


@Service
public class BlocService implements IBlocService{

    @Autowired
    BlocRepository blocRepository;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return (List<Bloc>) blocRepository.findAll();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc retrieveBloc(Long idbloc) {
        return blocRepository.findById(idbloc).get();
    }

    @Override
    public void removeBloc(Long idbloc) {
        blocRepository.deleteById(idbloc);
    }
}
