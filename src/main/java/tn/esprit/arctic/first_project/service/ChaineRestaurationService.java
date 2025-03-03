package tn.esprit.arctic.first_project.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.first_project.entities.ChaineRestauration;
import tn.esprit.arctic.first_project.repository.ChaineRestaurationRepo;
import java.util.List;
@Service
@AllArgsConstructor
public class ChaineRestaurationService implements IChaineRestaurationService {
    ChaineRestaurationRepo chaineRestaurationRepository;
//
        @Override
        public List<ChaineRestauration> retrieveAllChainesRestauration() {
            return chaineRestaurationRepository.findAll();
        }

        @Override
        public ChaineRestauration addChaineRestauration(ChaineRestauration e) {
            chaineRestaurationRepository.save(e);
            return e;
        }

        @Override
        public ChaineRestauration updateChaineRestauration(ChaineRestauration e) {
            return chaineRestaurationRepository.save(e);
        }

        @Override
        public ChaineRestauration retrieveChaineRestauration(Long idChaineRestauration) {
            return chaineRestaurationRepository.findById(idChaineRestauration).get();
        }

        @Override
        public void removeChaineRestauration(Long idChaineRestauration) {
            chaineRestaurationRepository.deleteById(idChaineRestauration);
        }

        @Override
        public List<ChaineRestauration> addChainesRestauration(List<ChaineRestauration> chainesRestauration) {
            return chaineRestaurationRepository.saveAll(chainesRestauration);
        }


}
