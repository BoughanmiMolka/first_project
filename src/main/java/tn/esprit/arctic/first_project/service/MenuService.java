package tn.esprit.arctic.first_project.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.first_project.entities.Menu;
import tn.esprit.arctic.first_project.repository.MenuRepo;
import java.util.List;
@Service
@AllArgsConstructor


public class MenuService implements IMenuService{
    private MenuRepo menuRepo;

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
}
//