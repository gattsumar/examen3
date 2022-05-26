package edu.elp.AAponte.service;

import edu.elp.AAponte.entity.Docente;

public interface IDocenteService {

    boolean listaDocente() throws InterruptedException;

    Docente obtenerDocenteBysalario(String salario );

}
