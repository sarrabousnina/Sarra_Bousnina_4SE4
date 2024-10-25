package tn.esprit.sarra_bousnina_4se4.services;

import tn.esprit.sarra_bousnina_4se4.Entities.Piste;
import tn.esprit.sarra_bousnina_4se4.Entities.Skier;

import java.util.List;

public interface ISkierServices {

    public Skier addSkier(Skier skier);
    public Skier retreiveSkier(Long numSkier);
    public List<Skier> retreiveAll();
    void deleteSkier(Long numSkier);
    Skier updateSkier(Skier skier);
}
