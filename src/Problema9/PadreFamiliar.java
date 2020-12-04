
package Problema9;

/**
 *
 * @author Karlenypc
 */
public class PadreFamiliar {
    
    //Propiedades 
    String nombre;
    String apellido; 
    
    public PadreFamiliar() {
    }
    
    public PadreFamiliar(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
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

    @Override
    public String toString() {
        return  "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n";
    }
    
}
