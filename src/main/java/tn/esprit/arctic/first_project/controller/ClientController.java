package tn.esprit.arctic.first_project.controller;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.first_project.service.IClientService;
import tn.esprit.arctic.first_project.entities.Client;
import java.util.List;

@RestController
@AllArgsConstructor  // Gère l'injection via le constructeur
@RequestMapping("/client")
public class ClientController {

    private final IClientService clientService; // Injection via le constructeur

    @GetMapping("/retrieve-all-clients")
    public List<Client> getClients() {
        return clientService.retrieveAllClients();
    }

    @GetMapping("/retrieve-client/{clientId}")
    public Client retrieveClient(@PathVariable("clientId") Long clientId) {
        return clientService.retrieveClient(clientId);
    }

    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client c) {
        return clientService.addClient(c);
    }

    @DeleteMapping("/remove-client/{clientId}")
    public void removeClient(@PathVariable("clientId") Long clientId) {
        clientService.removeClient(clientId);
    }

    @PutMapping("/update-client")
    public Client updateClient(@RequestBody Client c) {
        return clientService.updateClient(c);
    }
}
