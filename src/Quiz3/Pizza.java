/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz3;

/**
 *
 * @author Karlenypc
 */
public class Pizza {

    Ingredientes ingrediente1;
    Ingredientes ingrediente2;
    Ingredientes ingrediente3;
    Ingredientes ingrediente4;

    public double calcularMonto() {
        double resultado = 0;
        if (ingrediente1 != null) {
            resultado += ingrediente1.getPrecio();
        }

        if (ingrediente2 != null) {
            resultado += ingrediente2.getPrecio();
        }

        if (ingrediente2 != null) {
            resultado += ingrediente3.getPrecio();
        }

        if (ingrediente2 != null) {
            resultado += ingrediente4.getPrecio();
        }
        if (resultado != 0) {
            resultado = resultado + resultado % 30;
        }
        return resultado;
    }

    public Ingredientes getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(Ingredientes ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }

    public Ingredientes getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(Ingredientes ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }

    public Ingredientes getIngrediente3() {
        return ingrediente3;
    }

    public void setIngrediente3(Ingredientes ingrediente3) {
        this.ingrediente3 = ingrediente3;
    }

    public Ingredientes getIngrediente4() {
        return ingrediente4;
    }

    public void setIngrediente4(Ingredientes ingrediente4) {
        this.ingrediente4 = ingrediente4;
    }

}
