package tn.esprit.arctic.first_project.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.arctic.first_project.service.IChefCuisinerService;
@Controller
@AllArgsConstructor
public class ChefCuisinierController {
    IChefCuisinerService chefCuisinierService;
}
