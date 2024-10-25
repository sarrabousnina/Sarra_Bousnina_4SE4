package tn.esprit.sarra_bousnina_4se4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.sarra_bousnina_4se4.Entities.Skier;
import tn.esprit.sarra_bousnina_4se4.services.SkierServicesImpl;

@AllArgsConstructor
@RequestMapping("Skier")
@RestController
public class SkierRestController {
    private SkierServicesImpl skierServices;

    @PostMapping("/addSkier")
    public Skier addSkier(Skier skier) {
        return skierServices.addSkier(skier);
    }
}
