package tn.esprit.sarra_bousnina_4se4.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Registration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numRegistration;
    private int numWeek;
    @ManyToOne
    Skier skier;
    @ManyToOne
    Course course;
}
