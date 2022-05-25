package com.example.solutionttms.repositories;

import com.example.solutionttms.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role save(Role role);
}
