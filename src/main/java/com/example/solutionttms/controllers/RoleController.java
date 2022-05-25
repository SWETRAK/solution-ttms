package com.example.solutionttms.controllers;

import com.example.solutionttms.models.Role;
import com.example.solutionttms.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("api/roles")
public class RoleController {


    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Role>> getAllRoles() {
        return ResponseEntity.ok(roleService.getAllRoles());
    }

    @PostMapping("/create")
    public ResponseEntity<Role> createRole(@RequestBody Role role) {
        return ResponseEntity.ok(roleService.createRole(role));
    }


    @PutMapping("/add/{roleId}/{privilageId}")
    public ResponseEntity<Role> addPrivilage(@PathParam("roleId") Long roleId, @PathParam("privilageId") Long privilageId) {
        return ResponseEntity.ok(roleService.addPrivilage(roleId, privilageId));
    }


}
