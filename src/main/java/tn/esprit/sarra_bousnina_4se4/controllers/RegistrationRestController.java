package tn.esprit.sarra_bousnina_4se4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.sarra_bousnina_4se4.Entities.Registration;
import tn.esprit.sarra_bousnina_4se4.services.RegistrationServicesImpl;

@AllArgsConstructor
@RequestMapping("Registration")
@RestController
public class RegistrationRestController {
    private RegistrationServicesImpl registrationServices;

    @PostMapping("/addRegistration")
    public Registration addRegistration(Registration registration) {
        return registrationServices.addRegistration(registration);
    }
}
