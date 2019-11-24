/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andres version 1.0
 */
public class Taquilla extends ETeatro {

    public Taquilla() {
        super();
    }

    public Taquilla(long id, String nombre, String apellidos, String nif, String direccion, String telefono, char categoria, Grupo grupo) {
        super(id, nombre, apellidos, nif, direccion, telefono, categoria, grupo);
    }

    public Taquilla(Taquilla t) {
        super(t);
    }
    public static Taquilla nuevoTaquilla() {
            char s;
     Taquilla t = new Taquilla();
     Scanner in;
     in = new Scanner(System.in);
     do{
      t=(Taquilla) ETeatro.nuevoETeatro();
     
      System.out.println("¿Los datos son correctos?"+t);
      
      System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
      s= in.next().charAt(0); 
      
      } while  (s!='s'&& s!='S' );  
    return t;
    
    }
    public Taquilla getTaquillaById(long id) {

        Taquilla t = null;
        /* for(int i=0; i< Lista.size (); i++){
     n=(Taquilla) Lista[i];
     
        if( f.getId()== Id){
        }
        
     } 
         */
        return t;
    }

    public ArrayList<Taquilla> getAllTaquillas() {
        ArrayList<Taquilla> Taquillas = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           g= Grupo Lista[i];
       Taquilla.add(f);
       
         */
        return Taquillas;
    }

    @Override
    public String toString() {
        return super.toString() + "Taquilleros{" + '}';
    }

    public String data() {
        return super.data() + "";
    }
}
