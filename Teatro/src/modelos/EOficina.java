package modelos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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

    public EOficina(long id, String nombre, String apellidos, String nif, String direccion, String telefono, int antiguedad, int horastrabajadas, double salarioporhora, double salariomensual) {
        super(id, nombre, apellidos, nif, direccion, telefono, horastrabajadas, salarioporhora, salariomensual);
        this.antiguedad = antiguedad;

    }

    public EOficina(Empleado e) {
        super(e);
    }

    public EOficina(Empleado e, int anios) {
        super(e);
        this.antiguedad = anios;
    }

    public EOficina(EOficina o) {
        super(o);
        this.antiguedad = o.getAntiguedad();

    }

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
        return super.toString() + "EOficina{" + "antiguedad=" + antiguedad + '}';
    }

    
    public String data() {
        return super.data() + "" + getAntiguedad();
    }
}
