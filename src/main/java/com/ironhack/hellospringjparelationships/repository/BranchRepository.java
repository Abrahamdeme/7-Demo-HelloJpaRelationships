package com.ironhack.hellospringjparelationships.repository;

import com.ironhack.hellospringjparelationships.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, Long> {
}
