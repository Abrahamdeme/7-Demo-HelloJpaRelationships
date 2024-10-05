package com.ironhack.hellospringjparelationships.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Entity
@Data
public class SalesOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String clientName;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;


    @ManyToMany
    @JoinTable(
            name = "order_paper",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "paper_id")
    )
    private Set<Paper> papers;
}
