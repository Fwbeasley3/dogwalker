package com.example.dogwalker.controllers;

import com.example.dogwalker.models.PetAccommodation;
import com.example.dogwalker.services.PetAccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path= "/pet_accommodations")
public class PetAccommodationController {

    private final PetAccommodationService petAccommodationService;

    @Autowired

    public PetAccommodationController(PetAccommodationService petAccommodationService) {
        this.petAccommodationService = petAccommodationService;
    }

    @GetMapping
    public List<PetAccommodation> getPetAccommodations() {
        return petAccommodationService.getPetAccommodations();
    }
}
