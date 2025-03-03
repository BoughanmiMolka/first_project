package tn.esprit.arctic.first_project.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

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
@Table( name = "Composant")
public class Composant implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idComposant")
    private Long idComposant;
    private String nomComposant;
    private Float prix;

    @ManyToOne
    private Menu menu;
    @OneToOne
    private DetailComposant detailComposant;

}
