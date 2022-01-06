package com.example.dogwalker.controllers;


import com.example.dogwalker.models.Biography;
import com.example.dogwalker.services.BiographyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path="/biographies")
public class BiographyController {

    private final BiographyService biographyService;

    @Autowired

    public BiographyController(BiographyService biographyService) {
        this.biographyService = biographyService;
    }

    @GetMapping
    public List<Biography> getBiographies() {
        return biographyService.getBiographies();
    }
}
