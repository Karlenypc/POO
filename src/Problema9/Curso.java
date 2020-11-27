package Problema9;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class Curso {

    //Propiedades 
    String nombreProfesor;
    String materia;
    String codigoCurso;
    String horarioCurso;
    
    //Metodos constructor 
    public Curso() {
    }

    public Curso(String materia, String codigoCurso, String horarioCurso, String nombreProfesor) {
        this.materia = materia;
        this.codigoCurso = codigoCurso;
        this.horarioCurso = horarioCurso;
        this.nombreProfesor = nombreProfesor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String Materia) {
        this.materia = Materia;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getHorarioCurso() {
        return horarioCurso;
    }

    public void setHorarioCurso(String horarioCurso) {
        this.horarioCurso = horarioCurso;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

}
