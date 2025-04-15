package tn.esprit.arctic.first_project.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.first_project.entities.ChaineRestauration;
import tn.esprit.arctic.first_project.entities.Menu;
import tn.esprit.arctic.first_project.entities.Restaurant;
import tn.esprit.arctic.first_project.repository.RestaurantRepo;
import tn.esprit.arctic.first_project.repository.ChaineRestaurationRepo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor

public class RestaurantService implements IRestaurantService {
    RestaurantRepo restaurantRepository;
    ChaineRestaurationRepo chaineRestaurationRepository;

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

    @Override
    public Restaurant affecterRestaurantAChaineRestauration(String nomRestaurant, String libelleChaine) {
        Restaurant restaurant = restaurantRepository.findByNom(nomRestaurant);
        ChaineRestauration chaineResto = chaineRestaurationRepository.findByLibelle(libelleChaine);
        restaurant.setChaineRestauration(chaineResto);
        return restaurantRepository.save(restaurant);
    }

    @Override
    public Restaurant ajoutRestaurantEtMenuAssocies(Restaurant restaurant) {
        Set<Menu> menus = new HashSet<>();
        if (restaurant.getMenu() != null) {
            for (Menu menu : menus) {
                menu.setPrixTotal(0f);
                menus.add(menu);
            }
        }
        restaurant.setMenu(menus);
        restaurantRepository.save(restaurant);
        return restaurant;

    }

}
