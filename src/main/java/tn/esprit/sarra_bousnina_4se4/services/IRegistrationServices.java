package tn.esprit.sarra_bousnina_4se4.services;

import tn.esprit.sarra_bousnina_4se4.Entities.Piste;
import tn.esprit.sarra_bousnina_4se4.Entities.Registration;

import java.util.List;

public interface IRegistrationServices {
    public Registration addRegistration(Registration registration);
    public Registration retreiveRegistration(Long numResgistration);
    public List<Registration> retreiveAll();
    void deleteResgistration(Long numRegistration);
    Registration updateRegistration(Registration registration);
}
