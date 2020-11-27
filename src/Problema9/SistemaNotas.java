/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema9;

/**
 *
 * @author Karlenypc
 */
public class SistemaNotas {

    int maxRegistro = 1000;                       //Variable Global Max de Registros
    Examen[] examenes = new Examen[maxRegistro];
    int contador = 0;                             //Contador Registros

    public SistemaNotas() {
    }
    
    //agregar un examen al arreglo
    public boolean agregarEx(Examen ex) {
        boolean resultado = false;
        if (contador < maxRegistro) {       //el arreglo tiene espacio
            examenes[contador] = ex;
            contador++;
            resultado = true;
        }
        return resultado;
    }

    //elimina el ult examen del arreglo
    public boolean eliminarEx() {
        boolean resultado = false;
        if (contador != 0) {
            examenes[contador - 1] = null;
            contador--;
            resultado = true; 
        }
        
        return resultado;
    }
    
    //mostrar examenes
    public void mostrarExamenes() {
        for (int i = 0; i < contador; i++) {
            if (examenes[i] != null) {
                System.out.print(examenes[i].getAlumno().toString());
                System.out.println(examenes[i].toString());
            }
        }
    }

    //calcular promedio
    public float promedioNotas() {
        float retorno = 0f;
        
        return retorno;
    }
}