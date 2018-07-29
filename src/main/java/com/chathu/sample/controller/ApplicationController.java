package com.chathu.sample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @RequestMapping(value = "/print", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String printMethod(){
        return "Hello Chathu service 2";
    }
}
