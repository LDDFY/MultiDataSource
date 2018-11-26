package com.multi.datasource.multi.repository.second;

import com.multi.datasource.multi.entity.second.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    public Product findById(int id);
}
