package tn.esprit.arctic.first_project.entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
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

    public Long getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Long idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getNbPlaceMax() {
        return nbPlaceMax;
    }

    public void setNbPlaceMax(Long nbPlaceMax) {
        this.nbPlaceMax = nbPlaceMax;
    }


}
