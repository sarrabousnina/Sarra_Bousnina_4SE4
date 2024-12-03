package tn.esprit.sarra_bousnina_4se4.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sarra_bousnina_4se4.Entities.Instructor;
import tn.esprit.sarra_bousnina_4se4.services.InstructorServicesImpl;

import java.util.List;
import java.util.Set;
@Tag(name = "Gestion Instructor")
@AllArgsConstructor
@RequestMapping("Instructor")
@RestController
public class InstructorRestController {
    private InstructorServicesImpl instructorServices;
    @Operation(description = "Ajouter un nouvel instructeur")
    @PostMapping("/addInstructor")
    public Instructor addInstructor(Instructor instructor) {
        return instructorServices.addInstructor(instructor);
    }


    @Operation(description = "Récupérer un instructeur par son numéro")
    @GetMapping("/get/{numInstructor}")
    public Instructor getInstructor(@PathVariable Long numInstructor) {
        return instructorServices.retreiveInstructor(numInstructor);
    }


    @Operation(description = "Récupérer tous les instructeurs")
    @GetMapping("/getAll")
    public List<Instructor> getAllInstructors() {
        return instructorServices.retreiveAll();
    }


    @Operation(description = "Mettre à jour les informations d'un instructeur")
    @PutMapping("/update")
    public Instructor updateInstructor(@RequestBody Instructor instructor) {
        return instructorServices.updateInstructor(instructor);
    }


    @Operation(description = "Supprimer un instructeur par son numéro")
    @DeleteMapping("/delete/{numInstructor}")
    public void deleteInstructor(@PathVariable Long numInstructor) {
        instructorServices.deleteInstructor(numInstructor);
    }


    @Operation(description = "Ajouter un instructeur et l'assigner à des cours")
    @PostMapping ("/addAndAssigntoCourses/{numCourses}")
    public Instructor addAndAssignToCourses(@RequestBody Instructor ins,@PathVariable Set<Long> numCourses){
        return instructorServices.addAndAssignToCourses(ins,numCourses);

    }

}
