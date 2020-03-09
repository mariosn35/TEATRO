/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. jajajaja
 */
package modelos;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Andres version 2.0
 */
public class Acomodador extends ETeatro implements Serializable {

    //Modela los costes producidos por cada acomodador
      /*
    Llama al al constructor por defecto de ETEATRO
    
    
    
    */
    public Acomodador() {
        super();
    }
/***
 * 
 * @param e 
 */
 
    public Acomodador(ETeatro e) {
        super(e);
    }
/***
 * 
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
    public Acomodador(long id, String nombre, String apellidos, String nif, String direccion, String telefono, int horastrabajadas, double salarioporhora, double salariomensual, long idGrupo, char categoria, Grupo grupo) {
        super(id, nombre, apellidos, nif, direccion, telefono, horastrabajadas, salarioporhora, salariomensual, idGrupo, categoria, grupo);
    }
/***
 * 
 * @param a 
 */
    public Acomodador(Acomodador a) {
        super(a);
    }
/***
 * Crea un objeto de tipo acomodador y le al usuario que le asigne valores
 * @return 
 */
    public static Acomodador nuevoAcomodador() {
        
        char z = 's';
        char s = 's';
        Scanner in;
        in = new Scanner(System.in);

        Acomodador acomodador;
        do {
            acomodador = new Acomodador(ETeatro.nuevoETeatro());

            System.out.println("¿Los datos son correctos?" + acomodador);

            System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
            s = in.next().charAt(0);
        } while (s != 's' && s != 'S');
        return acomodador;

    }

    public Acomodador getAcomodadoresById(long id) {

        Acomodador ac = null;
        /* for(int i=0; i< Lista.size (); i++){
     c=(Acomodador) Lista[i];
     
        if( f.getId()== Id){
        }
        
     } 
         */
        return ac;
    }

    public ArrayList<Acomodador> getAllAcomodadores() {
        ArrayList<Acomodador> Acomodadores = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           c= Acomodador Lista[i];
        Acomodadores.add(f);
       
         */
        return Acomodadores;
    }
/***
 * Crea un objeto de tipo coste y le al usuario que le asigne valores
 * @return 
 * @throws ParseException 
 */
    public Coste nuevoCoste() throws ParseException {
        char d = 'h';
        char z = 'l';
        Coste coste = new Coste();
        Scanner in;
        double importe;
        String reporte;
        in = new Scanner(System.in);
        Acomodador acomodador = null;
        Limpiador limpieza = null;
        do {

            //System.out.println("Introduzca la fecha de creacion");
            //Date fe=Cajadeherramientas.readDate(in,"DD-MM-YYYY");
            //c.setFecha(fe);
            coste.setAcomodador(this);

            System.out.println("Introduzca la fecha con formato dd-mm-yyyy");

            String fecha = in.nextLine();
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            String date = fecha;
            Date testDate = df.parse(date);
            long lnMilisegundos = testDate.getTime();

            java.sql.Date fe = new java.sql.Date(lnMilisegundos);;
            System.out.println("Ahora hemos creado un objeto date con la fecha indicada, " + fe);

            if (!df.format(testDate).equals(date)) {
                System.out.println("invalid date!!");
            } else {
                System.out.println("valid date");
                coste.setFecha(fe);
            }

            System.out.println("Introduzca el importe en euros");
            importe = in.nextDouble();
            coste.setImporte(importe);
            System.out.println("Introduzca el Reporte");
            reporte = in.nextLine();
            coste.setReporte(reporte);

            System.out.println("¿Los datos son correctos?" + coste);

            System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
            d = in.next().charAt(0);

        } while (d != 's' && d != 'S');
        return coste;
    }
/***
 * crea un arraylist en el que va añadiendo nuveos costes
 * 
 * @return devuelve un array de costes
 */
    public ArrayList<Coste> añadirCosteReparacion() {
        ArrayList<Coste> costesReparacion = new ArrayList<Coste>();
        try {
            char eleccion = '0';

            Scanner in = new Scanner(System.in);

            do {
                Coste c = new Coste();
                c = this.nuevoCoste();
                costesReparacion.add(c);

                System.out.println("quiere añadir mas coste pulse s o S");
                eleccion = in.next().charAt(0);

            } while (eleccion == 's' && eleccion == 'S');
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }
        return costesReparacion;
    }

    public Coste getCosteById(long Id) {
        Coste c = null;
        /* for(int importe=0; importe< Lista.size (); importe++){
     s=(Coste) Lista[importe];
     
        if( s.getId()== Id){
        }
        
     } 
         */
        return c;
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
        return super.toString() + "Acomodador{" + '}';
    }

    public String data() {
        return super.data();
    }

}
