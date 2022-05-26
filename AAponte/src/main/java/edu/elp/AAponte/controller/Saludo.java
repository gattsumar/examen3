package edu.elp.AAponte.controller;

import edu.elp.AAponte.entity.Estudiante;
import edu.elp.AAponte.entity.Persona;
import edu.elp.AAponte.service.IEstudianteService;
import edu.elp.AAponte.service.IPersonaService;
import edu.elp.AAponte.service.IDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("Index")
public class Saludo {
    @Autowired
    private IPersonaService personaService;



    @GetMapping("/listaPersona")
    public List<Persona> listaPersona() {
        return this.personaService.listaPersonas();
    }

    @GetMapping("/buscarPersona")
    public Persona buscarPersona(@RequestParam("nombre") String nombre) {
        return this.personaService.obtenerPersonaBynombre(nombre);

    }

       @Autowired
       private IEstudianteService estudianteService;
        @GetMapping("/listaEstudiantes")
        public List<Estudiante>listaEstudiantes(){
            return this.estudianteService.listaEstudiantes();
        }
        @GetMapping("/buscarEstudiante")
        public Estudiante buscarEstudiante(@RequestParam("codigo") String codigo) {
            return this.estudianteService.obtenerEstudianteByCodigo(codigo);
        }
    @Autowired
        private IDocenteService docenteService;
         @GetMapping("/listaDocente")
         public boolean listaDocente() throws InterruptedException {
             return this.docenteService.listaDocente();


         }
}


