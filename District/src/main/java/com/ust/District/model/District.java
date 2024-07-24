package com.ust.District.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Districts")
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stateName;
    private String districtName;
    private Long population;
    private Double area;
    private String districtCode;
    private String capital;
    private Integer establishedYear;
    private String timezone;
    private Double latitude;
    private Double longitude;

    // Constructors
//    public District() {
//    }
//
//    public District(String stateName, String districtName) {
//        this.stateName = stateName;
//        this.districtName = districtName;
//    }
//
//    // Getters and Setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getStateName() {
//        return stateName;
//    }
//
//    public void setStateName(String stateName) {
//        this.stateName = stateName;
//    }
//
//    public String getDistrictName() {
//        return districtName;
//    }
//
//    public void setDistrictName(String districtName) {
//        this.districtName = districtName;
//    }
}
