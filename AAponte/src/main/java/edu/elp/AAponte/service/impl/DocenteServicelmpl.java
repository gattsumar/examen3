package edu.elp.AAponte.service.impl;

import edu.elp.AAponte.entity.Docente;
import edu.elp.AAponte.service.IDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocenteServicelmpl<IDocenteDao> implements IDocenteService {

    @Autowired
    private IDocenteDao docenteDao;

    @Override
    public boolean listaDocente() throws InterruptedException {

        boolean docenteList = this.docenteDao.equals();
        for (Docente docente : docenteList) {
            System.out.println(docente.toString());
        }
        return docenteList;
    }

    @Override
    public Docente obtenerDocenteBysalario(String salario) {
        return null;
    }
}
