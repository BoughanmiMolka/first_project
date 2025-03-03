package tn.esprit.arctic.first_project.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Slf4j
@Table( name = "ChaineRestauration")
public class ChaineRestauration implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "iChaineRestauration")
    private Long idChaineRestauration;
    private String libelle;
    private LocalDate dateCreation;

    @OneToMany(mappedBy = "chaineRestauration")
    private Set<Restaurant> restaurants;


}
