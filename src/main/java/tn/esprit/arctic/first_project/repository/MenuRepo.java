package tn.esprit.arctic.first_project.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.first_project.entities.Menu;
import tn.esprit.arctic.first_project.entities.TypeMenu;
import org.springframework.data.repository.query.Param;
import java.util.List;
@Repository


//
public interface MenuRepo extends JpaRepository<Menu, Long>{
    //1.4
    List<Menu> findByTypeMenuAndPrixTotalGreaterThan(String typeMenu, float prixTotal);
    //2.1
    @Query("SELECT m.libelleMenu FROM Menu m WHERE m.typeMenu = :typeMenu ORDER BY m.prixTotal")
    List<Menu> findMenuByTypeMenuOrderByPrixTotal(@Param("typeMenu") TypeMenu typeMenu);
    //2.2
    @Query("SELECT DISTINCT m FROM Menu m JOIN m.composant c WHERE c.detailComposant.typeComposant = :typeComposant")
    List<Menu> findMenuByTypeComposant(@Param("typeComposant") String typeComposant);
    Menu findByLibelleMenu(String libelleMenu);



}
