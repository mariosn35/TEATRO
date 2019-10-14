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
public class Acomodador {

    private long costes;
    //Modela los costes producidos por cada acomod

    public Acomodador() {
    }

    public Acomodador(Acomodador a) {
        this.costes = a.getCostes();
    }

    public Acomodador(long costes) {
        this.costes = costes;
    }

    public long getCostes() {
        return costes;
    }

    public void setCostes(long costes) {
        this.costes = costes;
    }

    @Override
    public String toString() {
        return "Acomodadores{" + "costes=" + costes + '}';
    }

}
