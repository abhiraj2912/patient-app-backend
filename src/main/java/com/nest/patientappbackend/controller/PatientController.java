package com.nest.patientappbackend.controller;

import com.nest.patientappbackend.dao.PatientDao;
import com.nest.patientappbackend.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> AddPatient(@RequestBody Patient p){
        dao.save(p);
        HashMap<String,String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Patient> ViewPatient(){
        return (List<Patient>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search", consumes = "application/json", produces = "application/json")
    public List<Patient> SearchPatient(@RequestBody Patient p)
    {
        String name=p.getName();
        System.out.println(name);
        return (List<Patient>) dao.SearchPatient(p.getName());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> DeletePatient(@RequestBody Patient p)
    {
        String patientid=String.valueOf(p.getId());
        System.out.println(patientid);
        dao.DeletePatient(p.getId());
        HashMap<String,String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }
}
