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
public class Taquillero extends ETeatro implements Serializable {

    public Taquillero() {
        super();
    }
    /**
     * Constructor por argumentos
     * @param id
     * @param nombre
     * @param apellidos
     * @param nif
     * @param direccion
     * @param telefono
     * @param horastrabajadas
     * @param salarioporhora
     * @param salariomensual
     * @param idGrupo
     * @param categoria
     * @param grupo 
     */
    public Taquillero(long id, String nombre, String apellidos, String nif, String direccion, String telefono, int horastrabajadas, double salarioporhora, double salariomensual, long idGrupo, char categoria, Grupo grupo) {
        super(id, nombre, apellidos, nif, direccion, telefono, horastrabajadas, salarioporhora, salariomensual,idGrupo ,categoria, grupo);
    }
    /**
     * Constructor de copia
     * @param t 
     */
    public Taquillero(Taquillero t) {
        super(t);
    }
        public Taquillero(ETeatro e) {
        super(e);
    }
    /***
     * Este metodo crea un nuevo Empleado Taquillero
     * @return Devuelve los datos del nuevo taquillero.
     */
    public static Taquillero nuevoTaquilla() {
            char s='s';
     Taquillero taquilla;
     Scanner in;
     in = new Scanner(System.in);
     do{
      taquilla = new Taquillero(ETeatro.nuevoETeatro());
     
      System.out.println("¿Los datos son correctos?"+taquilla);
      
      System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
       s= in.next().charAt(0); 
      
      } while  (s!='s'&& s!='S' );  
    return taquilla;
    
    }
    public Taquillero getTaquillaById(long id) {

        Taquillero t = null;
        /* for(int i=0; i< Lista.size (); i++){
     n=(Taquillero) Lista[i];
     
        if( f.getId()== Id){
        }
        
     } 
         */
        return t;
    }

    public ArrayList<Taquillero> getAllTaquillas() {
        ArrayList<Taquillero> Taquillas = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           g= Grupo Lista[i];
       Taquillero.add(f);
       
         */
        return Taquillas;
    }
        /**
     * *
     * Función que exporta un taquillero a un fichero de texto
     *
     * @param ruta String con la ruta del fichero
     * @exception IOException si hubo problema al exportar
     */
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
