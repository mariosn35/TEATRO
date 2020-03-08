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
public class Limpiador extends ETeatro implements Serializable {

    public Limpiador() {
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
     * @param coste 
     */
    public Limpiador(long id, String nombre, String apellidos, String nif, String direccion, String telefono, int horastrabajadas, double salarioporhora, double salariomensual, long idGrupo, char categoria, Grupo grupo, Coste coste) {
        super(id, nombre, apellidos, nif, direccion, telefono, horastrabajadas, salarioporhora, salariomensual, idGrupo, categoria, grupo);
    }
    /**
     * Constructor de copia
     * @param l 
     */
    public Limpiador(Limpiador l) {
        super(l);
    }
    /**
     * Constructor de copia
     * @param e 
     */
    public Limpiador(ETeatro e) {
        super(e);
    }

    /***
     * Este metodo crea un nuevo Empleado Limpiador
     * @return Devuelve el nuevo Limpiador.
     */
    
    public static Limpiador nuevoLimpiador() {
        char s = 'a';
        char z = 's';
        Scanner in;
        in = new Scanner(System.in);

        Limpiador limpieza;
        do {
            limpieza = new Limpiador(ETeatro.nuevoETeatro());

            System.out.println("¿Los datos son correctos?" + limpieza);

            System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
            s = in.next().charAt(0);
        } while (s != 's' && s != 'S');
        return limpieza;

    }
    /**
     * Esta funcion llama al metodo nuevo coste para añadir un coste cada vez que se ejecute.
     * @return Devuelve los datos del coste creado
     * @throws ParseException  Puede lanzar ParseException
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
            coste.setLimpiador(this);

            /*  System.out.println("Introduzca la fecha con formato dd-mm-yyyy");
                 
             String fecha = in.nextLine();
             SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
             String date = fecha;
             Date testDate = df.parse(date);
             long lnMilisegundos = testDate.getTime();
                 
             java.sql.Date fe = new java.sql.Date(lnMilisegundos);;
             System.out.println("Ahora hemos creado un objeto date con la fecha indicada, "+fe);
                 
             if (!df.format(testDate).equals(date)){
             System.out.println("invalid date!!");
             } else {
             System.out.println("valid date");
             coste.setFecha(fe);
             }
             */
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

    public Limpiador getLimpiezasById(long id) {

        Limpiador l = null;
        /* for(int i=0; i< Lista.size (); i++){
         c=(Limpiador) Lista[i];
     
         if( f.getId()== Id){
         }
        
         } 
         */
        return l;
    }

    public ArrayList<Limpiador> getAllLimpiezas() {
        ArrayList<Limpiador> Limpiezas = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
         c= Limpiador Lista[i];
         Limpiezas.add(f);
       
         */
        return Limpiezas;
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
        return super.toString() + "Limpieza{" + '}';
    }

    public String data() {
        return super.data();
    }
}
