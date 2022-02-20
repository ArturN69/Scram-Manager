package com.sda.scrammanager.repository;

import com.sda.scrammanager.model.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SprintRepository extends JpaRepository<Sprint, Long> {
}
