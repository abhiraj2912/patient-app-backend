package com.nest.patientappbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {


    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String AddPatient(){
        return "Successful";
    }

    @GetMapping("/view")
    public String ViewPatient(){
        return "View patient";
    }
}
