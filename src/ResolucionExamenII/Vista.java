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
public class Vista {

    public int getOpcionMenu() {
        int menu = 0;
        System.out.println("Bienvenido por favor seleccione la opción que desea realizar: ");
        System.out.println("1) Reproducir la lista en orden. ");
        System.out.println("2) Agregar información familiar. ");
        System.out.println("3) Eliminar nota. ");
        System.out.println("4) Mostrar notas registradas. ");
        return menu;
    }
}
