package com.example.dogwalker.services;

import com.example.dogwalker.repositories.ProfileRepository;
import com.example.dogwalker.models.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    @Autowired
    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @GetMapping
    public List<Profile> getProfiles() {
        return profileRepository.findAll();
    }
}
