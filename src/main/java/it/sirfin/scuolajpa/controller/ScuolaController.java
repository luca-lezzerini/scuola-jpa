package it.sirfin.scuolajpa.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ScuolaController {

    @RequestMapping("/inizializza")
    public void inizializza(){}
}
