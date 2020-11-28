package Problema9;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class Tester {

    static Curso c = null;

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        SistemaNotas sistema = new SistemaNotas();
        //Curso c = new Curso(); 

        int optMenu = 0;
        System.out.println("Bienvenido por favor seleccione la opción que desea realizar: ");

        do {
            System.out.println();
            System.out.println("1) Agregar información del curso.");
            System.out.println("2) Agregar nota. ");
            System.out.println("3) Eliminar nota. ");
            System.out.println("4) Mostrar notas registradas. ");
            System.out.println("5) Salir. ");

            optMenu = input.nextInt();

            switch (optMenu) {

                case 1: {

                    c = new Curso();
                    System.out.print("Ingrese el Nombre Completo del profesor: ");
                    c.setNombreProfesor(input.next());
                    System.out.print("Ingrese la materia: ");
                    c.setMateria(input.next());
                    System.out.print("Ingrese el código del curso: ");
                    c.setCodigoCurso(input.next());
                    System.out.print("Ingrese el horario del curso: ");
                    c.setHorarioCurso(input.next());
                    break;
                }

                case 2: {

                    if (c == null) {
                        System.out.println("Primero debe ingresar la información del curso.");

                    } else {
                        Alumno a = new Alumno();
                        System.out.print("Digite el nombre del alumno:");
                        a.setNombre(input.next());
                        System.out.print("Digite el apellido:");
                        a.setApellido(input.next());
                        System.out.print("Digite el carne:");
                        a.setCarnet(input.nextInt());
                        Examen e = new Examen();
                        System.out.print("Digite los puntos totales del parcial:");
                        e.setPuntosTotal(input.nextInt());
                        System.out.print("Digite los puntos obtenidos:");
                        e.setPuntosObtenidos(input.nextInt());
                        System.out.print("Digite la nota obtenida:");
                        e.setNota(input.nextInt());
                        e.setAlumno(a);
                        PadreFamiliar p = new PadreFamiliar();
                        System.out.print("Digite el nombre del encargado legal: ");
                        p.setNombre(input.next());
                        System.out.print("Digite el apellido: ");
                        p.setApellido(input.next());
                        System.out.print("Digite la edad: ");
                        p.setEdad(input.nextInt());
                        a.setPadre(p);
                        sistema.agregarEx(e);
                    }
                    break;
                }

                case 3: {

                    if (sistema.contador == 0) {
                        System.out.println("No existen notas registradas.");
                    } else {
                        sistema.eliminarEx();
                        System.out.println("La nota anterior ha sido eliminada con exito!");
                    }
                    break;
                }

                case 4: {
                    if (sistema.contador != 0) {
                        System.out.println("****Curso**** ");
                        System.out.println("Profesor: " + c.getNombreProfesor());
                        System.out.println("Materia: " + c.getMateria());
                        System.out.println("Código Curso: " + c.getCodigoCurso());
                        System.out.println("Horario Curso: " + c.getHorarioCurso());
                        System.out.println("********************************");
                        System.out.println("*** Total notas registradas *** ");
                        sistema.mostrarExamenes();

                    } else {
                        System.out.println("No existen registros en el sistema.");
                    }
                    break;
                }

            }

        } while (optMenu < 5);

    }

}
