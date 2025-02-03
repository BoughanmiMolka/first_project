package tn.esprit.arctic.first_project.entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table( name = "ChaineRestauration")
public class ChaineRestauration implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "iChaineRestauration")
    private Long idChaineRestauration;
    private String libelle;
    private LocalDate dateCreation;

    @OneToMany(mappedBy = "chaineRestauration")
    private List<Restaurant> restaurants;

    public Long getIdChaineRestauration() {
        return idChaineRestauration;
    }

    public void setIdChaineRestauration(Long idChaineRestauration) {
        this.idChaineRestauration = idChaineRestauration;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}
