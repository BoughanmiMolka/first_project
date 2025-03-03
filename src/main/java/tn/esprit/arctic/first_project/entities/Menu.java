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
@Table( name = "Menu")
public class Menu implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idMenu")
    private Long idMenu;
    private String libelleMenu;
    private Float prixTotal;
    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;


    @ManyToMany (mappedBy = "menu")
    private Set<ChefCuisinier> chefs;

    @OneToMany(mappedBy = "menu")
    private Set<Commande> commandes;

    @OneToMany(mappedBy = "menu")
    private Set<Composant> composant;



}
