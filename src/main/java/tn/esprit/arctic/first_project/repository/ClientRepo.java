package tn.esprit.arctic.first_project.repository;

import org.springframework.stereotype.Repository;
import tn.esprit.arctic.first_project.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
//
public interface ClientRepo extends JpaRepository<Client, Long> {//long heya type mtaa l pk déclarée fel entity
    Client findByIdClient(Long identifiant);

}
