package tn.esprit.arctic.first_project.service;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.first_project.entities.Client;
import tn.esprit.arctic.first_project.entities.Commande;
import tn.esprit.arctic.first_project.entities.Menu;
import tn.esprit.arctic.first_project.repository.CommandeRepository;
import tn.esprit.arctic.first_project.repository.ClientRepo;
import tn.esprit.arctic.first_project.repository.MenuRepo;

import java.time.LocalDate;
import java.util.List;
@Service
@AllArgsConstructor
@Slf4j

public class CommandeService implements ICommandeService{
    CommandeRepository commandeRepository;
    ClientRepo clientRepo;
    MenuRepo menuRepo;

    @Override
    public List<Commande> retrieveAllCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande addCommande(Commande e) {
        commandeRepository.save(e);
        return e;
    }

    @Override
    public Commande updateCommande(Commande e) {
        return commandeRepository.save(e);
    }

    @Override
    public Commande retrieveCommande(Long idCommande) {
        return commandeRepository.findById(idCommande).get();
    }

    @Override
    public void removeCommande(Long idCommande) {
        commandeRepository.deleteById(idCommande);
    }

    @Override
    public List<Commande> addCommandes(List<Commande> commandes) {
        return commandeRepository.saveAll(commandes);
    }

    @Override
    public void ajouterCommandeEtaffecterAClientEtMenu(Commande commande, Long identifiant, String libelleMenu) {
        Client client = clientRepo.findByIdClient(identifiant);
        Menu menu = menuRepo.findByLibelleMenu(libelleMenu);
        commande.setClient(client);
        commande.setMenu(menu);
        commande.setTotalCommande(menu.getPrixTotal());
        commandeRepository.save(commande);
    }


    @Override
    public void affecterNoteACommande(Long idCommande, Long Note) {
        Commande commande = commandeRepository.findById(idCommande).orElse(null);
        if (commande != null) {
            commande.setNote(Note);
            commandeRepository.save(commande);
        }
    }

    @Override
    @Scheduled(cron = "*/20 * * * * ?")
    public void findCurrentYearCommandesOrderByNote() {
        List<Commande> commandes = commandeRepository.findCommandesBetweenDates(
                LocalDate.of(LocalDate.now().getYear(), 1, 1),
                LocalDate.of(LocalDate.now().getYear(), 12, 31));
        for(Commande commande : commandes){
            log.info("La commande faite le" +commande.getDateCommande() + "d'un montant global de "+commande.getTotalCommande()+ " a une note de " + commande.getNote());
        }

    }

    @Override
    public void menuPlusCommande() {
        List<Commande> commandes = commandeRepository.findAll();
        List<Menu> menus = menuRepo.findAll();
        Menu menuPlusCommande = null;
        int maxCommandes = 0;
        for (Menu menu : menus){
            int count = 0;
            for (Commande commande : commandes) {
                if(commande.getMenu().getIdMenu() == menu.getIdMenu()){
                    count++;
                }
            }
            if(count>maxCommandes){
                menuPlusCommande = menu;
                maxCommandes = count;
            }
            log.info("Le menu le plus commandé dans votre restaurant est " + menuPlusCommande.getLibelleMenu() + " avec " + maxCommandes + " commandes.");
    }
}}
