package com.scv.trk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CheckNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(CheckNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String checkNotFoundHandler(CheckNotFoundException ex) {
        return ex.getMessage();
    }

}
