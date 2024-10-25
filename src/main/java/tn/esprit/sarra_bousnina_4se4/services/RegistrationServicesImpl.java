package tn.esprit.sarra_bousnina_4se4.services;

import org.springframework.stereotype.Service;
import tn.esprit.sarra_bousnina_4se4.Entities.Piste;
import tn.esprit.sarra_bousnina_4se4.Entities.Registration;
import tn.esprit.sarra_bousnina_4se4.repositories.IPisteRepository;
import tn.esprit.sarra_bousnina_4se4.repositories.IRegistrationRepository;

import java.util.List;
@Service
public class RegistrationServicesImpl implements IRegistrationServices{

    private IRegistrationRepository registrationRepository;
    @Override
    public Registration addRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration retreiveRegistration(Long numResgistration) {
        return registrationRepository.findById(numResgistration).orElse(null);
    }

    @Override
    public List<Registration> retreiveAll() {
        return (List<Registration>) registrationRepository.findAll();
    }

    @Override
    public void deleteResgistration(Long numRegistration) {
        registrationRepository.deleteById(numRegistration);
    }

    @Override
    public Registration updateRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }
}
