package tn.esprit.sarra_bousnina_4se4.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.sarra_bousnina_4se4.Entities.Course;
import tn.esprit.sarra_bousnina_4se4.Entities.Support;
import tn.esprit.sarra_bousnina_4se4.services.CourseServicesImpl;

import java.util.List;
@Tag(name = "Gestion Course")
@AllArgsConstructor //si on a des attributs final on met @RequiredArgsConstructor
@RequestMapping("Course")
@RestController
public class CourseRestController {
    private CourseServicesImpl courseServices;
    @Operation(description = "Ajouter un nouveau cours")
    @PostMapping("/addCourse")
    public Course addCourse(Course course) {
        return courseServices.addCourse(course);
    }



    @Operation(description = "Récupérer un cours par son numéro")
    @GetMapping("/get/{numCourse}")
    public Course getCourse(@PathVariable Long numCourse) {
        return courseServices.retreiveCourse(numCourse);
    }



    @Operation(description = "Récupérer tous les cours")
    @GetMapping("/getAll")
    public List<Course> getAllCourses() {
        return courseServices.retreiveAll();
    }



    @Operation(description = "Mettre à jour les informations d'un cours")
    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course) {
        return courseServices.updateCourse(course);
    }



    @Operation(description = "Supprimer un cours par son numéro")
    @DeleteMapping("/delete/{numCourse}")
    public void deleteCourse(@PathVariable Long numCourse) {
        courseServices.deleteCourse(numCourse);
    }


    @Operation(description = "Récupérer tous les cours associés à un support spécifique")
    @GetMapping("/getBySupport/{support}")
    public List <Course> getCourseBySupport(@PathVariable Support support){
        return courseServices.getCourseBySupport(support);
    }
}
