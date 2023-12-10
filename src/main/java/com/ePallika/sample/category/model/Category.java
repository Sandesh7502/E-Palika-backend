package com.ePallika.sample.category.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private long parentId;

    private int level;


    private String description;

    @Enumerated(EnumType.STRING)
    private CategoryStatus status;
}
