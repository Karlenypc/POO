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
    PadreFamiliar madre;

    //Metodo Constructor
    public Alumno() {
    }
    
    public Alumno(String nombre, String apellido, int carnet, PadreFamiliar padre, PadreFamiliar madre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.padre = padre;
        this.madre = madre;
    }
    
    //Metodo para imprimir la info Familiar
    public void imprimirDatosFamiliar() {
        System.out.println("**Informacion del encargado legal**");
        System.out.println("Padre: " + padre.getNombre() + " " + padre.getApellido());
        System.out.println("Madre: " + madre.getNombre() + " " + madre.getApellido());
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

    public PadreFamiliar getMadre() {
        return madre;
    }

    public void setMadre(PadreFamiliar madre) {
        this.madre = madre;
    }
    
    @Override
    public String toString() {
        return "Informacion del alumno: " + "\n" + "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Carne: " + carnet + "\n" ;
    }
    
}
