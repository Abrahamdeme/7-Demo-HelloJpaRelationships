package com.ironhack.hellospringjparelationships.repository;

import com.ironhack.hellospringjparelationships.model.Paper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaperRepository extends JpaRepository<Paper, Long> {
}
