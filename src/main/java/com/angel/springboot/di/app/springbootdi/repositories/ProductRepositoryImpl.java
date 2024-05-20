package com.angel.springboot.di.app.springbootdi.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.angel.springboot.di.app.springbootdi.models.Product;


@Primary
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
                new Product(1L, "Memoria corsair 32", 30L),
                new Product(2L, "CPU I5", 130L),
                new Product(3L, "Teclado Razer", 50L),
                new Product(4L, "Raton Razer", 30L));
    }

    @Override
    public List<Product> findAll() {
        return data;
    }

    @Override
    public Product findById(long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
