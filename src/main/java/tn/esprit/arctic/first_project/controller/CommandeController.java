package tn.esprit.arctic.first_project.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.first_project.entities.Commande;
import tn.esprit.arctic.first_project.service.ICommandeService;
import tn.esprit.arctic.first_project.repository.CommandeRepository;

import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/commande")
public class CommandeController {
    ICommandeService commandeService;
    CommandeRepository commandeRepository;
    @GetMapping("/retrieve-all-Commandes")
    public List<Commande> getCommandes() {
        return commandeService.retrieveAllCommandes();
    }
    @GetMapping("/retrieve-Commande/{Commande-id}")
    public Commande retrieveCommande(@PathVariable("Commande-id") Long CommandeId) {
        return commandeService.retrieveCommande(CommandeId);
    }
    @PostMapping("/add-Commande")
    public Commande addCommande(@RequestBody Commande c) {
        return commandeService.addCommande(c);
    }
    @DeleteMapping("/remove-Commande/{Commande-id}")
    public void removeCommande(@PathVariable("Commande-id") Long CommandeId) {
        commandeService.removeCommande(CommandeId);
    }
    @PutMapping("/update-Commande")
    public Commande updateCommande(@RequestBody Commande c) {
        return commandeService.updateCommande(c);
    }
    @PostMapping("/ajouter-commande/{identifiant}/{libelleMenu}")
    public Commande ajouterCommandeEtaffecterAClientEtMenu(
            @RequestBody Commande commande,
            @PathVariable("identifiant") Long identifiant,
            @PathVariable("libelleMenu") String libelleMenu) {
        commandeService.ajouterCommandeEtaffecterAClientEtMenu(commande, identifiant, libelleMenu);
        return commande;
    }
    @PutMapping("/affecter-note/{idCommande}/{note}")
    public void affecterNoteACommande(
            @PathVariable("idCommande") Long idCommande,
            @PathVariable("note") Long note) {
        commandeService.affecterNoteACommande(idCommande, note);
    }

}
