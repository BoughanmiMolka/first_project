package tn.esprit.arctic.first_project.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.first_project.entities.Restaurant;
import tn.esprit.arctic.first_project.service.IRestaurantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/restaurant")
public class RestaurantController {
    IRestaurantService restaurantService;

    @GetMapping("/retrieve-all-Restaurants")
    public List<Restaurant> getRestaurants() {
        return restaurantService.retrieveAllRestaurants();
    }
    @GetMapping("/retrieve-Restaurant/{Restaurant-id}")
    public Restaurant retrieveRestaurant(@PathVariable("Restaurant-id") Long RestaurantId) {
        return restaurantService.retrieveRestaurant(RestaurantId);
    }
    @PostMapping("/add-restaurant")
    public Restaurant addCRestaurant(@RequestBody Restaurant c) {
        return restaurantService.addRestaurant(c);
    }
    @DeleteMapping("/remove-Restaurant/{Restaurant-id}")
    public void removeRestaurant(@PathVariable("Restaurant-id") Long RestaurantId) {
        restaurantService.removeRestaurant(RestaurantId);
    }
    @PutMapping("/update-Restaurant")
    public Restaurant updateRestaurant(@RequestBody Restaurant c) {
        return restaurantService.updateRestaurant(c);
    }

    @PutMapping("/restaurant/affecterR/{nom}/{libelle}")
    public Restaurant affecterRestaurantAChaineRestauration(@PathVariable("nom") String nomRestaurant, @PathVariable("libelle") String libelleChaine) {
        return restaurantService.affecterRestaurantAChaineRestauration(nomRestaurant, libelleChaine);
    }
    @PostMapping("/ajouter-restaurant-menus")
    public Restaurant ajoutRestaurantEtMenuAssocies(@RequestBody Restaurant restaurant) {
        return restaurantService.ajoutRestaurantEtMenuAssocies(restaurant);
    }

}
