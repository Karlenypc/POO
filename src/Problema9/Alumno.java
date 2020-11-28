package Problema9;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class Alumno {

    //Propiedades 
    String nombre;
    String apellido;
    int carnet;
    PadreFamiliar padre;

    //Metodo Constructor
    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int carnet, PadreFamiliar padre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.padre = padre;
    }

    //Metodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public PadreFamiliar getPadre() {
        return padre;
    }

    public void setPadre(PadreFamiliar padre) {
        this.padre = padre;
    }
    
    @Override
    public String toString() {
        return "Informacion del alumno = " + "\n" + "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Carne: " + carnet + "\n" + "Informacion del Padre = " + "\n" + padre + "\n";
    }
    
}
