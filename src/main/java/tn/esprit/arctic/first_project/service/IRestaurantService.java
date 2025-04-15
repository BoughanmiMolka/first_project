package tn.esprit.arctic.first_project.service;
import tn.esprit.arctic.first_project.entities.Restaurant;
import java.util.List;

public interface IRestaurantService {
    List<Restaurant> retrieveAllRestaurants();
    Restaurant addRestaurant(Restaurant e);
    Restaurant updateRestaurant(Restaurant e);
    Restaurant retrieveRestaurant(Long idRestaurant);
    void removeRestaurant(Long idRestaurant);
    List<Restaurant> addRestaurants (List<Restaurant> Restaurants);
    Restaurant affecterRestaurantAChaineRestauration(String nomRestaurant, String libelleChaine);
    Restaurant ajoutRestaurantEtMenuAssocies(Restaurant restaurant);
}
//