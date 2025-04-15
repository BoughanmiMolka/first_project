package tn.esprit.arctic.first_project.service;
import tn.esprit.arctic.first_project.entities.Commande;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ICommandeService {
    List<Commande> retrieveAllCommandes();
    Commande addCommande(Commande e);
    Commande updateCommande(Commande e);
    Commande retrieveCommande(Long idCommande);
    void removeCommande(Long idCommande);
    List<Commande> addCommandes (List<Commande> Commandes);
    void ajouterCommandeEtaffecterAClientEtMenu(Commande commande, Long identifiant, String libelleMenu);
    void affecterNoteACommande(Long idCommande, Long Note);
    void findCurrentYearCommandesOrderByNote();
    void menuPlusCommande();
}
//