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
    int nota;

    //Metodo para leer los datos 
    public void leerDatos() {

        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombre = reader.next();
        System.out.print("Ingrese el apellido: ");
        apellido = reader.next();
        System.out.print("Ingrese el carné: ");
        carnet = reader.nextInt();
        System.out.print("Ingrese la nota: ");
        nota = reader.nextInt();

    }

    //Metodo para mostrar los datos
    public Alumno[] mostrarDatos() {
        Alumno[] resultado = new Alumno[1000];
        for (int i = 0; i < resultado.length; i++) {
            if (nombre != null && apellido != null && carnet != 0 && nota != 0);
            System.out.println("Nombre Completo: " + nombre + " " + apellido);
            System.out.println("Carnet: " + carnet);
            System.out.println("Nota: " + nota);
        }
        
        return resultado;
    }

    //Metodo Constructor
    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int carnet, int nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.nota = nota;
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

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

}
