package com.ust.State.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Statedto {
    private Long Stateid;

    private String stateName;
    private String stateCode;
    private String capital;
    private Long population;
    private Double area;
    private Integer establishedYear;
    private String language;
    private String timezone;
    private Double latitude;
    private Double longitude;
}
