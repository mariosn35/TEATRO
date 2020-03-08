package modelos;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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
public class Secretariado extends EOficina implements Serializable {

    public Secretariado() {
        super();

    }
    /**
     * Construcor por argumentos
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
    public Secretariado(long id, String nombre, String apellidos, String nif, String direccion, String telefono, int antiguedad, int horastrabajadas, double salarioporhora, double salariomensual) {
        super(id, nombre, apellidos, nif, direccion, telefono, antiguedad, horastrabajadas, salarioporhora, salariomensual);
    }
    /**
     * Constructor de copia
     * @param s 
     */
    public Secretariado(Secretariado s) {
        super(s);
    }
    /**
     * Constructor de copia 
     * @param e 
     */
    public Secretariado(EOficina e) {
        super(e);
    }
    /***
     * Este metodo crea un nuevo Empleado Secretario con los datos que se introducen por teclado.
     * @return Devuelve el nuevo Secretario con los datos que se han introducido.
     */
    public static Secretariado nuevoSecretariado() {
        Secretariado secretariado;
        char d='d';
        Scanner in;
        in = new Scanner(System.in);
        do {
            secretariado = new Secretariado(EOficina.nuevoEOficina());

            System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
            d = in.next().charAt(0);
        } while (d != 's' && d != 'S');

        return secretariado;

    }

    public Secretariado getSecretarioById(long Id) {
        Secretariado s = null;
        /* for(int i=0; i< Lista.size (); i++){
     secretariado=(Secretariado) Lista[i];
     
        if( secretariado.getId()== Id){
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

    public static boolean revisado(boolean re) {

        return re;
    }

    public ArrayList<Nomina> calcularNomina() throws ParseException, NominaException, CosteException {
        char s = 'k';
       // int horastrabajadas;
       // double salarioporhora;
       // double salariomensual;
        

        ArrayList<Nomina> Nominas = new ArrayList<Nomina>();
        Nomina nomina = new Nomina();
        nomina = Nomina.nuevoNomina();
              Scanner sc = new Scanner (System.in);
            
       
        System.out.print("Ingrese las horas trabajadas: ");
        int horastrabajadas = sc.nextInt();
        System.out.print("Ingrese el valor del salario por hora: ");
        double salarioporhora = sc.nextDouble();
        System.out.print("Ingrese el salario mínimo mensual: ");
        double salariomensual = sc.nextDouble();
        
        double pagonomina = horastrabajadas * salarioporhora;
        if(pagonomina > salariomensual) {
        
        System.out.println("Nómina total del mes: " + pagonomina);  
        
        (nomina.getCoste()).setImporte(pagonomina);
        } else {
        
        System.out.println("La nómina es el salario mínimo = " + salariomensual);
   
         (nomina.getCoste()).setImporte(salariomensual);}
         
    System.out.println("La nomina es:" + nomina);
       
    Nominas.add(nomina);
    return Nominas;
    
    
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
        return super.toString() + "";
    }

    public String data() {
        return super.data() + "";
    }
}
