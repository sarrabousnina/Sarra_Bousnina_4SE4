package tn.esprit.sarra_bousnina_4se4.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sarra_bousnina_4se4.Entities.Piste;
import tn.esprit.sarra_bousnina_4se4.services.PisteServicesImpl;

import java.util.List;
@Tag(name = "Gestion Piste")
@AllArgsConstructor
@RequestMapping("piste")
@RestController
public class PisteRestConroller {
    private PisteServicesImpl pisteServices;
    @Operation(description = "Ajouter une nouvelle piste")
    @PostMapping("/addP")
    public Piste addPiste(@RequestBody Piste piste) {return pisteServices.addPiste(piste);}


    @Operation(description = "Récupérer une piste par son numéro")
    @GetMapping("get/{numPiste}")
    public Piste getPiste (@PathVariable Long numPiste )
    {
        return pisteServices.retreivePiste(numPiste);
    }


    @Operation(description = "Récupérer toutes les pistes")
    @GetMapping("/getAll")
    public List<Piste> getAll(){return pisteServices.retreiveAll();}


    @Operation(description = "Mettre à jour les informations d'une piste")
    @PutMapping ("/update")
    public Piste updatePiste(@RequestBody Piste piste) {return pisteServices.updatePiste(piste);}


    @Operation(description = "Supprimer une piste par son numéro")
    @DeleteMapping("/delete/{numPiste}")
    public void delete(@PathVariable Long numPiste){
        pisteServices.deletePiste(numPiste);
    }

}