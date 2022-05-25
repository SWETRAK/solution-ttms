package com.example.solutionttms.repositories;

import com.example.solutionttms.models.Privilage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivilagesRepository extends JpaRepository<Privilage, Long> {
}
