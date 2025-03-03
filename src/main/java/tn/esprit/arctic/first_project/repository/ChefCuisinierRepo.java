package tn.esprit.arctic.first_project.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.first_project.entities.ChefCuisinier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
@Repository
//
public interface ChefCuisinierRepo  extends JpaRepository<ChefCuisinier, Long>{
}
