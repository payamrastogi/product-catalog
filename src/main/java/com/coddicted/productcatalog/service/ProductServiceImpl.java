package com.coddicted.productcatalog.service;

import com.coddicted.productcatalog.model.Product;
import com.coddicted.productcatalog.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public Product getProduct(String id) {
        return productRepository.getProduct(id);
    }
}
