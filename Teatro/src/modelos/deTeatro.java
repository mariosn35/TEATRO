/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Andres version 1.0
 */
public class deTeatro {

    private char categoria;

    public deTeatro() {
    }

    public deTeatro(deTeatro a) {
        this.categoria = a.getCategoria();

    }

    public deTeatro(char categoria) {
        this.categoria = categoria;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "deTeatro{" + "categoria=" + categoria + '}';
    }

}
