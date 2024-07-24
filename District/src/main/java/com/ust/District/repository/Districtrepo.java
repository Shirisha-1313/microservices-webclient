package com.ust.District.repository;

import com.ust.District.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Districtrepo extends JpaRepository<District, Long> {

    List<District> findAllByStateName(String stateName);

}
