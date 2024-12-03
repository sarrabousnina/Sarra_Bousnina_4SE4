package tn.esprit.sarra_bousnina_4se4.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sarra_bousnina_4se4.Entities.Course;
import tn.esprit.sarra_bousnina_4se4.Entities.Registration;
import tn.esprit.sarra_bousnina_4se4.Entities.Skier;
import tn.esprit.sarra_bousnina_4se4.repositories.ICourseRepository;
import tn.esprit.sarra_bousnina_4se4.repositories.IRegistrationRepository;
import tn.esprit.sarra_bousnina_4se4.repositories.ISkierRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class RegistrationServicesImpl implements IRegistrationServices{

    private IRegistrationRepository registrationRepository;
    private ISkierRepository skierRepository;
    private ICourseRepository courseRepository;
    @Override
    public Registration addRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration retreiveRegistration(Long numResgistration) {
        return registrationRepository.findById(numResgistration).orElse(null);
    }

    @Override
    public List<Registration> retreiveAll() {
        return (List<Registration>) registrationRepository.findAll();
    }

    @Override
    public void deleteResgistration(Long numRegistration) {
        registrationRepository.deleteById(numRegistration);
    }

    @Override
    public Registration updateRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration addAndAssignToSkier(Registration registration, Long numSkier) {
        Skier skier=skierRepository.findById(numSkier).orElse(null);
        registration.setSkier(skier);
        return registrationRepository.save(registration);

    }

    @Override
    public Registration addAndAssignToCourse(Long numReg, Long numCourse) {
        Registration registration=registrationRepository.findById(numReg).orElse(null);
        Course course=courseRepository.findById(numCourse).orElse(null);
        registration.setCourse(course);
        return registrationRepository.save(registration);
    }


}
