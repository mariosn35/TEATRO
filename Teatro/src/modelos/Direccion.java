package modelos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
     * Modela annio los directores cuantos años llevan en el cargo puede ser de
 positivo y no pueden ser negativos
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
        return super.toString() + "Direccion{" + "a\u00f1oscargo=" + añoscargo + '}';
    }

    public String data() {
        return super.data() + "" + getAñoscargo() ;

    }
}
