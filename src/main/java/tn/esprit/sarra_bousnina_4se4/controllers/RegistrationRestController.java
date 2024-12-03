package tn.esprit.sarra_bousnina_4se4.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sarra_bousnina_4se4.Entities.Registration;
import tn.esprit.sarra_bousnina_4se4.services.RegistrationServicesImpl;

import java.util.List;
@Tag(name = "Gestion Registration")
@AllArgsConstructor
@RequestMapping("Registration")
@RestController
public class RegistrationRestController {
    private RegistrationServicesImpl registrationServices;
    @Operation(description = "Ajouter une nouvelle inscription")
    @PostMapping("/addRegistration")
    public Registration addRegistration(@RequestBody Registration registration) {
        return registrationServices.addRegistration(registration);
    }


    @Operation(description = "Récupérer une inscription par son numéro")
    @GetMapping("/get/{numRegistration}")
    public Registration getRegistration(@PathVariable Long numRegistration) {
        return registrationServices.retreiveRegistration(numRegistration);
    }


    @Operation(description = "Récupérer toutes les inscriptions")
    @GetMapping("/getAll")
    public List<Registration> getAllRegistrations() {
        return registrationServices.retreiveAll();
    }
    @Operation(description = "Mettre à jour les informations d'une inscription")
    @PutMapping("/update")
    public Registration updateRegistration(@RequestBody Registration registration) {
        return registrationServices.updateRegistration(registration);
    }


    @Operation(description = "Supprimer une inscription par son numéro")
    @DeleteMapping("/delete/{numRegistration}")
    public void deleteRegistration(@PathVariable Long numRegistration) {
        registrationServices.deleteResgistration(numRegistration);
    }


    @Operation(description = "Assigner une inscription à un skieur")
    @PutMapping("assignToSkier/{registration}/{numSkier}")
    public Registration addAndAssignToSkier(@PathVariable Registration registration,@PathVariable Long numSkier)
    {
        return registrationServices.addAndAssignToSkier(registration,numSkier);
    }


    @Operation(description = "Assigner une inscription à un cours")
    @PutMapping("/assignToCourse/{numReg}/{numCourse}")
    public Registration addAndAssignToCourse(@PathVariable Long numReg,@PathVariable Long numCourse)
    {
        return registrationServices.addAndAssignToCourse(numReg,numCourse);
    }

}
