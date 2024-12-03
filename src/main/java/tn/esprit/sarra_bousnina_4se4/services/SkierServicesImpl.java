package tn.esprit.sarra_bousnina_4se4.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.sarra_bousnina_4se4.Entities.*;
import tn.esprit.sarra_bousnina_4se4.repositories.*;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class SkierServicesImpl implements ISkierServices{

    private ISkierRepository skierRepository;
    private IPisteRepository pisteRepository;
    private ISubscriptionRepository subscriptionRepository;
    private ICourseRepository courseRepository;
    private IRegistrationRepository registrationRepository;
    @Override
    public Skier addSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier retreiveSkier(Long numSkier) {
        return skierRepository.findById(numSkier).orElse(null);
    }

    @Override
    public List<Skier> retreiveAll() {
        return (List<Skier>) skierRepository.findAll();
    }

    @Override
    public void deleteSkier(Long numSkier) {
        skierRepository.deleteById(numSkier);
    }

    @Override
    public Skier updateSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public void assignSkierToPiste(Long numSkier, Long numPiste) {
        Skier skier= skierRepository.findById(numSkier).orElse(null);
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        piste.getSkiers().add(skier);
        pisteRepository.save(piste);
    }

    @Override
    public void assignSubscriptionToSkier(Long subscriptionId, Long skierId) {
        Skier skier = skierRepository.findById(skierId).orElseThrow(null) ;
        Subscription subscription = subscriptionRepository.findById(subscriptionId).orElse(null);
        skier.setSubscription(subscription);
        skierRepository.save(skier);
    }
    @Transactional
    @Override
    public Skier addSkierAndAssignToCourse(Skier skier, Long numCourse) {

        Course course =courseRepository.findById(numCourse).orElse(null);
        for (Registration registration :skier.getRegistrations())
        {
            registration.setCourse(course);
            registration.setSkier(skier);
            registrationRepository.save(registration);
        }
        return skierRepository.save(skier);
    }

    @Override
    public List<Skier> retreiveSkiersBySubscriptionType(TypeSubscription typeSubscription) {
       return skierRepository.getSkierBySubscription_TypeSub(typeSubscription);}

        /*List<Skier> skiers= (List<Skier>) skierRepository.findAll();
        List<Skier> Liste_skiers = new ArrayList<Skier>();
        for (Skier s:skiers){
            if (s.getSubscription().getTypeSub()==typeSubscription){
                Liste_skiers.add(s);
            }
        }
        return Liste_skiers;*/


}
