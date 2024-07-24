package com.ust.State.service;

import com.ust.State.dto.Districtdto;
import com.ust.State.dto.Responsedto;
import com.ust.State.dto.Statedto;
import com.ust.State.model.State;
import com.ust.State.repository.Staterepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class Stateserviceimpl implements Stateservice{
    @Autowired
    private Staterepo repo;
    @Autowired
    private WebClient webclient;
    //@Override
    public State addState(State state){
        return repo.save(state);
    }
    //@Override
    public Responsedto getState(String stateName){
        Responsedto responsedto=new Responsedto();
        State state=repo.findByStateName(stateName).orElseThrow(() -> new RuntimeException("State not found"));
        Statedto statedto=mapToState(state);
        List <Districtdto> districtdtoList= webclient.get()
                .uri("http://localhost:9098/districts/" + state.getStateName())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Districtdto>>() {}).block();
        responsedto.setState(statedto);
        responsedto.setDistrict(districtdtoList);

        return responsedto;

    }

    private Statedto mapToState(State state) {
        Statedto dto=new Statedto();
        dto.setStateName(state.getStateName());
        dto.setStateCode(state.getStateCode());
        dto.setCapital(state.getCapital());
        dto.setPopulation(state.getPopulation());
        dto.setArea(state.getArea());
        dto.setEstablishedYear(state.getEstablishedYear());
        dto.setLanguage(state.getLanguage());
        dto.setTimezone(state.getTimezone());
        dto.setLatitude(state.getLatitude());
        dto.setLongitude(state.getLongitude());

        return dto;
    }

}
