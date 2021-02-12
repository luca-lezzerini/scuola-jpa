package it.sirfin.scuolajpa.controller;

import it.sirfin.scuolajpa.model.Docente;
import it.sirfin.scuolajpa.service.ScuolaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ScuolaController {

    @Autowired
    ScuolaService scuolaService;

    @RequestMapping("/inizializza")
    public void inizializza() {
        scuolaService.inizializzazione();
    }
}
