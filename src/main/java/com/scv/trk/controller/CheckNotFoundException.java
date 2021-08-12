package com.scv.trk.controller;

public class CheckNotFoundException extends RuntimeException {
    CheckNotFoundException(Long id) {
        super("Could not find check " + id);
    }
}
