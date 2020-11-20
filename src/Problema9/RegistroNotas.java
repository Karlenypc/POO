
package Problema9;

/**
 *
 * @author Karlenypc
 */
public class RegistroNotas {
     
     int MaxEst = 1000;           //Variable Global Max de Registros
     Alumno[] estudiantes;
     int nEstudiantes;           // Contador Registros
     int[] nCarnet;
     int[] notas;
     
     public RegistroNotas() {
         nEstudiantes = 0;
         estudiantes = new Alumno[1000];
         
         for (int i =0; i < estudiantes.length; i++) {
             estudiantes [i] = null; 
         }
         //alum1...
     }
     
     
     public void registroAlumno(String nombre, String apellido, int carnet, int nota) {
         
         
     }
     
}
