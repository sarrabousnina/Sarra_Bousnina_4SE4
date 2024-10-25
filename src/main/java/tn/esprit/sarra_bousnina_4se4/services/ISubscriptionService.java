package tn.esprit.sarra_bousnina_4se4.services;

import tn.esprit.sarra_bousnina_4se4.Entities.Piste;
import tn.esprit.sarra_bousnina_4se4.Entities.Subscription;

import java.util.List;

public interface ISubscriptionService {
    public Subscription addSubscription(Subscription subscription);
    public Subscription retreiveSubscription(Long numSubscription);
    public List<Subscription> retreiveAll();
    void deleteSubscription(Long numSubscription);
    Subscription updateSubscription(Subscription subscription);

}
