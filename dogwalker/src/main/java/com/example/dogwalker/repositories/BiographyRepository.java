package com.example.dogwalker.repositories;

import com.example.dogwalker.models.Biography;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiographyRepository extends JpaRepository<Biography,Long> {
}
