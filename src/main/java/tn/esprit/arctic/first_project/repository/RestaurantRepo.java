package tn.esprit.arctic.first_project.repository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.first_project.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
@Repository
//
public interface RestaurantRepo extends JpaRepository<Restaurant, Long>{
    List<Restaurant>findByChaineRestaurationLibelleAndChaineRestaurationDateCreation(String l, Date dateC);
    //1.5
    List<Restaurant> findByNbPlaceMaxGreaterThanAndChaineRestaurationDateCreationBefore(Long nbPlaceMax, Date dateC);

}
