package tn.esprit.sarra_bousnina_4se4.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Subscription implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSub;
    private LocalDate startDate;
    private LocalDate endDate;
    private float price;
    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSub;
}
