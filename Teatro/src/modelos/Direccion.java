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
     public Direccion(Empleado e) {
        super(e);
        
    }
     public Direccion(Empleado e,int añoscargo) {
        super(e);
        this.añoscargo =  añoscargo;
    }

    public Direccion(long id, String nombre, String apellidos, String nif, String direccion, String telefono,  int antiguedad, int horastrabajadas, double salarioporhora, double salariomensual) {
        super(id, nombre, apellidos, nif, direccion, telefono,  antiguedad, horastrabajadas, salarioporhora, salariomensual);
    }

    public Direccion(Direccion d) {
        super(d);
        this.añoscargo = d.getAñoscargo();

    }

    public static Direccion nuevoDireccion() {
        char s;
        Scanner in;
        int a;
        
        in = new Scanner(System.in);
        Direccion d;
        do{
        d = new Direccion(EOficina.nuevoEOficina());
        System.out.println("Años al cargo");
        a = in.nextInt();
  System.out.println("¿Los datos son correctos?"+d);
      
      System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
      s= in.next().charAt(0);
      } while  (s!='s'&& s!='S' );           

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
