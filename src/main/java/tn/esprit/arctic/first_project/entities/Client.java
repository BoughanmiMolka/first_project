package tn.esprit.arctic.first_project.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder // fi 3oudh ma naamel new Client() n7ott Client.builder().idClient(1).identifiant("1").build();
@Slf4j // Logger
@Table( name = "Client")
public class Client implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idClient")
    Long idClient; // Clé primaire
    String identifiant;
    @Temporal(TemporalType.DATE)
    Date datePremiereVisite;

    @OneToMany(mappedBy = "client")
    Set<Commande> commandes;





}