package tn.esprit.arctic.first_project.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.first_project.entities.DetailComposant;
import tn.esprit.arctic.first_project.repository.DetailComposantRepo;

import java.util.List;
@Service
@AllArgsConstructor

public class DetailComposantService implements IDetailComposantService{
    DetailComposantRepo detailComposantRepository;
//
    @Override
    public List<DetailComposant> retrieveAllDetailComposants() {
        return detailComposantRepository.findAll();
    }

    @Override
    public DetailComposant addDetailComposant(DetailComposant e) {
        detailComposantRepository.save(e);
        return e;
    }

    @Override
    public DetailComposant updateDetailComposant(DetailComposant e) {
        return detailComposantRepository.save(e);
    }

    @Override
    public DetailComposant retrieveDetailComposant(Long idDetailComposant) {
        return detailComposantRepository.findById(idDetailComposant).get();
    }

    @Override
    public void removeDetailComposant(Long idDetailComposant) {
        detailComposantRepository.deleteById(idDetailComposant);
    }

    @Override
    public List<DetailComposant> addDetailComposants(List<DetailComposant> detailComposants) {
       return detailComposantRepository.saveAll(detailComposants);
    }
}
