package com.example.solutionttms.services;

import com.example.solutionttms.models.MyUser;
import com.example.solutionttms.models.Role;
import com.example.solutionttms.repositories.MyUserRepository;
import com.example.solutionttms.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class MyUserService {

    private final MyUserRepository myUserRepository;
    private final RoleRepository roleRepository;

    @Autowired
    public MyUserService(MyUserRepository myUserRepository, RoleRepository roleRepository) {
        this.myUserRepository = myUserRepository;
        this.roleRepository = roleRepository;
    }

    public List<MyUser> getAllUsers() {
        return myUserRepository.findAll();
    }

    public MyUser createUser(MyUser user) {
        return myUserRepository.save(user);
    }

    public void deleteUser(Long id) {
        myUserRepository.deleteById(id);
    }


}
