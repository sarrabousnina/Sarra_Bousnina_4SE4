package tn.esprit.sarra_bousnina_4se4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.sarra_bousnina_4se4.Entities.Instructor;
import tn.esprit.sarra_bousnina_4se4.services.InstructorServicesImpl;

@AllArgsConstructor
@RequestMapping("Instructor")
@RestController
public class InstructorRestController {
    private InstructorServicesImpl instructorServices;

    @PostMapping("/addInstructor")
    public Instructor addInstructor(Instructor instructor) {
        return instructorServices.addInstructor(instructor);
    }
}
