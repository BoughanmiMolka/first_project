package tn.esprit.arctic.first_project.entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
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


    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

    public String getLibelleMenu() {
        return libelleMenu;
    }

    public void setLibelleMenu(String libelleMenu) {
        this.libelleMenu = libelleMenu;
    }

    public Float getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(Float prixTotal) {
        this.prixTotal = prixTotal;
    }

    public TypeMenu getTypeMenu() {
        return typeMenu;
    }

    public void setTypeMenu(TypeMenu typeMenu) {
        this.typeMenu = typeMenu;
    }


    public Set<ChefCuisinier> getChefs() {
        return chefs;
    }

    public void setChefs(Set<ChefCuisinier> chefs) {
        this.chefs = chefs;
    }
}
