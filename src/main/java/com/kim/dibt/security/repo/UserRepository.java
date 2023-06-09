package com.kim.dibt.security.repo;

import com.kim.dibt.security.models.Role;
import com.kim.dibt.security.models.RoleType;
import com.kim.dibt.security.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

}
