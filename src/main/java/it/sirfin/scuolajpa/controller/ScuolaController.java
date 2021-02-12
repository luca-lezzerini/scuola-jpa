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
        List<Docente> docenti = new ArrayList<>();
        docenti.add(new Docente("Benjamin", "Franklin"));
        docenti.add(new Docente("Elio", "Plutonio"));
        docenti.add(new Docente("Paolino", "Paperino"));
        docenti.add(new Docente("Luca", "Lezzerini"));
        docenti.add(new Docente("Marie", "Curie"));
        
        scuolaService.cancellaDocenti();
        docenti.forEach(t -> scuolaService.inserisciDocente(t));

// Forma Alternativa
//        for (Docente docente : docenti) {
//            scuolaService.inserisciDocente(docente);
//        }
        List<Docente> lista = scuolaService.trovaTuttiIDocenti();
        lista.forEach(t -> System.out.println(t));
        
        lista.stream()
                .filter(s -> s.getId() % 2 == 1)
                .forEach(s -> scuolaService.cancellaDocente(s));
        
//        for (Docente docente : lista) {
//            if (docente.getId() % 2 == 1){
//                scuolaService.cancellaDocente(docente);
//            }
//        }
    }
}
