package tn.esprit.arctic.first_project.service;
import tn.esprit.arctic.first_project.entities.Composant;
import tn.esprit.arctic.first_project.entities.Menu;
import java.util.List;
import java.util.Set;

public interface IMenuService {
    List<Menu> retrieveAllMenus();
    Menu addMenu(Menu e);
    Menu updateMenu(Menu e);
    Menu retrieveMenu(Long idMenu);
    void removeMenu(Long idMenu);
    List<Menu> addMenus (List<Menu> Menus);
    Menu ajoutComposantsEtMiseAjourPrixMenu(Set<Composant> composants, Long idMenu);
    List <String> nomMenuParTypeMenuOrdonneParPrixTotal(String typeMenu);

}
//