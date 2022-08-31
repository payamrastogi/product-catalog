package com.coddicted.productcatalog.model;

import lombok.Data;
import org.springframework.lang.NonNull;

@Data
public class Category {
    private String id;
    @NonNull
    private String name;
    private String code;
    private String description;
    private String parentId;
}
