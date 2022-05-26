package edu.elp.AAponte.service;

import edu.elp.AAponte.entity.Persona;

import java.util.List;

public interface IPersonaService {

    List<Persona> listaPersonas();

    Persona obtenerPersonaBynombre(String nombre);
}
