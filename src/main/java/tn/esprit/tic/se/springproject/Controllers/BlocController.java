package tn.esprit.tic.se.springproject.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.se.springproject.Services.IBlocService;
import tn.esprit.tic.se.springproject.entities.Bloc;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.util.List;

@RestController
@AllArgsConstructor

@RequestMapping("/blocs")
public class BlocController {
    private IBlocService   blocService;

    @GetMapping("/retrieveAllBlocs")
    @Procedure
    public List<Bloc> getAllBlocs(){
        return blocService.retrieveAllBlocs();
    }


    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    @DeleteMapping("/deleteBloc/{id}")
    public void deleteBloc(@PathVariable ("id")Long id){
        blocService.removeBloc(id);
    }
    @PutMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }
}
