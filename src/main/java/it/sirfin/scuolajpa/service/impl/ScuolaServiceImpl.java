package it.sirfin.scuolajpa.service.impl;

import it.sirfin.scuolajpa.model.Docente;
import it.sirfin.scuolajpa.repository.DocenteRepository;
import it.sirfin.scuolajpa.service.ScuolaService;
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

}
