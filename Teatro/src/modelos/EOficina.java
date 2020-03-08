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
public class EOficina extends Empleado implements Serializable {

    private int antiguedad;

    /**
     * Modela antiguedad los empleados de oficina cuantos años llevan trabajando en el
 teatro y puede tomar valores positivos y no puede ser negativo
     */
    public EOficina() {
        super();
    }
/***
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

    public EOficina(long id, String nombre, String apellidos, String nif, String direccion, String telefono, int antiguedad, int horastrabajadas, double salarioporhora, double salariomensual) {
        super(id, nombre, apellidos, nif, direccion, telefono, horastrabajadas, salarioporhora, salariomensual);
        this.antiguedad = antiguedad;

    }
/***
 * 
 * @param e 
 */
    public EOficina(Empleado e) {
        super(e);
    }
/***
 * 
 * @param e
 * @param anios 
 */
    public EOficina(Empleado e, int anios) {
        super(e);
        this.antiguedad = anios;
    }
/***
 * 
 * @param o 
 */
    public EOficina(EOficina o) {
        super(o);
        this.antiguedad = o.getAntiguedad();

    }
/***
 * crea un objeto de tipo eoficina y le pide al usuario que meta los datos
 * @return un objeto de tipo eoficina 
 */
    public static EOficina nuevoEOficina() {
        char d='s';
        Scanner in;
        int antiguedad;
        EOficina oficina ;
        in = new Scanner(System.in);

        do {
            oficina = new EOficina(Empleado.nuevoEmpleado());
            
            System.out.println("Mete tus años de antiguedad");
            antiguedad = in.nextInt();
            oficina.setAntiguedad(antiguedad);
            System.out.println("¿Los datos son correctos?" + (EOficina) oficina);
            System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
            d = in.next().charAt(0);
        } while (d != 's' && d != 'S');

        return oficina;

    }

    public EOficina getEOficinaById(long Id) {
        EOficina e = null;
        /* for(int i=0; i< Lista.size (); i++){
     e=(Empleado) Lista[i];
     
        if( e.getId()== Id){
        }
        
     } 
         */
        return e;
    }

    public ArrayList<EOficina> getAllEOficinas() {
        ArrayList<EOficina> EOficinas = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           e= Empleado Lista[i];
       Empleados.add(f);
       
         */
        return EOficinas;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
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
        return super.toString() + "EOficina{" + "antiguedad=" + antiguedad + '}';
    }

    
    public String data() {
        return super.data() + "" + getAntiguedad();
    }
}
