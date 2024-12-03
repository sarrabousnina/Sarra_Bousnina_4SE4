package tn.esprit.sarra_bousnina_4se4.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.sarra_bousnina_4se4.Entities.Course;
import tn.esprit.sarra_bousnina_4se4.Entities.Support;

import java.util.List;

public interface ICourseRepository extends CrudRepository<Course,Long> {
    public List <Course> getCourseBySupport(Support support);
}
