package tn.esprit.sarra_bousnina_4se4.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sarra_bousnina_4se4.Entities.Subscription;
import tn.esprit.sarra_bousnina_4se4.Entities.TypeSubscription;
import tn.esprit.sarra_bousnina_4se4.services.SubscriptionServicesImpl;

import java.util.List;
import java.util.Set;

@Tag(name = "Gestion Subscription")
@AllArgsConstructor
@RequestMapping("Subscription")
@RestController
public class SubscriptionRestController {
    private SubscriptionServicesImpl subscriptionServices;
    @Operation(description = "Ajouter une nouvelle souscription")
    @PostMapping("/addSubscription")
    public Subscription addSubscription(Subscription subscription) {
        return subscriptionServices.addSubscription(subscription);
    }


    @Operation(description = "Récupérer une souscription par son numéro")
    @GetMapping("/get/{numSubscription}")
    public Subscription getSubscription(@PathVariable Long numSubscription) {
        return subscriptionServices.retreiveSubscription(numSubscription);
    }


    @Operation(description = "Récupérer toutes les souscriptions")
    @GetMapping("/getAll")
    public List<Subscription> getAllSubscriptions() {
        return subscriptionServices.retreiveAll();
    }


    @Operation(description = "Mettre à jour les informations d'une souscription")
    @PutMapping("/update")
    public Subscription updateSubscription(@RequestBody Subscription subscription) {
        return subscriptionServices.updateSubscription(subscription);
    }


    @Operation(description = "Supprimer une souscription par son numéro")
    @DeleteMapping("/delete/{numSubscription}")
    public void deleteSubscription(@PathVariable Long numSubscription) {
        subscriptionServices.deleteSubscription(numSubscription);
    }

    @Operation(description = "Récupérer les abonnements par type d'abonnement, triés par date de début")
    @GetMapping("/byType/{type}")
    public Set<Subscription> getSubscriptionByType(@PathVariable TypeSubscription type) {
        return subscriptionServices.getSubscriptionByType(type);
    }

}
