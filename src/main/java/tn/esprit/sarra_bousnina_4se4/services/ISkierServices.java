package tn.esprit.sarra_bousnina_4se4.services;

import lombok.AllArgsConstructor;
import tn.esprit.sarra_bousnina_4se4.Entities.Skier;
import tn.esprit.sarra_bousnina_4se4.Entities.TypeSubscription;

import java.util.List;

public interface ISkierServices {

    public Skier addSkier(Skier skier);
    public Skier retreiveSkier(Long numSkier);
    public List<Skier> retreiveAll();
    void deleteSkier(Long numSkier);
    Skier updateSkier(Skier skier);
    void assignSkierToPiste(Long numSkier , Long numPiste);
    public void assignSubscriptionToSkier(Long subscriptionId, Long skierId);
    public Skier addSkierAndAssignToCourse(Skier skier,Long numCourse);
    public List<Skier> retreiveSkiersBySubscriptionType (TypeSubscription typeSubscription);
}
