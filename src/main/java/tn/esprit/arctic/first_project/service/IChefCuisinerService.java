package tn.esprit.arctic.first_project.service;
import tn.esprit.arctic.first_project.repository.ChefCuisinierRepo;
import tn.esprit.arctic.first_project.entities.ChefCuisinier;
import java.util.List;
public interface IChefCuisinerService  {
    List<ChefCuisinier> retrieveAllChefsCuisinier();
    ChefCuisinier addChefCuisinier(ChefCuisinier e);
    ChefCuisinier updateChefCuisinier(ChefCuisinier e);
    ChefCuisinier retrieveChefCuisinier(Long idChefCuisinier);
    void removeChefCuisinier(Long idChefCuisinier);
    List<ChefCuisinier> addChefsCuisinier (List<ChefCuisinier> ChefsCuisinier);
}
//