package com.ironhack.hellospringjparelationships.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;

    @OneToOne(mappedBy = "branch")
    private AssistantToTheRegionalManager assistantToTheRegionalManager;

    @OneToMany(mappedBy = "branch")
    private Set<SalesOrder> salesOrders;
}
