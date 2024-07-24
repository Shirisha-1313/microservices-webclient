package com.ust.State.service;

import com.ust.State.dto.Responsedto;
import com.ust.State.model.State;

public interface Stateservice {
    State addState(State state);
    Responsedto getState(String stateName);
}
