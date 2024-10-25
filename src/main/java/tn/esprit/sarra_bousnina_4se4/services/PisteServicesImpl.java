package tn.esprit.sarra_bousnina_4se4.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.sarra_bousnina_4se4.Entities.Piste;
import tn.esprit.sarra_bousnina_4se4.repositories.IPisteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PisteServicesImpl implements IPisteServices{
    private IPisteRepository pisteRepository;
    @Override
    public Piste addPiste(Piste piste){ return pisteRepository.save(piste);}

    @Override
    public Piste retreivePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }

    @Override
    public List<Piste> retreiveAll() {
        return (List<Piste>) pisteRepository.findAll();
    }

    @Override
    public void deletePiste(Long numPiste) {
        pisteRepository.deleteById(numPiste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }


}
