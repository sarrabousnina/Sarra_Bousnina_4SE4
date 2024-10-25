package tn.esprit.sarra_bousnina_4se4.services;

import org.springframework.stereotype.Service;
import tn.esprit.sarra_bousnina_4se4.Entities.Piste;
import tn.esprit.sarra_bousnina_4se4.Entities.Skier;
import tn.esprit.sarra_bousnina_4se4.repositories.IPisteRepository;
import tn.esprit.sarra_bousnina_4se4.repositories.ISkierRepository;

import java.util.List;
@Service
public class SkierServicesImpl implements ISkierServices{

    private ISkierRepository skierRepository;
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
}
