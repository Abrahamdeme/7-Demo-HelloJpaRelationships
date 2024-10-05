package com.ironhack.hellospringjparelationships.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AssistantToTheRegionalManager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

}
