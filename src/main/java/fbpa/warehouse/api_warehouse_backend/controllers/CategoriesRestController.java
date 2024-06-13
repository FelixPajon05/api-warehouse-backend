package fbpa.warehouse.api_warehouse_backend.controllers;

import fbpa.warehouse.api_warehouse_backend.models.Categories;
import fbpa.warehouse.api_warehouse_backend.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories")
public class CategoriesRestController {

    private CategoriesService categoriesService;

    @Autowired
    public CategoriesRestController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @PostMapping(value = "create", headers = "Accept=application/json")
    public void createCategory(@RequestBody Categories category) {
        categoriesService.createCategory(category);
    }

    @GetMapping(value = "List", headers = "Accept=application/json")
    public List<Categories> categoryList() {
        return categoriesService.categoryList();
    }

    @GetMapping(value = "listById/{id}", headers = "Accept=application/json")
    public Optional<Categories> searchById(@PathVariable Long id) {
        return categoriesService.searchById(id);
    }

    @PutMapping(value = "update", headers = "Accept=application/json")
    public void updateCategory(@RequestBody Categories category) {
        categoriesService.updateCategory(category);
    }

    @DeleteMapping(value = "delete/{id}", headers = "Accept=application/json")
    public void deleteCategory(@PathVariable Long id) {
        categoriesService.deleteCategory(id);
    }

    @GetMapping(value = "nameList{name}", headers = "Accept=application/json")
    public List<Categories> listByName(@PathVariable String name) {
        return categoriesService.listByName(name);
    }

    @GetMapping(value = "descriptionList{description}", headers = "Accept=application/json")
    public List<Categories> listByDescription(@PathVariable String description) {
        return categoriesService.listByDescription(description);
    }

}