package tn.esprit.arctic.first_project.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.first_project.entities.Menu;
import tn.esprit.arctic.first_project.entities.TypeMenu;
import tn.esprit.arctic.first_project.repository.MenuRepo;

import tn.esprit.arctic.first_project.service.IMenuService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/menu")

public class MenuController {
    IMenuService menuService;

    @GetMapping("/findMenuByTypeMenuOrderByPrixTotal/{typeMenu}")
    public List<Menu> findMenuByTypeMenuOrderByPrixTotal (PathVariable("typeMenu") String typeMenu){
        System.out.println(typeMenu);
        TypeMenu typeMenu = TypeMenu.valueOf(typeMenu);
        return menuService.findMenuByTypeMenuOrderByPrixTotal(typeMenu);
    }
    @GetMapping("/retrieve-menu/MenuId")
    public Menu retrieveMenu(Long menuId){
        return menuService.retrieveMenu(menuId);
    }
    @PostMapping("/add-menu")
    public Menu addMenu(Menu e) {
        return menuService.addMenu(e);
    }
    @PutMapping("/update-menu")
    public Menu updateMenu(Menu e) {
        return menuService.updateMenu(e);
    }
    @DeleteMapping("/remove-menu/{MenuId}")
    public void removeMenu(Long menuId) {
        menuService.removeMenu(menuId);
    }
}
