package tn.esprit.sarra_bousnina_4se4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.sarra_bousnina_4se4.Entities.Course;
import tn.esprit.sarra_bousnina_4se4.services.CourseServicesImpl;

@AllArgsConstructor
@RequestMapping("Course")
@RestController
public class CourseRestController {
    private CourseServicesImpl courseServices;

    @PostMapping("/addCourse")
    public Course addCourse(Course course) {
        return courseServices.addCourse(course);
    }
}
