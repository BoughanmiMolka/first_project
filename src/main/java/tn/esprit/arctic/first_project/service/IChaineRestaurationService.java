package tn.esprit.arctic.first_project.service;

import tn.esprit.arctic.first_project.entities.ChaineRestauration;

import java.util.List;

public interface IChaineRestaurationService {
    List<ChaineRestauration> retrieveAllChainesRestauration();
    ChaineRestauration addChaineRestauration (ChaineRestauration e);
    ChaineRestauration updateChaineRestauration (ChaineRestauration e);
    ChaineRestauration retrieveChaineRestauration (Long idChaineRestauration);
    void removeChaineRestauration (Long idChaineRestauration);
    List<ChaineRestauration> addChainesRestauration (List<ChaineRestauration> chainesRestauration);

}
//