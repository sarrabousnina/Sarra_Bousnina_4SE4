package tn.esprit.sarra_bousnina_4se4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sarra_bousnina_4se4.Entities.Piste;
import tn.esprit.sarra_bousnina_4se4.services.PisteServicesImpl;

import java.util.List;

@AllArgsConstructor
@RequestMapping("piste")
@RestController
public class PisteRestConroller {
    private PisteServicesImpl pisteServices;
    @PostMapping("/addP")
    public Piste addPiste(@RequestBody Piste piste) {return pisteServices.addPiste(piste);}
    @GetMapping("get/{numPiste}")
    public Piste getPiste (@PathVariable Long numPiste )
    {
        return pisteServices.retreivePiste(numPiste);
    }
    @GetMapping("/getAll")
    public List<Piste> getAll(){return pisteServices.retreiveAll();}
    @PutMapping ("/update")
    public Piste updatePiste(@RequestBody Piste piste) {return pisteServices.updatePiste(piste);}
    @DeleteMapping("/delete/{numPiste}")
    public void delete(@PathVariable Long numPiste){
        pisteServices.deletePiste(numPiste);
    }

}