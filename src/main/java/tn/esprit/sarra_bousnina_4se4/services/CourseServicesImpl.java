package tn.esprit.sarra_bousnina_4se4.services;

import org.springframework.stereotype.Service;
import tn.esprit.sarra_bousnina_4se4.Entities.Course;
import tn.esprit.sarra_bousnina_4se4.Entities.Piste;
import tn.esprit.sarra_bousnina_4se4.repositories.ICourseRepository;
import tn.esprit.sarra_bousnina_4se4.repositories.IPisteRepository;

import java.util.List;
@Service
public class CourseServicesImpl implements ICourseServices{

    private ICourseRepository courseRepository;
    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);    }

    @Override
    public Course retreiveCourse(Long numCourse) {
        return courseRepository.findById(numCourse).orElse(null);
    }

    @Override
    public List<Course> retreiveAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public void deleteCourse(Long numCourse) {
        courseRepository.deleteById(numCourse);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }
}
