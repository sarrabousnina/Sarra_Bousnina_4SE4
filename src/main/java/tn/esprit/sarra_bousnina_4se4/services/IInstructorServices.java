package tn.esprit.sarra_bousnina_4se4.services;

import tn.esprit.sarra_bousnina_4se4.Entities.Instructor;

import java.util.List;

public interface IInstructorServices {
    public Instructor addInstructor(Instructor instructor);
    public Instructor retreiveInstructor(Long numInstructor);
    public List<Instructor> retreiveAll();
    void deleteInstructor(Long numInstructor);
    Instructor updateInstructor(Instructor instructor);

}
