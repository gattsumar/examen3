package edu.elp.AAponte.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name ="DOCENTE")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Docente extends Persona {
    public Docente() {
    }

    @Column(name="salario",length = 12)
    private  String Salario;
    public String getSalario() {
        return Salario;
    }

    public void setSalario(String salario) {
        this.Salario = salario;
    }
}
