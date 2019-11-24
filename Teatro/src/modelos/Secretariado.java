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
public class Secretariado extends EOficina{
      public static Secretariado nuevoSecretariado() {
      Secretariado s = new Secretariado();
      char d;
      Scanner in;
      do{
      s=(Secretariado) EOficina.nuevoEOficina();
      in = new Scanner(System.in);
      System.out.println("¿Los datos son correctos?"+s);
      
      System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
      d= in.next().charAt(0); 
      } while  (d!='s'&& d!='S' );       
          
    return s;
    
    }
      
        public Secretariado getSecretarioById (long Id) {
     Secretariado s = null;
    /* for(int i=0; i< Lista.size (); i++){
     s=(Secretariado) Lista[i];
     
        if( s.getId()== Id){
        }
        
     } 
     */
    return s;
    }
    
    public ArrayList<Secretariado> getAllSecretariados() {
        ArrayList<Secretariado> Secretariados = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           g= Grupo Lista[i];
       Secretariado.add(f);
       
         */
        return Secretariados;
    }

    public Secretariado() {
        super();
        
    }
    public Secretariado(long id, String nombre, String apellidos, String nif, String direccion, String telefono,int antiguedad) {
        super (id,nombre,apellidos,nif,direccion,telefono,antiguedad);
    }
   
      public Secretariado(Secretariado s) {
       super(s);
    }


    @Override
    public String toString() {
      return super.toString()+"";
    }

   
     public String data() {
    return  super.data()+"";
    }
}
