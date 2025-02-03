package tn.esprit.arctic.first_project.entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table( name = "Composant")
public class Composant implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idComposant")
    private Long idComposant;
    private String nomComposant;
    private Float prix;
    @ManyToOne
    @JoinColumn( name = "idMenu")
    private Menu menu;

    @OneToOne
    @JoinColumn( name = "idDetailComposant")
    private DetailComposant detailComposant;

    public Long getIdComposant() {
        return idComposant;
    }

    public void setIdComposant(Long idComposant) {
        this.idComposant = idComposant;
    }

    public String getNomComposant() {
        return nomComposant;
    }

    public void setNomComposant(String nomComposant) {
        this.nomComposant = nomComposant;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public DetailComposant getDetailComposant() {
        return detailComposant;
    }

    public void setDetailComposant(DetailComposant detailComposant) {
        this.detailComposant = detailComposant;
    }
}
