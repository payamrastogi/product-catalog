package com.coddicted.productcatalog.repository;

import com.coddicted.productcatalog.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public Product getProduct(String id) {
        Product product = new Product();
        product.setId(id);
        product.setName("Test product");
        return product;
    }
}
