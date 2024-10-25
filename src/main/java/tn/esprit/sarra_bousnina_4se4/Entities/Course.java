package tn.esprit.sarra_bousnina_4se4.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCourse;
    private int level;
    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse;
    @Enumerated(EnumType.STRING)
    private Support support;
    private float price;
    private int timeSlot;
    @OneToMany(mappedBy = "course")
    Set<Registration> registrations;
}
