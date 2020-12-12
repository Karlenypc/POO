package Quiz3;

import java.util.Scanner;

/**
 *
 * @author Karlenypc
 */
public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Cliente 1
        Ingredientes p = new Ingredientes("Pepperoni", "P104", " ", 500);
        Ingredientes c = new Ingredientes("Chile dulce", "C101", " ", 300);
        Ingredientes h = new Ingredientes("Hongos", "H103", " ", 500);
        Ingredientes a = new Ingredientes("Aceitunas", "A105", " ", 400);
        
        Pizza pz = new Pizza();
        pz.setIngrediente1(p);
        pz.setIngrediente2(h);
        pz.setIngrediente3(a);
        
        System.out.println("Cliente 1: " + pz.calcularMonto());
    }
}
