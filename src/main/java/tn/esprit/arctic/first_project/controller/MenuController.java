package tn.esprit.arctic.first_project.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.first_project.entities.Menu;
import tn.esprit.arctic.first_project.entities.TypeMenu;
import tn.esprit.arctic.first_project.repository.MenuRepo;
import tn.esprit.arctic.first_project.service.IMenuService;
import tn.esprit.arctic.first_project.service.MenuService;


import tn.esprit.arctic.first_project.service.IMenuService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/menu")

public class MenuController {
    IMenuService menuService;
    @Autowired
    MenuRepo menuRepo;


    @GetMapping("/retrieve-all-menus")
    public List<Menu> getMenus(){
        return menuService.retrieveAllMenus();
    }
    @GetMapping("/retrieve-menu/MenuId")
    public Menu retrieveMenu(@PathVariable Long menuId){
        return menuService.retrieveMenu(menuId);
    }
    @PostMapping("/add-menu")
    public Menu addMenu(@RequestBody Menu e) {
        return menuService.addMenu(e);
    }
    @PutMapping("/update-menu")
    public Menu updateMenu(@RequestBody Menu e) {
        return menuService.updateMenu(e);
    }
    @DeleteMapping("/remove-menu/{MenuId}")
    public void removeMenu(Long menuId) {
        menuService.removeMenu(menuId);
    }

    @GetMapping("/getMenuByTypeandOrdre/{typeMenu}")
    public List<String> findMenuByTypeMenuOrderByPrixTotal(@PathVariable("typeMenu") String typeMenuStr) {
        TypeMenu typeMenu = TypeMenu.valueOf(typeMenuStr.toUpperCase());
        return menuRepo.findMenuByTypeMenuOrderByPrixTotal(typeMenu);
    }
}
