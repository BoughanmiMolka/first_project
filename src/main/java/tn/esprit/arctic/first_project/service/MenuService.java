package tn.esprit.arctic.first_project.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.first_project.entities.Composant;
import tn.esprit.arctic.first_project.entities.Menu;
import tn.esprit.arctic.first_project.entities.TypeMenu;
import tn.esprit.arctic.first_project.repository.MenuRepo;
import tn.esprit.arctic.first_project.repository.ComposantRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor


public class MenuService implements IMenuService{
    private MenuRepo menuRepo;
    private ComposantRepo composantRepo;

    public List<Menu> retrieveAllMenus() {
        return menuRepo.findAll();
    }

    public Menu addMenu(Menu e) {
        menuRepo.save(e);
        return e;
    }

    public Menu updateMenu(Menu e) {
        return menuRepo.save(e);
    }

    public Menu retrieveMenu(Long idMenu) {
        return menuRepo.findById(idMenu).get();
    }

    public void removeMenu(Long idMenu) {
        menuRepo.deleteById(idMenu);
    }

    public List<Menu> addMenus(List<Menu> Menus) {
        return menuRepo.saveAll(Menus);
    }

    @Override
    public Menu ajoutComposantsEtMiseAjourPrixMenu(Set<Composant> composants, Long idMenu) {
        Menu menu = menuRepo.findById(idMenu).get();
        Set<Composant> composantsMenu = menu.getComposant();
        composantsMenu.addAll(composants);
        menu.setComposant(composantsMenu);
        float prixTotal = 0;
        for (Composant composant : composantsMenu) {
            prixTotal += composant.getPrix();
        }
        if (prixTotal > 20) {
            System.out.println("Le prix total du menu ne doit pas dépasser 20 dinars\n");
        }else {
            composantRepo.saveAll(composants);
            menu.setPrixTotal(prixTotal);
            menuRepo.save(menu);
            System.out.println("Le prix total du menu est de " + prixTotal + " dinars\n");
        }
        return menu;
        }

    @Override
    public List<String> nomMenuParTypeMenuOrdonneParPrixTotal(String typeMenu) {
        return null;
    }
    


}

//