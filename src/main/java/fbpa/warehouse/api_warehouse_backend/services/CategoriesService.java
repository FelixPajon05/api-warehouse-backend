package fbpa.warehouse.api_warehouse_backend.services;

import fbpa.warehouse.api_warehouse_backend.models.Categories;
import fbpa.warehouse.api_warehouse_backend.repositories.ICategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesService {

    private final ICategoriesRepository categoriesRepo;
    @Autowired

    public CategoriesService(ICategoriesRepository categoriesRepo) {
        this.categoriesRepo = categoriesRepo;
    }

    public void createCategories(Categories category) {
        categoriesRepo.save(category);
    }

    //

    public List<Categories> categoryList() {
        return categoriesRepo.findAll();
    }

    public Optional<Categories> searchById(Long id) {
        return categoriesRepo.findById(id);
    }

    public void updateCategory(Categories category) {
        categoriesRepo.save(category);
    }

    public void deleteCategory(Long id) {
        categoriesRepo.deleteById(id);
    }

    //*//

    public List<Categories> listByName(String name) {
        return categoriesRepo.findByName(name);
    }

    public List<Categories> listByDescription(String description) {
        return categoriesRepo.findByDescription(description);
    }


}