package com.ironhack.hellospringjparelationships.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Paper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private PaperType paperType;

    @ManyToMany(mappedBy = "papers")
    private Set<SalesOrder> salesOrders;
}
