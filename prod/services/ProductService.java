package org.example.prod.services;

import org.example.prod.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private List<Product> products;

    public List<Product> findAll(){
        return products;
    }
    public void addProduct(Product product){
        products.add(product);
    }
}
