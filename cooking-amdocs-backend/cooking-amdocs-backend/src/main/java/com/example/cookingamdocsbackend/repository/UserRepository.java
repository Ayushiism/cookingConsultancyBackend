package com.example.cookingamdocsbackend.repository;

import com.example.cookingamdocsbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Long> {

}
