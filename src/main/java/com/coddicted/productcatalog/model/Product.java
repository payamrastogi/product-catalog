package com.coddicted.productcatalog.model;

import lombok.Data;

@Data
public class Product {
    private String id;
    private String name;
    private String description;
    private String categoryId;

    private Price price;
    private boolean active;
}
