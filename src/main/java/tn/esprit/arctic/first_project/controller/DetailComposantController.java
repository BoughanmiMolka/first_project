package tn.esprit.arctic.first_project.controller;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.first_project.service.IDetailComposantService;
@RestController
@AllArgsConstructor

public class DetailComposantController {
    IDetailComposantService detailComposantService;
}
