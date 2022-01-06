package com.example.dogwalker.controllers;

import com.example.dogwalker.models.Profile;
import com.example.dogwalker.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path="/profile")
public class ProfileController {

    private final ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }




    @GetMapping
    public List<Profile> getProfiles() {
        return profileService.getProfiles();
    }
}
