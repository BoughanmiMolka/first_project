package tn.esprit.arctic.first_project.controller;
import tn.esprit.arctic.first_project.service.IChaineRestaurationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor

public class ChaineRestaurationController {
    IChaineRestaurationService chaineRestaurationService;
}
