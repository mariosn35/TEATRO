/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author Andres version 1.0
 */
public class Acomodador extends ETeatro {

    //Modela los costes producidos por cada acomodador
    private Coste coste;

    public Acomodador() {
        super();
    }

    public Acomodador(long id, String nombre, String apellidos, String nif, String direccion, String telefono, char categoria, Grupo grupo, Coste coste) {
        super(id, nombre, apellidos, nif, direccion, telefono, categoria, grupo);
    }

    public Acomodador(Acomodador a) {
        super(a);
    }

    public Coste getCoste() {
        return coste;
    }

    public void setCoste(Coste coste) {
        this.coste = coste;
    }

    public Acomodador getAcomodadoresById(long id) {

        Acomodador ac = null;
        /* for(int i=0; i< Lista.size (); i++){
     c=(Acomodador) Lista[i];
     
        if( f.getId()== Id){
        }
        
     } 
         */
        return ac;
    }

    public ArrayList<Acomodador> getAllAcomodadores() {
        ArrayList<Acomodador> Acomodadores = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           c= Acomodador Lista[i];
        Acomodadores.add(f);
       
         */
        return Acomodadores;
    }

    @Override
    public String toString() {
        return "Acomodador{" + "coste=" + coste + '}';
    }

    public String data() {
        return super.data();
    }

}
