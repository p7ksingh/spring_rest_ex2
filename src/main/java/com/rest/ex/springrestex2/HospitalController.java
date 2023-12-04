package com.rest.ex.springrestex2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController {

    @Autowired
    HospitalService hospitalService;

    @GetMapping("/hospitals")
    public List<Hospital> getHospital() {

        return hospitalService.getHospitalLists();
    }

    @PostMapping("/savehospital")
    public String saveHospital(@RequestBody Hospital hospital) {

        return hospitalService.saveHospital(hospital) ? "success" : "error";
    }

    @PostMapping("/savehospitals")
    public String saveHospitals(@RequestBody List<Hospital> hospitalLists) {

        return hospitalService.saveHospitalList(hospitalLists) ? "List added success" : "error";
    }
}
