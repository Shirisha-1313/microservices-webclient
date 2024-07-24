package com.ust.State.dto;

import java.util.List;

public class Responsedto {
    private List<Districtdto> district;
    private Statedto state;

    public List<Districtdto> getDistrict() {
        return district;
    }

    public void setDistrict(List<Districtdto> district) {
        this.district = district;
    }

    public Statedto getState() {
            return state;
    }

    public void setState(Statedto state) {
        this.state = state;
    }
}
