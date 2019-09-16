package com.codeclan.demo.pirateservice.repositories;

import com.codeclan.demo.pirateservice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {
}
