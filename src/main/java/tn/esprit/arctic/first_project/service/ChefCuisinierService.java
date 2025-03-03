package tn.esprit.arctic.first_project.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.first_project.repository.ChefCuisinierRepo;
import tn.esprit.arctic.first_project.entities.ChefCuisinier;
import java.util.List;

@Service
@AllArgsConstructor

public class ChefCuisinierService implements IChefCuisinerService{
ChefCuisinierRepo chefCuisinierRepository;

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

}
