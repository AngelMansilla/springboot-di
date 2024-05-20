package com.angel.springboot.di.app.springbootdi.repositories;

import java.util.Arrays;
import java.util.List;

import com.angel.springboot.di.app.springbootdi.models.Product;

public class ProductRepository {

    private List<Product> data;

    public ProductRepository() {
        this.data = Arrays.asList(
                new Product(1L, "Memoria corsair 32", 30L),
                new Product(2L, "CPU I5", 130L),
                new Product(3L, "Teclado Razer", 50L),
                new Product(4L, "Raton Razer", 30L));
    }

    public List<Product> findAll() {
        return data;
    }

    public Product findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
