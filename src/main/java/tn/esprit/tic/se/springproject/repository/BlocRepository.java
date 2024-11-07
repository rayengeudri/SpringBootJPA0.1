package tn.esprit.tic.se.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.se.springproject.entities.Bloc;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
    List<Bloc> findByFoyerrUniversiteeIdUniversite(Long iduniversite);
}
