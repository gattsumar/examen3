package edu.elp.AAponte.service;

import edu.elp.AAponte.entity.Estudiante;

import java.util.List;

public interface IEstudianteService {
    List<Estudiante> listaEstudiantes();



    Estudiante obtenerEstudianteByNombre(String nombre);

    Estudiante obtenerEstudianteByCodigo(String codigo);
}
