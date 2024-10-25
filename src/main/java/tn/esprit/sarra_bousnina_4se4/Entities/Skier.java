package tn.esprit.sarra_bousnina_4se4.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.awt.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkier;
    private String name;
    @Column(nullable = false)
    private LocalDate birthDate;
    private int age;
    @OneToOne(cascade = {CascadeType.REMOVE ,CascadeType.PERSIST})
    Subscription subscription;
    @ManyToMany(mappedBy = "skiers")
    Set<Piste> pistes;
    @OneToMany(mappedBy = "skier",fetch = FetchType.EAGER)
    Set<Registration> registrations;


}



