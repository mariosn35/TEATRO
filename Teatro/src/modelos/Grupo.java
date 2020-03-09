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
public class Grupo implements Serializable {

    protected long id;
    private int anno;//**Indica el año de creacion del grupo. Tiene que ser el año actual 
    private String nombre;//Da nombre al grupo
    private int semana;

    /**
     * Va del 1 al 52 y al pasar de año se reinicia indica la semana de creacion
     * del grupo
     */


    public Grupo() {
    }
/***
 * 
 * @param semana
 * @param anno
 * @param nombre 
 */
    public Grupo(int semana, int anno, String nombre) {

        this.semana = semana;
        this.anno = anno;
        this.nombre = nombre;
    }
/***
 * 
 * @param g 
 */
    public Grupo(Grupo g) {
        this.semana = g.getSemana();
        this.anno = g.getAnno();
        this.nombre = g.getNombre();

    }
/***
 * crea un objeto de tipo grupo y le pide al usuario meter los datos
 * @return un objeto de tipo grupo
 */
    public static Grupo nuevogrupo() {
        char s='a';
        Scanner in;
        int año;
        String nombre;

        int semana;

        in = new Scanner(System.in);
        Grupo g = new Grupo();
        do {
            System.out.println("Año de creacion del grupo");
            año = in.nextInt();
            g.setAnno(año);
            System.out.println("Nombre del grupo");
            nombre=in.nextLine();
            g.setNombre(nombre);
            do {
                System.out.println("Semana de creacion del grupo que va de 1 al 52");
                semana = in.nextInt();

            } while (semana < 1 || semana > 52);
            System.out.println("¿Los datos son correctos?" + g);

            System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
            s = in.next().charAt(0);
        } while (s != 's' && s != 'S');

        return g;

    }

    public Grupo getGrupoById(long Id) {
        Grupo g = null;
        /* for(int i=0; i< Lista.size (); i++){
     f=(Grupo) Lista[i];
     
        if( f.getId()== Id){
        }
        
     } 
         */
        return g;
    }

    public ArrayList<Grupo> getAllGrupos() {
        ArrayList<Grupo> Grupos = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           g= Grupo Lista[i];
        Grupos.add(f);
       
         */
        return Grupos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemana() {
        return semana;
    }

    public void setSemana(int semana) {
        this.semana = semana;
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
        return "Grupo{" + "id=" + id + ", anno=" + anno + ", nombre=" + nombre + ", semana=" + semana + '}';
    }

    public String data() {
        return "" + getId() + "/" + getAnno() + "/" + getNombre() + "/" + getSemana();
    }
}
