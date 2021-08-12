package com.scv.trk.controller;

import com.scv.trk.model.CheckInfo;
import com.scv.trk.repository.CheckRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CheckController {
    private final CheckRepository checkRepository;

    public CheckController(CheckRepository checkRepository) {
        this.checkRepository = checkRepository;
    }

    @GetMapping("/checks")
    List<CheckInfo> all() {
        return checkRepository.findAll();
    }

    //TODO: use ResponseEntity
    @GetMapping("/checks/{id}")
    CheckInfo getCheckById(@PathVariable Long id) {
        return checkRepository.findById(id)
                .orElseThrow(() -> new CheckNotFoundException(id));
    }
}
