package com.folksdev.fdproduction.repository;

import com.folksdev.fdproduction.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
