package tn.esprit.sarra_bousnina_4se4.services;

import tn.esprit.sarra_bousnina_4se4.Entities.Instructor;

import java.util.List;
import java.util.Set;

public interface IInstructorServices {
    public Instructor addInstructor(Instructor instructor);
    public Instructor retreiveInstructor(Long numInstructor);
    public List<Instructor> retreiveAll();
    void deleteInstructor(Long numInstructor);
    Instructor updateInstructor(Instructor instructor);
    public Instructor addAndAssignToCourses(Instructor ins, Set<Long> numCourses);
}
