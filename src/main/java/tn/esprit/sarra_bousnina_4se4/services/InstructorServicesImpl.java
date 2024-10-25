package tn.esprit.sarra_bousnina_4se4.services;

import org.springframework.stereotype.Service;
import tn.esprit.sarra_bousnina_4se4.Entities.Instructor;
import tn.esprit.sarra_bousnina_4se4.repositories.IInstructorRepository;

import java.util.List;
@Service
public class InstructorServicesImpl implements IInstructorServices {

    private IInstructorRepository instructorRepository;
    @Override
    public Instructor addInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor retreiveInstructor(Long numInstructor) {
        return instructorRepository.findById(numInstructor).orElse(null);
    }

    @Override
    public List<Instructor> retreiveAll() {
        return (List<Instructor>) instructorRepository.findAll();
    }

    @Override
    public void deleteInstructor(Long numInstructor) {
        instructorRepository.deleteById(numInstructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }
}
