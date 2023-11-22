package com.project.schoolmanagment.repository;

import com.project.schoolmanagment.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsernameEquals(String username);
}
