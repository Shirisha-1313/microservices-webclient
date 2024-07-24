package com.ust.State.controller;

import com.ust.State.dto.Responsedto;
import com.ust.State.model.State;
import com.ust.State.service.Stateservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/state")
public class Statecontroller {
    @Autowired
    private Stateservice service;

    @PostMapping("/addstate")
    public ResponseEntity<State> addState(@RequestBody State state){
        return ResponseEntity.ok(service.addState(state));

    }
    @GetMapping("/{stateName}")
    public ResponseEntity<Responsedto> getState(@PathVariable("stateName") String stateName){
        Responsedto responseDto = service.getState(stateName);
        return ResponseEntity.ok(responseDto);
    }
}
