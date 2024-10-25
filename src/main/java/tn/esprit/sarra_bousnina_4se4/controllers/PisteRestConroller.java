package tn.esprit.sarra_bousnina_4se4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.sarra_bousnina_4se4.Entities.Piste;
import tn.esprit.sarra_bousnina_4se4.services.PisteServicesImpl;
@AllArgsConstructor
@RequestMapping("piste")
@RestController
public class PisteRestConroller {
    private PisteServicesImpl pisteServices;
    @PostMapping("/addP")
    public Piste addPiste(@RequestBody Piste piste) {return pisteServices.addPiste(piste);}
}
