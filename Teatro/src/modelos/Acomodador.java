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
 * @author Andres version 1.0
 */
public class Acomodador extends ETeatro implements Serializable {

    //Modela los costes producidos por cada acomodador
    public Acomodador() {
        super();
    }

    public Acomodador(ETeatro e) {
        super(e);
    }

    public Acomodador(long id, String nombre, String apellidos, String nif, String direccion, String telefono, int horastrabajadas, double salarioporhora, double salariomensual, long idGrupo, char categoria, Grupo grupo) {
        super(id, nombre, apellidos, nif, direccion, telefono, horastrabajadas, salarioporhora, salariomensual, idGrupo, categoria, grupo);
    }

    public Acomodador(Acomodador a) {
        super(a);
    }

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

    public Coste nuevoCoste() throws ParseException {
        char d = 'h';
        char z = 'l';
        Coste coste = new Coste();
        Scanner in;
        double importe;
        String reporte;
        in = new Scanner(System.in);
        Acomodador acomodador = null;
        Limpieza limpieza = null;
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
     //public void exportarAbinario(String ruta) throws IOException{
     
     //FileOutputStream fus = new FileOutputStream(ruta);
     //fus.write(this.data());
     
     
     
     
     //}
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
        return super.toString() + "Acomodador{" + '}';
    }

    public String data() {
        return super.data();
    }

}
