package com.example.solutionttms.controllers;

import com.example.solutionttms.models.Privilage;
import com.example.solutionttms.services.PrivilageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class PrivilageController {

    private final PrivilageService privilageService;

    @Autowired
    public PrivilageController(PrivilageService privilageService) {
        this.privilageService = privilageService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Privilage>> getAllPrivilages() {
        return ResponseEntity.ok(privilageService.getAllPrivilages());
    }

    @PostMapping("/create")
    public ResponseEntity<Privilage> createPrivilage(@RequestBody Privilage privilage) {
        return ResponseEntity.status(201).body(privilageService.createPrivilage(privilage));
    }




}
