package fbpa.warehouse.api_warehouse_backend.controllers;

import fbpa.warehouse.api_warehouse_backend.models.Products;
import fbpa.warehouse.api_warehouse_backend.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/products")
public class ProductsRestController {

    private final ProductsService productsService;

    @Autowired
    public ProductsRestController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @PostMapping(value = "create", headers = "Accept=application/json")
    public void createProducts(@RequestBody Products product) {
        productsService.createProducts(product);
    }

    @GetMapping(value = "list", headers = "Accept=application/json")
    public List<Products> productsList() {
        return productsService.productsList();
    }

    @GetMapping(value = "listById/{id}", headers = "Accept=application/json")
    public Optional<Products> searchById(@PathVariable Long id) {
        return productsService.searchById(id);
    }

    @PutMapping(value = "update", headers = "Accept=application/json")
    public void updateProducts(@RequestBody Products product) {
        productsService.updateProducts(product);
    }

    @DeleteMapping(value = "delete/{id}", headers = "Accept=application/json")
    public void deleteProducts(@PathVariable Long id) {
        productsService.deleteProducts(id);
    }

    @GetMapping(value = "nameList{title}", headers = "Accept=application/json")
    public List<Products> listByName(@PathVariable String name) {
        return productsService.searchByName(name);
    }

    @GetMapping(value = "descriptionList{description}", headers = "Accept=application/json")
    public List<Products> listByDescription(@PathVariable String description) {
        return productsService.searchByDescription(description);
    }

    @GetMapping(value = "priceList{price}", headers = "Accept=application/json")
    public List<Products> listByPrice(@PathVariable String price) {
        return productsService.searchByPrice(price);
    }

    @GetMapping(value = "quantityList{quantity}", headers = "Accept=application/json")
    public List<Products> listByQuantity(@PathVariable String quantity) {
        return productsService.searchByQuantity(quantity);
    }

    @GetMapping(value = "categoryList{category}", headers = "Accept=application/json")
    public List<Products> listByCategory(@PathVariable String category) {
        return productsService.searchByCategory(category);
    }

}