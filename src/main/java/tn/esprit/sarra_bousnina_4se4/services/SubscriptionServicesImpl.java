package tn.esprit.sarra_bousnina_4se4.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sarra_bousnina_4se4.Entities.Piste;
import tn.esprit.sarra_bousnina_4se4.Entities.Skier;
import tn.esprit.sarra_bousnina_4se4.Entities.Subscription;
import tn.esprit.sarra_bousnina_4se4.Entities.TypeSubscription;
import tn.esprit.sarra_bousnina_4se4.repositories.IPisteRepository;
import tn.esprit.sarra_bousnina_4se4.repositories.ISubscriptionRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class SubscriptionServicesImpl implements ISubscriptionService{

    private ISubscriptionRepository subscriptionRepository;
    @Override
    public Subscription addSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription retreiveSubscription(Long numSubscription) {
        return subscriptionRepository.findById(numSubscription).orElse(null);
    }

    @Override
    public List<Subscription> retreiveAll() {
        return (List<Subscription>) subscriptionRepository.findAll();
    }

    @Override
    public void deleteSubscription(Long numSubscription) {
        subscriptionRepository.deleteById(numSubscription);
    }

    @Override
    public Subscription updateSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Set<Subscription> getSubscriptionByType(TypeSubscription type) {
        return subscriptionRepository.findByTypeSubOrderByStartDate(type);
        /*List<Subscription> subscriptions = (List<Subscription>) subscriptionRepository.findAll();
        Set<Subscription> Set_sub = new HashSet<Subscription>();
        for (Subscription s:subscriptions){
            if (s.getTypeSub()==type){
                Set_sub.add(s);
            }
        }
        return Set_sub;*/
    }
}
