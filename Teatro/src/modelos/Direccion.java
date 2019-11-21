package modelos;

import java.util.ArrayList;
import java.util.Scanner;

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
public class Direccion extends EOficina {

    private int añoscargo;

    /**
     * Modela a los directores cuantos años llevan en el cargo puede ser de
     * positivo y no pueden ser negativos
     */

    public Direccion() {
        super();
    }

    public Direccion(long id, String nombre, String apellidos, String nif, String direccion, String telefono, int antiguedad) {
        super(id, nombre, apellidos, nif, direccion, telefono, antiguedad);
    }

    public Direccion(Direccion d) {
        super(d);
        this.añoscargo = d.getAñoscargo();

    }

    public Direccion nuevoDireccion() {

        Scanner in;
        int a;

        in = new Scanner(System.in);
        Direccion d = null;
        System.out.println("Años al cargo");
        a = in.nextInt();

        return d;

    }

    public Direccion getDireccionById(long Id) {
        Direccion d = null;
        /* for(int i=0; i< Lista.size (); i++){
     d=(Direccion) Lista[i];
     
        if( d.getId()== Id){
        }
        
     } 
         */
        return d;
    }

    public ArrayList<Direccion> getAllDirecciones() {
        ArrayList<Direccion> Direcciones = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           d= Direcciones Lista[i];
        Direcciones.add(f);
       
         */
        return Direcciones;
    }

    public int getAñoscargo() {
        return añoscargo;
    }

    public void setAñoscargo(int añoscargo) {
        this.añoscargo = añoscargo;
    }

    @Override
    public String toString() {
        return super.toString() + "Direccion{" + "a\u00f1oscargo=" + añoscargo + '}';
    }

    public String data() {
        return super.data() + "" + getAñoscargo() ;

    }
}
