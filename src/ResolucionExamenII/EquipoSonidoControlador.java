/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResolucionExamenII;

/**
 *
 * @author Karlenypc
 */
public class EquipoSonidoControlador {

    public void iniciar() {
        EquipoSonido e = new EquipoSonido();
        Vista vst = new Vista();
        
        int menu = 0;
        e.inicializarLista();
        do {
            vst.getOpcionMenu();
            switch (menu) {
                case 1: 
                    e.mostrarlistaOrden();
                    break;
                case 2:
                
                    break;
                case 3:
                    e.mostrarlistaCompleta();
                    break;
                case 4:
                    vst.agregarAudio();
                    break;
                case 5:
                    e.eliminarAudio();
                    break;
                case 6:
                    vst.volumen();
                    break;
            }

        } while (true);
    }
}
