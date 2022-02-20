package com.sda.scrammanager.repository;

import com.sda.scrammanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
