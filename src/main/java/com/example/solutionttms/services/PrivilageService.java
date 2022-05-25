package com.example.solutionttms.services;

import com.example.solutionttms.models.Privilage;
import com.example.solutionttms.repositories.PrivilagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrivilageService {

    private final PrivilagesRepository privilagesRepository;

    @Autowired
    public PrivilageService(PrivilagesRepository privilagesRepository) {
        this.privilagesRepository = privilagesRepository;
    }

    public List<Privilage> getAllPrivilages() {
        return privilagesRepository.findAll();
    }

    public Privilage createPrivilage(Privilage privilage) {
        return privilagesRepository.save(privilage);
    }

    public Privilage editPrivilage(Privilage privilage) {
        return privilagesRepository.save(privilage);
    }





}
