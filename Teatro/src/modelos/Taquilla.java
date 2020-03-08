/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
 /**
     * *
     * Función que exporta un coste a un fichero de texto
     *
     * @param ruta String con la ruta del fichero
     * @return true si se exportó con éxito; false en caso contrario
     * @exception IOException si hubo problema al exportar
     */
    public boolean exportarAFichero(String ruta) throws IOException {
        FileWriter flujoLectura;
        BufferedWriter flujoBuffer = null;
        try {

            //Abro stream, crea el fichero si no existe
            flujoLectura = new FileWriter(ruta);
            flujoBuffer = new BufferedWriter(flujoLectura);
            flujoBuffer.write(this.data());
            flujoBuffer.flush();

        } catch (IOException e) {
            System.out.println("Error E/S: " + e);
            return false;
        }
        return true;
    }
          /***
     * Exporta al fichero en forma de string binario un objeto mediante el metodo data
     * @param ruta String con la ruta del fichero
     * @throws IOException 
     */
      public void exportarABinario(String ruta) throws IOException{
     //Copiado de vindios.
     //Copiado de vindios.
      FileOutputStream flujoLectura;
      ObjectOutputStream Oos;
       try{
           
            //Abro stream, crea el fichero si no existe
            flujoLectura=new FileOutputStream(ruta, true);
            //Escribimos en el fichero un String y un caracter 97 (a)
            Oos = new ObjectOutputStream(flujoLectura);
            Oos.writeObject(this);
           
            Oos.flush();
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
