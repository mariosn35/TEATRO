package modelos;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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
public class Direccion extends EOficina implements Serializable {

    private int añoscargo;
    
    /**
     * Modela annio los directores cuantos años llevan en el cargo puede ser de
 positivo y no pueden ser negativos
     */

    public Direccion() {
        super();
    }
    /***
     * 
     * @param e 
     */
     public Direccion(Empleado e) {
        super(e);
 
    }
     /***
      * 
      * @param e
      * @param añoscargo 
      */
     public Direccion(Empleado e,int añoscargo) {
        super(e);
        this.añoscargo =  añoscargo;
    }
/**
 * 
 * @param id
 * @param nombre
 * @param apellidos
 * @param nif
 * @param direccion
 * @param telefono
 * @param antiguedad
 * @param horastrabajadas
 * @param salarioporhora
 * @param salariomensual 
 */
    public Direccion(long id, String nombre, String apellidos, String nif, String direccion, String telefono,  int antiguedad, int horastrabajadas, double salarioporhora, double salariomensual) {
        super(id, nombre, apellidos, nif, direccion, telefono,  antiguedad, horastrabajadas, salarioporhora, salariomensual);
    }
/***
 * 
 * @param d 
 */
    public Direccion(Direccion d) {
        super(d);
        this.añoscargo = d.getAñoscargo();

    }
/***
 * crea un objeto de tipo direccion y le pide al usuario meter los datos
 * @return un objeto de tipo direccion
 */
    public static Direccion nuevoDireccion() {
        char s='s';
        Scanner in;
        int annio;
        
        in = new Scanner(System.in);
        Direccion direccion=new Direccion();
        do{
        direccion = new Direccion(EOficina.nuevoEOficina());
        System.out.println("Años al cargo");
        annio = in.nextInt();
  System.out.println("¿Los datos son correctos?"+direccion);
      
      System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
      s= in.next().charAt(0);
      } while  (s!='s'&& s!='S' );           

        return direccion;

    }

    public Direccion getDireccionById(long Id) {
        Direccion d = null;
        /* for(int i=0; i< Lista.size (); i++){
     direccion=(Direccion) Lista[i];
     
        if( direccion.getId()== Id){
        }
        
     } 
         */
        return d;
    }

    public ArrayList<Direccion> getAllDirecciones() {
        ArrayList<Direccion> Direcciones = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           direccion= Direcciones Lista[i];
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
        return super.toString() + "Direccion{" + "a\u00f1oscargo=" + añoscargo + '}';
    }

    public String data() {
        return super.data() + "" + getAñoscargo() ;

    }
}
