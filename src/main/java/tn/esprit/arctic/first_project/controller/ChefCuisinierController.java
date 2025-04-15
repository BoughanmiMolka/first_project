package tn.esprit.arctic.first_project.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.first_project.entities.ChefCuisinier;
import tn.esprit.arctic.first_project.service.IChefCuisinerService;

import java.util.List;


@RestController
@Controller
@AllArgsConstructor
@RequestMapping("/chef")

public class ChefCuisinierController {
    IChefCuisinerService chefCuisinierService;

    @GetMapping("/retrieve-all-chefs")
    public List<ChefCuisinier> getChefs(){
        return chefCuisinierService.retrieveAllChefsCuisinier();
    }
    @GetMapping("/retrieve-chef/ChefId")
    public ChefCuisinier retrieveChef(@PathVariable("chefId") Long chefId) {
        return chefCuisinierService.retrieveChefCuisinier(chefId);
    }
    @PostMapping( "/add-chef")
    public ChefCuisinier addChef(@RequestBody ChefCuisinier e) {
        return chefCuisinierService.addChefCuisinier(e);
    }
    @PutMapping("/update-chef")
    public ChefCuisinier updateChef(@RequestBody ChefCuisinier e) {
        return chefCuisinierService.updateChefCuisinier(e);
    }
    @DeleteMapping("/remove-chef/ChefId")
    public void removeChef(@PathVariable("chefId") Long chefId) {
        chefCuisinierService.removeChefCuisinier(chefId);
    }
    @PutMapping("/affecter-chef/{idChef}/{idMenu}")
    public ChefCuisinier affecterChefCuisinierAMenu(
            @PathVariable("idChef") Long idChef,
            @PathVariable("idMenu") Long idMenu) {
        return chefCuisinierService.affecterChefCuisinierAMenu(idChef, idMenu);
    }
    @DeleteMapping("/desaffecter-chef/{idMenu}/{idChef}")
    public ChefCuisinier desaffecterChefCuisinierDuMenu(
            @PathVariable("idMenu") Long idMenu,
            @PathVariable("idChef") Long idChef) {
        return chefCuisinierService.desaffecterChefCuisinierDuMenu(idMenu, idChef);
    }

}
