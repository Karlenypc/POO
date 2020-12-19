/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResolucionExamenII;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class Vista {

    Parlante p = new Parlante();
    EquipoSonido e = new EquipoSonido();
    Scanner in = new Scanner(System.in);

    public int getOpcionMenu() {
        int menu = 0;
        System.out.println("Bienvenido por favor seleccione la opción que desea realizar: ");
        System.out.println("1) Reproducir la lista en orden. ");
        System.out.println("2) Reproducir la lista en forma aleatoria. ");
        System.out.println("3) Mostrar la lista completa. ");
        System.out.println("4) Agregar nuevo audio.");
        System.out.println("5) Eliminar audio.");
        System.out.println("6) Subir el volumen.");
        System.out.println("7) Deshabilitar parlante. ");
        menu = in.nextInt();
        return menu;
    }

    public void agregarAudio() {
        System.out.println("Digite el audio en codigo binario: ");
        e.setAudio(in.next());
        e.agregarAudio(e.getAudio());
    }

    public int habilitar() {
        int resultado = 0;
        System.out.println("Cual parlante desea deshabilitar: ");
        System.out.println("1 Derecho");
        System.out.println("2 Izquierdo");
        System.out.println("3 Subwoofer");
        resultado = in.nextInt();
        if (resultado == 1) {
            e.derecho.setHabilitado(false);

        } else if (resultado == 2) {
            e.izquierdo.setHabilitado(false);

        } else if (resultado == 3) {
            e.subwoofer.setHabilitado(false);

        }
        return resultado;
    }
    
    public int volumen(Parlante x) {
        
    }
}
