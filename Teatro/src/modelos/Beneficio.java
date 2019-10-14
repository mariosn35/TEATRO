package modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario
 */
public class Beneficio {
    int entradasvendidas;
    int precioentrada;

    public Beneficio() {
        
    }

    public int getEntradasvendidas() {
        return entradasvendidas;
    }

    public void setEntradasvendidas(int entradasvendidas) {
        this.entradasvendidas = entradasvendidas;
    }

    public int getPrecioentrada() {
        return precioentrada;
    }

    public void setPrecioentrada(int precioentrada) {
        this.precioentrada = precioentrada;
    }

    @Override
    public String toString() {
        return "Beneficio{" + "entradasvendidas=" + entradasvendidas + ", precioentrada=" + precioentrada + '}';
    }
                    
}
