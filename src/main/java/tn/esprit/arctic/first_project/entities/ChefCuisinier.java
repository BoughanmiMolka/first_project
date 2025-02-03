package tn.esprit.arctic.first_project.entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
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


}
