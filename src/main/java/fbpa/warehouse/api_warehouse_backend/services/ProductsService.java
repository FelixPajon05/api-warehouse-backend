package fbpa.warehouse.api_warehouse_backend.services;

import fbpa.warehouse.api_warehouse_backend.models.Products;
import fbpa.warehouse.api_warehouse_backend.repositories.IProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {

    private final IProductsRepository productsRepo;
    @Autowired

    public ProductsService(IProductsRepository productsRepo) {
        this.productsRepo = productsRepo;
    }

    //
    public void createProducts(Products product) {
        productsRepo.save(product);
    }

    public List<Products> productsList() {
        return productsRepo.findAll();
    }

    public Optional<Products> searchById(Long id) {
        return productsRepo.findById(id);
    }

    public void updateProducts(Products product) {
        productsRepo.save(product);
    }

    public void deleteProducts(Long id) {
        productsRepo.deleteById(id);
    }

    // * //

    public List<Products> searchByName(String name) {
        return productsRepo.findByName(name);
    }

    public List<Products> searchByDescription(String description) {
        return productsRepo.findByDescription(description);
    }

    public List<Products> searchByPrice(String price) {
        return productsRepo.findByPrice(price);
    }

    public List<Products> searchByQuantity(String quantity) {
        return productsRepo.findByQuantity(quantity);
    }

    public List<Products> searchByCategory(String category) {
        return productsRepo.findByCategory(category);
    }

}