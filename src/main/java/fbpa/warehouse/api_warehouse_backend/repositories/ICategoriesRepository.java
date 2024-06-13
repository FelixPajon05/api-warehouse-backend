package fbpa.warehouse.api_warehouse_backend.repositories;

import fbpa.warehouse.api_warehouse_backend.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICategoriesRepository extends JpaRepository<Categories, Long> {

    List<Categories> findByName(String name);
    List<Categories> findByDescription(String description);

}