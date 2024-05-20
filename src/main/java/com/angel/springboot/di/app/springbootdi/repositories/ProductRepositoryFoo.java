package com.angel.springboot.di.app.springbootdi.repositories;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.angel.springboot.di.app.springbootdi.models.Product;

@Repository
public class ProductRepositoryFoo implements ProductRepository {

    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product(13L, "Monitor Asus 27", 600L));
    }

    @Override
    public Product findById(long id) {
        return new Product(id, "Monitor Asus 28", 600L);
    }

}
