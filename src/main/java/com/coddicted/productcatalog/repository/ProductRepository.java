package com.coddicted.productcatalog.repository;

import com.coddicted.productcatalog.model.Product;

public interface ProductRepository {
    Product getProduct(String id);
}
