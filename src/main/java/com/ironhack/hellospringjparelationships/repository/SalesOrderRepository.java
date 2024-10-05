package com.ironhack.hellospringjparelationships.repository;

import com.ironhack.hellospringjparelationships.model.SalesOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SalesOrderRepository extends JpaRepository<SalesOrder, UUID> {
}
