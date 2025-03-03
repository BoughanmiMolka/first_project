package tn.esprit.arctic.first_project.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.arctic.first_project.service.IComposantService;

@Controller
@AllArgsConstructor
public class ComposantController {
    IComposantService composantService;
}
