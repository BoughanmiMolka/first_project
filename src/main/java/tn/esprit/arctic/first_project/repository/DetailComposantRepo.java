package tn.esprit.arctic.first_project.repository;

import org.springframework.stereotype.Repository;
import tn.esprit.arctic.first_project.entities.DetailComposant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
@Repository
//
public interface DetailComposantRepo extends JpaRepository<DetailComposant, Long>{
}
