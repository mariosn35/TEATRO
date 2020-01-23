package modelos;

import java.text.ParseException;
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
public class Limpieza extends ETeatro {

    
    

    public Limpieza() {
        super();
    }

    public Limpieza(long id, String nombre, String apellidos, String nif, String direccion, String telefono, int horastrabajadas, double salarioporhora, double salariomensual, char categoria, Grupo grupo, Coste coste) {
        super(id, nombre, apellidos, nif, direccion, telefono, horastrabajadas, salarioporhora, salariomensual, categoria, grupo);
    }

    public Limpieza(Limpieza l) {
        super(l);
    }
    public Limpieza(ETeatro e) {
        super(e);
    }
 

   


    public static Limpieza nuevoLimpiador() {
        char s;
      char z;
        Scanner in;
         in = new Scanner(System.in);
         
      Limpieza l;
      do{
    l = new Limpieza(ETeatro.nuevoETeatro());
    
     
      System.out.println("¿Los datos son correctos?"+l);
      
      System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
      s= in.next().charAt(0);
      }while  (s!='s'&& s!='S' ); 
    return l;
    
    
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
        return super.toString()+"Limpieza{" + '}';
    }

    

    public String data() {
        return super.data();
    }
}
