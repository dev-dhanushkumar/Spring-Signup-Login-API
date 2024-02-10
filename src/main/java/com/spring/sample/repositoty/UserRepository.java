package com.spring.sample.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.sample.entity.User;

public interface UserRepository  extends JpaRepository<User,Long> {

    boolean existsByEmail(String email);

    boolean existsByUserName(String username);

    User findByUserNameOrEmail(String username, String username2);
}
