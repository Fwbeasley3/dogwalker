package com.example.dogwalker.repositories;

import com.example.dogwalker.models.PetAccommodation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetAccommodationRepository extends JpaRepository<PetAccommodation,Long> {
}
