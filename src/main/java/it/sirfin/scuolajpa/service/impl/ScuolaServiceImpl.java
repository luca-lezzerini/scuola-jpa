package it.sirfin.scuolajpa.service.impl;

import it.sirfin.scuolajpa.model.Docente;
import it.sirfin.scuolajpa.repository.DocenteRepository;
import it.sirfin.scuolajpa.service.ScuolaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScuolaServiceImpl implements ScuolaService {

    @Autowired
    DocenteRepository docenteRepository;

    @Override
    public void inserisciDocente(Docente doc) {
        docenteRepository.save(doc);
    }

    @Override
    public void cancellaDocenti() {
        docenteRepository.deleteAllInBatch();
    }

    @Override
    public List<Docente> trovaTuttiIDocenti() {
        return docenteRepository.findAll();
    }

    @Override
    public void cancellaDocente(Docente d) {
        docenteRepository.delete(d);
    }

    @Override
    public void inizializzazione() {
        List<Docente> docenti = new ArrayList<>();
        docenti.add(new Docente("Benjamin", "Franklin"));
        docenti.add(new Docente("Elio", "Plutonio"));
        docenti.add(new Docente("Paolino", "Paperino"));
        docenti.add(new Docente("Luca", "Lezzerini"));
        docenti.add(new Docente("Marie", "Curie"));

        cancellaDocenti();
        docenti.forEach(t -> inserisciDocente(t));

// Forma Alternativa
//        for (Docente docente : docenti) {
//            scuolaService.inserisciDocente(docente);
//        }
        List<Docente> lista = trovaTuttiIDocenti();
        lista.forEach(t -> System.out.println(t));

        lista.stream()
                .filter(s -> s.getId() % 2 == 1)
                .forEach(s -> cancellaDocente(s));

        List<Docente> lista2 = trovaTuttiIDocenti();
        lista2.forEach(t -> System.out.println(t));

//        for (Docente docente : lista) {
//            if (docente.getId() % 2 == 1){
//                scuolaService.cancellaDocente(docente);
//            }
//        }
    }

}
