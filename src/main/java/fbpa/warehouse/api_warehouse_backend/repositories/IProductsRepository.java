package fbpa.warehouse.api_warehouse_backend.repositories;

import fbpa.warehouse.api_warehouse_backend.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductsRepository extends JpaRepository<Products, Long> {

    List<Products> findByName(String name);
    List<Products> findByDescription(String description);
    List<Products> findByPrice(String price);
    List<Products> findByQuantity(String quantity);
    List<Products> findByCategory(String category);
    
}