package com.ust.District.service;

import com.ust.District.model.District;
import com.ust.District.repository.Districtrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Districtservice {
    @Autowired
    public Districtrepo repo;

    public District addDistrict(District district){
        return repo.save(district);
    }

    public List<District> getDistrictsByState(String stateName){
        return repo.findAllByStateName(stateName);
    }
}
