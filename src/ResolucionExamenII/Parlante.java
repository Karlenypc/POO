
package ResolucionExamenII;

/**
 *
 * @author Karlenypc
 */
public class Parlante {
    
    String nombre;
    int volumen;
    boolean habilitado;
    int direcionsenal;
    
    public Parlante() {
    }
    
    public Parlante(int volumen, int direcionsenal) {
        this.volumen = volumen;
        this.direcionsenal = direcionsenal;
    }

    public void sonar(String audio) {
        System.out.println("Sonando: " + audio);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getDirecionsenal() {
        return direcionsenal;
    }

    public void setDirecionsenal(int direcionsenal) {
        this.direcionsenal = direcionsenal;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
}
