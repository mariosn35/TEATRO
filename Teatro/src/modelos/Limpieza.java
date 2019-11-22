package modelos;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author roter
 * @version 1.0
 */
public class Limpieza extends ETeatro {

    private Coste coste;

    public Limpieza() {
        super();
    }

    public Limpieza(long id, String nombre, String apellidos, String nif, String direccion, String telefono, char categoria, Grupo grupo, Coste coste) {
        super(id, nombre, apellidos, nif, direccion, telefono, categoria, grupo);
    }

    public Limpieza(Limpieza l) {
        super(l);
    }

    public Coste getCoste() {
        return coste;
    }

    public void setCoste(Coste coste) {
        this.coste = coste;
    }

    public Limpieza getLimpiezasById(long id) {

        Limpieza l = null;
        /* for(int i=0; i< Lista.size (); i++){
     c=(Limpieza) Lista[i];
     
        if( f.getId()== Id){
        }
        
     } 
         */
        return l;
    }

    public ArrayList<Limpieza> getAllLimpiezas() {
        ArrayList<Limpieza> Limpiezas = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           c= Limpieza Lista[i];
        Limpiezas.add(f);
       
         */
        return Limpiezas;
    }

    @Override
    public String toString() {
        return "Limpieza{" + "coste=" + coste + '}';
    }

    public String data() {
        return super.data() + "|" + getCoste();
    }
}
