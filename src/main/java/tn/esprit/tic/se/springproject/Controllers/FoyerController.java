package tn.esprit.tic.se.springproject.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.se.springproject.Services.IBlocService;
import tn.esprit.tic.se.springproject.Services.IFoyerService;
import tn.esprit.tic.se.springproject.entities.Bloc;
import tn.esprit.tic.se.springproject.entities.Foyer;

import java.util.List;
@RestController
@AllArgsConstructor

@RequestMapping("/foyers")
public class FoyerController {


        private IFoyerService foyerService;

        @GetMapping("/retrieveAllFoyer")
        @Procedure
        public List<Foyer> getAllBlocs(){
            return foyerService.retrieveAllFoyers();
        }


        @PostMapping("/addFoyer")
        public Foyer addFoyer(@RequestBody Foyer foyer) {
            return foyerService.addFoyer(foyer);
        }

        @DeleteMapping("/deleteFoyer/{id}")
        public void deleteFoyer(@PathVariable ("id")Long id){
            foyerService.removeFoyer(id);
        }
        @PutMapping("/updateFoyer")
        public Foyer updateFoyer(@RequestBody Foyer foyer) {
            return foyerService.updateFoyer(foyer);
        }

}
