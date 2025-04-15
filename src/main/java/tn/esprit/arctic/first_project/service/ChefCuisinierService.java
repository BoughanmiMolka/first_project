package tn.esprit.arctic.first_project.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.first_project.entities.Menu;
import tn.esprit.arctic.first_project.repository.ChefCuisinierRepo;
import tn.esprit.arctic.first_project.repository.MenuRepo;
import tn.esprit.arctic.first_project.entities.ChefCuisinier;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor

public class ChefCuisinierService implements IChefCuisinerService{
ChefCuisinierRepo chefCuisinierRepository;
MenuRepo menuRepository;

    @Override
    public List<ChefCuisinier> retrieveAllChefsCuisinier() {
        return chefCuisinierRepository.findAll();
    }

    @Override
    public ChefCuisinier addChefCuisinier(ChefCuisinier e) {
        chefCuisinierRepository.save(e);
        return e;
    }

    @Override
    public ChefCuisinier updateChefCuisinier(ChefCuisinier e) {
        return chefCuisinierRepository.save(e);
    }
//
    @Override
    public ChefCuisinier retrieveChefCuisinier(Long idChefCuisinier) {
        return chefCuisinierRepository.findById(idChefCuisinier).get();
    }

    @Override
    public void removeChefCuisinier(Long idChefCuisinier) {
        chefCuisinierRepository.deleteById(idChefCuisinier);
    }

    @Override
    public List<ChefCuisinier> addChefsCuisinier(List<ChefCuisinier> ChefsCuisinier) {
        return chefCuisinierRepository.saveAll(ChefsCuisinier);
    }

    @Override
    public ChefCuisinier affecterChefCuisinierAMenu(Long idChefCuisinier, Long idMenu) {
        Menu menu = menuRepository.findById(idMenu).orElse(null);
        ChefCuisinier chefCuisinier = chefCuisinierRepository.findById(idChefCuisinier).orElse(null);
        Set<Menu> menus = new HashSet<>();
        if (menu != null && chefCuisinier != null) {
            menus = chefCuisinier.getMenu();
        }
        menus.add(menu);
        chefCuisinier.setMenu(menus);
        chefCuisinierRepository.save(chefCuisinier);
        return chefCuisinier;
    }

    @Override
    public ChefCuisinier desaffecterChefCuisinierDuMenu(Long idMenu, Long idChefCuisinier) {
        Menu menu = menuRepository.findById(idMenu).orElse(null);
        ChefCuisinier chefCuisinier = chefCuisinierRepository.findById(idChefCuisinier).orElse(null);
        Set<Menu> menus = new HashSet<>();
        if (menu != null && chefCuisinier != null){
            menus = chefCuisinier.getMenu();
        }
        menus.remove(menu);
        chefCuisinier.setMenu(menus);
        chefCuisinierRepository.save(chefCuisinier);
        return chefCuisinier;
    }

}
