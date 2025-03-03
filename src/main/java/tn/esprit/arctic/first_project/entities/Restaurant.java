package tn.esprit.arctic.first_project.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
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
@Table( name = "Restaurant")
public class Restaurant implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="idRestaurant")
    private Long idRestaurant;
    private String nom;
    private Long nbPlaceMax;

    @OneToMany
    private Set<Menu> menu;

    @ManyToOne
    private ChaineRestauration chaineRestauration;


}
