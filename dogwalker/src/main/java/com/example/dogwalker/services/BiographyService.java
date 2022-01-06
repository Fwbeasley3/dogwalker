package com.example.dogwalker.services;

import com.example.dogwalker.models.Biography;
import com.example.dogwalker.repositories.BiographyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class BiographyService {

    private final BiographyRepository biographyRepository;

    @Autowired

    public BiographyService(BiographyRepository biographyRepository) {
        this.biographyRepository = biographyRepository;
    }

    @GetMapping
    public List<Biography> getBiographies() {
        return biographyRepository.findAll();
    }
}
