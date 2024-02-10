package com.spring.sample.repositoty;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.sample.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(String name);
}
