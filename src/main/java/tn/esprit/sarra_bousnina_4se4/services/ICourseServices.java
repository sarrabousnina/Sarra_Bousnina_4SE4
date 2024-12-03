package tn.esprit.sarra_bousnina_4se4.services;

import tn.esprit.sarra_bousnina_4se4.Entities.Course;
import tn.esprit.sarra_bousnina_4se4.Entities.Piste;
import tn.esprit.sarra_bousnina_4se4.Entities.Support;

import java.util.List;

public interface ICourseServices {
    public Course addCourse(Course course);
    public Course retreiveCourse(Long numCourse);
    public List<Course> retreiveAll();
    void deleteCourse(Long numCourse);
    Course updateCourse(Course course);
    public List <Course> getCourseBySupport(Support support);
}
