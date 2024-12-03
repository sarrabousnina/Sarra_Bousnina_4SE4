package tn.esprit.sarra_bousnina_4se4.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    @ManyToOne
    Skier skier;
    @JsonIgnore //evite la boucle qui se produit lors de lexecution de assign
    @ManyToOne
    Course course;
}
