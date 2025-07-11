package com.sus.Rep;

import com.sus.Entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRep extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByEmail(String email);
}