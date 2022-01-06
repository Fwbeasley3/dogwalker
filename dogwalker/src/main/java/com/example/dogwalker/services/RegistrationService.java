package com.example.dogwalker.services;

import com.example.dogwalker.controllers.requests.RegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {


    public String register(RegistrationRequest request) {
        return "works";
    }
}
