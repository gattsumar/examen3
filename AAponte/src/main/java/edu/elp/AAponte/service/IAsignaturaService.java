package edu.elp.AAponte.service;

import edu.elp.AAponte.entity.Asignatura;

import java.util.List;

public interface IAsignaturaService {
    Asignatura getPersonaByAsignatura(String curso);

    List<Asignatura> curso();

    List<Asignatura> curso(String asignatura);
}
