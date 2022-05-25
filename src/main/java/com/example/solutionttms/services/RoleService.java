package com.example.solutionttms.services;

import com.example.solutionttms.models.Privilage;
import com.example.solutionttms.models.Role;
import com.example.solutionttms.repositories.PrivilagesRepository;
import com.example.solutionttms.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    private final RoleRepository roleRepository;
    private final PrivilagesRepository privilagesRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository, PrivilagesRepository privilagesRepository) {
        this.roleRepository = roleRepository;
        this.privilagesRepository = privilagesRepository;
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    public Role addPrivilage(Long roleId, Long privilageId) {
        Optional<Role> role = roleRepository.findById(roleId);
        Optional<Privilage> privilage = privilagesRepository.findById(privilageId);
        if(privilage.isPresent() && role.isPresent()) {
            Role safeRole = role.get();
            Privilage safePrivilage = privilage.get();
            safeRole.getPrivilages().add(safePrivilage);
            roleRepository.save(safeRole);
            safePrivilage.getRoles().add(safeRole);
            privilagesRepository.save(safePrivilage);
            return safeRole;
        }

        return new Role();
    }

}
