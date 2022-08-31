package com.coddicted.productcatalog.controller;

import com.coddicted.productcatalog.model.Product;
import com.coddicted.productcatalog.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ProductCatalogController {

    private ProductService productService;

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable("id") String id){
        return productService.getProduct(id);
    }

}
