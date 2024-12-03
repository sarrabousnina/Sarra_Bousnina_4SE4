package tn.esprit.sarra_bousnina_4se4.services;

import tn.esprit.sarra_bousnina_4se4.Entities.Piste;
import tn.esprit.sarra_bousnina_4se4.Entities.Subscription;
import tn.esprit.sarra_bousnina_4se4.Entities.TypeSubscription;

import java.util.List;
import java.util.Set;

public interface ISubscriptionService {
    public Subscription addSubscription(Subscription subscription);
    public Subscription retreiveSubscription(Long numSubscription);
    public List<Subscription> retreiveAll();
    void deleteSubscription(Long numSubscription);
    Subscription updateSubscription(Subscription subscription);
    public Set<Subscription> getSubscriptionByType(TypeSubscription type);
}
