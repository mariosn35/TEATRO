/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andres version 1.0
 */
public class Taquilla extends ETeatro implements Serializable {

    public Taquilla() {
        super();
    }

    public Taquilla(long id, String nombre, String apellidos, String nif, String direccion, String telefono, int horastrabajadas, double salarioporhora, double salariomensual, long idGrupo, char categoria, Grupo grupo) {
        super(id, nombre, apellidos, nif, direccion, telefono, horastrabajadas, salarioporhora, salariomensual,idGrupo ,categoria, grupo);
    }

    public Taquilla(Taquilla t) {
        super(t);
    }
        public Taquilla(ETeatro e) {
        super(e);
    }

    public static Taquilla nuevoTaquilla() {
            char s='s';
     Taquilla taquilla;
     Scanner in;
     in = new Scanner(System.in);
     do{
      taquilla = new Taquilla(ETeatro.nuevoETeatro());
     
      System.out.println("¿Los datos son correctos?"+taquilla);
      
      System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
       s= in.next().charAt(0); 
      
      } while  (s!='s'&& s!='S' );  
    return taquilla;
    
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
     public void exportarAFichero(String ruta) throws IOException{
     
     FileWriter flujoLectura;
     BufferedWriter flujoBuffer = null;
       try{
           
            //Abro stream, crea el fichero si no existe
            flujoLectura=new FileWriter(ruta);
            //Escribimos en el fichero un String y un caracter 97 (a)
            flujoBuffer=new BufferedWriter(flujoLectura);
            flujoBuffer.write(this.data());
           
            flujoBuffer.flush();
                //Abro el stream, el fichero debe existir
            
            //Leemos el fichero y lo mostramos por pantalla
            
          
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
    

    
//String[]Cadenas=String split ("\\|")
    
   
    }
    @Override
    public String toString() {
        return super.toString() + "Taquilleros{" + '}';
    }

    public String data() {
        return super.data() + "";
    }
}
