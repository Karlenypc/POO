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

    //Metodo Constructor
    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int carnet) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
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

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Carne: " + carnet + "\n";
    }
    
}
