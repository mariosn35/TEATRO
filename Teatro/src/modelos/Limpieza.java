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
    public static Limpieza nuevoLimpiador() throws ParseException {
        char s;
        Scanner in;
         in = new Scanner(System.in);
         Coste c= new Coste();
      Limpieza l = new Limpieza();
      do{
      l=(Limpieza) ETeatro.nuevoETeatro();
       System.out.println("quieres asignar un coste a esta este empleado de limpieza");
            char z = 0;
         if (z == 's' || z == 'S') {
           c=Coste.nuevoCoste();
      l.setCoste(c);
            } else {
                System.out.println("No has asiganado un coste a esta este empleado de limpieza");
            }
      
     
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
        return "Limpieza{" + "coste=" + coste + '}';
    }

    public String data() {
        return super.data() + "|" + getCoste();
    }
}
