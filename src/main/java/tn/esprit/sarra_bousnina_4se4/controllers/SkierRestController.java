package tn.esprit.sarra_bousnina_4se4.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sarra_bousnina_4se4.Entities.Skier;
import tn.esprit.sarra_bousnina_4se4.Entities.TypeSubscription;
import tn.esprit.sarra_bousnina_4se4.services.SkierServicesImpl;

import java.util.List;
@Tag(name = "Gestion Skier")
@AllArgsConstructor
@RequestMapping("Skier")
@RestController
public class SkierRestController {
    private SkierServicesImpl skierServices;
    @Operation(description = "Ajouter un nouveau skieur")
    @PostMapping("/addSkier")
    public Skier addSkier(@RequestBody Skier skier) {
        return skierServices.addSkier(skier);
    }



    @Operation(description = "Récupérer un skieur par son numéro")
    @GetMapping("/get/{numSkier}")
    public Skier getSkier(@PathVariable Long numSkier) {
        return skierServices.retreiveSkier(numSkier);
    }


    @Operation(description = "Récupérer tous les skieurs")
    @GetMapping("/getAll")
    public List<Skier> getAllSkiers() {
        return skierServices.retreiveAll();
    }



    @Operation(description = "Mettre à jour les informations d'un skieur")
    @PutMapping("/update")
    public Skier updateSkier(@RequestBody Skier skier) {
        return skierServices.updateSkier(skier);
    }



    @Operation(description = "Supprimer un skieur par son numéro")
    @DeleteMapping("/delete/{numSkier}")
    public void deleteSkier(@PathVariable Long numSkier) {
        skierServices.deleteSkier(numSkier);
    }


    @Operation(description = "Assigner un skieur à une piste")
    @PutMapping("assignToPiste/{numSkier}/{numPiste}")
    public void assignSkierToPiste(Long numSkier, Long numPiste){
        skierServices.assignSkierToPiste(numSkier,numPiste);
    }

    @Operation(description = "Assigner un abonnement à un skieur")
    @PutMapping("/assignSubscription/{skierId}/{subscriptionId}")
    public void assignSubscriptionToSkier(@PathVariable Long skierId, @PathVariable Long subscriptionId) {
        skierServices.assignSubscriptionToSkier(subscriptionId, skierId);

    }
    @Operation(description = "Assigner un skier à une course")
    @PostMapping("/assignSubscription/{numCourse}")
    public Skier addSkierAndAssignToCourse(@RequestBody Skier skier,@PathVariable Long numCourse){
       return skierServices.addSkierAndAssignToCourse(skier,numCourse);
    }
    @Operation(description = "Récupérer les skieurs par type d'abonnement")
    @GetMapping("/bySubscriptionType/{typeSubscription}")
    public List<Skier> getSkiersBySubscriptionType(@PathVariable TypeSubscription typeSubscription) {
        return skierServices.retreiveSkiersBySubscriptionType(typeSubscription);
    }
    @GetMapping("/retreiveSkiersBySubscriptionType/{typeSubscription}")
    List<Skier> findBySubscription_TypeSub(@PathVariable TypeSubscription typeSubscription){
       return skierServices.retreiveSkiersBySubscriptionType(typeSubscription);
    }
}
