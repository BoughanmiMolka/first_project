package tn.esprit.arctic.first_project.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.first_project.service.IClientService;

@RestController
@AllArgsConstructor

public class ClientController {
    IClientService clientService;
}
