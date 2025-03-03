package tn.esprit.arctic.first_project.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.first_project.service.IRestaurantService;
@RestController
@AllArgsConstructor
public class RestaurantController {
    IRestaurantService restaurantService;
}
