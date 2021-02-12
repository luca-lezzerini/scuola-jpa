package it.sirfin.scuolajpa.service;

import it.sirfin.scuolajpa.model.Docente;
import java.util.List;

public interface ScuolaService {

    void inserisciDocente(Docente doc);

    void cancellaDocenti();

    void cancellaDocente(Docente d);

    List<Docente> trovaTuttiIDocenti();
}
