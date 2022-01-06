package com.example.dogwalker.services;

import com.example.dogwalker.models.PetAccommodation;
import com.example.dogwalker.repositories.PetAccommodationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class PetAccommodationService {

    private final PetAccommodationRepository petAccommodationRepository;

    @Autowired

    public PetAccommodationService(PetAccommodationRepository petAccommodationRepository) {
        this.petAccommodationRepository = petAccommodationRepository;
    }

    @GetMapping
    public List<PetAccommodation> getPetAccommodations(){
        return petAccommodationRepository.findAll();
    }
}
