package tn.esprit.sarra_bousnina_4se4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.sarra_bousnina_4se4.Entities.Subscription;
import tn.esprit.sarra_bousnina_4se4.services.SubscriptionServicesImpl;

@AllArgsConstructor
@RequestMapping("Subscription")
@RestController
public class SubscriptionRestController {
    private SubscriptionServicesImpl subscriptionServices;

    @PostMapping("/addSubscription")
    public Subscription addSubscription(Subscription subscription) {
        return subscriptionServices.addSubscription(subscription);
    }
}
