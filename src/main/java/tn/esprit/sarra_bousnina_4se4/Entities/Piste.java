package tn.esprit.sarra_bousnina_4se4.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.awt.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Piste implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long numPiste ;
        private String namePiste;
        @Enumerated(EnumType.STRING)
        private Color color;
        private int length ;
        private int slope ;
        @ManyToMany
        Set<Skier> skiers;

}
