package com.example.solutionttms.repositories;

import com.example.solutionttms.models.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, Long> {

    MyUser save(MyUser user);
}
