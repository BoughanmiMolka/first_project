package tn.esprit.arctic.first_project.entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table (name = "DetailComposant")
public class DetailComposant implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetailComposant")
    private Float imc;
    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;

    public Float getImc() {
        return imc;
    }

    public void setImc(Float imc) {
        this.imc = imc;
    }

    public TypeComposant getTypeComposant() {
        return typeComposant;
    }

    public void setTypeComposant(TypeComposant typeComposant) {
        this.typeComposant = typeComposant;
    }
}
