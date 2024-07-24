package com.ust.State.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Districtdto {
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
}
