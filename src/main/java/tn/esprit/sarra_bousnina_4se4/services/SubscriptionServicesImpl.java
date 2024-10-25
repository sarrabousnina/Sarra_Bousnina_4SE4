package tn.esprit.sarra_bousnina_4se4.services;

import org.springframework.stereotype.Service;
import tn.esprit.sarra_bousnina_4se4.Entities.Piste;
import tn.esprit.sarra_bousnina_4se4.Entities.Subscription;
import tn.esprit.sarra_bousnina_4se4.repositories.IPisteRepository;
import tn.esprit.sarra_bousnina_4se4.repositories.ISubscriptionRepository;

import java.util.List;
@Service
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
}
