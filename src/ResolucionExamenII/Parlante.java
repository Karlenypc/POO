
package ResolucionExamenII;

/**
 *
 * @author Karlenypc
 */
public class Parlante {
    
    int volumen;
    boolean habilitado = true;
    
    public Parlante() {
    }
   
    public void sonar(String audio) {
        System.out.println("Sonando: " + audio);
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
      
}
