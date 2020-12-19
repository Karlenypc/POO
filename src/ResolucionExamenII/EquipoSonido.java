package ResolucionExamenII;

/**
 *
 * @author Karlenypc
 */
public class EquipoSonido {

    Parlante derecho = new Parlante();
    Parlante izquierdo = new Parlante();
    Parlante subwoofer = new Parlante();
    String audio;

    String[] listaMusica = new String[1000];
    int index;

    public void inicializarLista() {
        for (int i = 0; i < listaMusica.length; i++) {
            listaMusica[i] = "";
        }
    }

    public boolean agregarAudio(String audio) {
        boolean resultado = false;
        for (int j = 0; j < listaMusica.length; j++) {
            if (index < 1000) {
                listaMusica[j] = audio;
                index++;
                resultado = true;
            }
        }
        return resultado;
    }
    
    public boolean eliminarAudio() {
        boolean resultado = false;
        if (index != 0) {
            listaMusica[index - 1] = null;
            index--;
            resultado = true;
        }
        return resultado;
    }

    public void mostrarlistaOrden() {
        for (int i = 0; i < index; i++) {
            if (listaMusica[i] != null) {
                System.out.println(listaMusica[i]);
            }
            if (derecho.habilitado == true) {
                derecho.sonar(listaMusica[i]);
            }
            if (izquierdo.habilitado == true) {
                izquierdo.sonar(listaMusica[i]);
            }
            if (subwoofer.habilitado == true) {
                subwoofer.sonar(listaMusica[i]);
            }
        }

    }

    public void mostrarlistaCompleta() {
        for (int k = 0; k < 1000; k++) {
            if (listaMusica[k].equals("") == false) {
                System.out.println(listaMusica[k]);
            }
        }
    }
    
     public int volumen(Parlante x) {
        int resultado = 0;
        
        return resultado;
    }
    
    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String[] getListaMusica() {
        return listaMusica;
    }

    public void setListaMusica(String[] listaMusica) {
        this.listaMusica = listaMusica;
    }

}
