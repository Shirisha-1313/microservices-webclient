package com.ust.State.repository;

import com.ust.State.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Staterepo extends JpaRepository<State, Long> {
    Optional<State> findByStateName(String stateName);
}
