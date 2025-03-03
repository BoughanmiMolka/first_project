package tn.esprit.arctic.first_project.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.first_project.entities.Restaurant;
import tn.esprit.arctic.first_project.repository.RestaurantRepo;
import java.util.List;
@Service
@AllArgsConstructor

public class RestaurantService implements IRestaurantService {
    RestaurantRepo restaurantRepository;

    @Override
    public List<Restaurant> retrieveAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @Override
    public Restaurant addRestaurant(Restaurant e) {
        restaurantRepository.save(e);
        return e;
    }

    @Override
    public Restaurant updateRestaurant(Restaurant e) {
        return restaurantRepository.save(e);
    }
//
    @Override
    public Restaurant retrieveRestaurant(Long idRestaurant) {
        return restaurantRepository.findById(idRestaurant).get();
    }

    @Override
    public void removeRestaurant(Long idRestaurant) {
        restaurantRepository.deleteById(idRestaurant);
    }

    @Override
    public List<Restaurant> addRestaurants(List<Restaurant> restaurants) {
       return restaurantRepository.saveAll(restaurants);
    }

}
