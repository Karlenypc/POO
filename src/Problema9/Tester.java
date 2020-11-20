package Problema9;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class Tester {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Alumno llamada = new Alumno();
        //RegistroNotas estudiantes = new RegistroNotas();
        Alumno[] alumnos = new Alumno[6];
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno(
                    llamada.getNombre(),
                    llamada.getApellido(),
                    llamada.getCarnet(),
                    llamada.getNota()
            );
            
        }
        
        
        int optMenu = 0;
        System.out.println("Bienvenido por favor seleccione la opción que desea realizar: ");

        do {
            System.out.println();
            System.out.println("1) Agregar nota. ");
            System.out.println("2) Eliminar nota. ");
            System.out.println("3) Mostrar notas registradas. ");
            System.out.println("4) Salir del bucle. ");

            optMenu = input.nextInt();

            switch (optMenu) {

                case 1: {
                    llamada.leerDatos();
                    break;
                }
                
                case 2 : {
                    break;
                    
                }
                
                case 3: {
                    llamada.mostrarDatos();
                    break;
                }
            }

        } while (optMenu < 5);

    }
}
