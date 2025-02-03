package tn.esprit.arctic.first_project.entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table( name = "ChefCuisinier")
public class ChefCuisinier implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idChefCuisinier")
    private Long idChefCuisinier;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private TypeChef typeChef;

    @ManyToMany
    @JoinTable(
            name = "menu_chef",
            joinColumns = @JoinColumn(name = "chef_id"),
            inverseJoinColumns = @JoinColumn(name = "menu_id")
            )
    private List<Menu> menus;

    public Long getIdChefCuisinier() {
        return idChefCuisinier;
    }

    public void setIdChefCuisinier(Long idChefCuisinier) {
        this.idChefCuisinier = idChefCuisinier;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public TypeChef getTypeChef() {
        return typeChef;
    }

    public void setTypeChef(TypeChef typeChef) {
        this.typeChef = typeChef;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
}
