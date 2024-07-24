package com.ust.District.controller;

import com.ust.District.model.District;
import com.ust.District.service.Districtservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/districts")
public class DistrictController {
    @Autowired
    private Districtservice service;
    @PostMapping("/adddistrict")
    public District addDistrict(@RequestBody District district){
        return service.addDistrict(district);
    }
    @GetMapping("/{stateName}")
    public List<District> getDistricts(@PathVariable String stateName){
        return service.getDistrictsByState(stateName);
    }

}
