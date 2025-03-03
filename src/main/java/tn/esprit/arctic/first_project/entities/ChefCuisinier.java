package tn.esprit.arctic.first_project.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
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
@Table( name = "ChefCuisinier")
public class ChefCuisinier implements Serializable{ //serializable mahech obligatoire puisque nekhdmou en local w zeda khater version jdida mawjouda par defaut
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idChefCuisinier")
    private Long idChefCuisinier;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)// ou EnumType.ORDINAL twalli bel index mtaa l enum l but mteeha protection des données
    private TypeChef typeChef;

    @ManyToMany
    private Set<Menu> menu;

}
