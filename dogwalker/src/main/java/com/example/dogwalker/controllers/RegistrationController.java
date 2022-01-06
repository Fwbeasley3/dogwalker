package com.example.dogwalker.controllers;

import com.example.dogwalker.controllers.requests.RegistrationRequest;
import com.example.dogwalker.services.RegistrationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "register")
public class RegistrationController {

    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }


}
