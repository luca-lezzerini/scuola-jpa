package it.sirfin.scuolajpa.service.impl;

import it.sirfin.scuolajpa.model.Docente;
import it.sirfin.scuolajpa.repository.DocenteRepository;
import it.sirfin.scuolajpa.service.ScuolaService;
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

}
