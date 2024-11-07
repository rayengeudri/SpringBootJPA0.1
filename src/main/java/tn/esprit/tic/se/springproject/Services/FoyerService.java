package tn.esprit.tic.se.springproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tic.se.springproject.entities.Foyer;
import tn.esprit.tic.se.springproject.repository.FoyerRepository;

import java.util.List;
@Service
public class FoyerService implements IFoyerService{
@Autowired
    FoyerRepository foyerRepository;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return (List<Foyer>) foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) { return foyerRepository.save(f); }

    @Override
    public Foyer retrieveFoyer(Long idFoyer) {
        //return foyerRepository.findByID(idFoyer).orElse(null);
        return foyerRepository.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }
}
