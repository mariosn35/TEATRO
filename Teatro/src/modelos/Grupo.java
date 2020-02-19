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
public class Grupo {

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

    public Grupo(int semana, int anno, String nombre) {

        this.semana = semana;
        this.anno = anno;
        this.nombre = nombre;
    }

    public Grupo(Grupo g) {
        this.semana = g.getSemana();
        this.anno = g.getAnno();
        this.nombre = g.getNombre();

    }

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
        return "Grupo{" + "id=" + id + ", anno=" + anno + ", nombre=" + nombre + ", semana=" + semana + '}';
    }

    public String data() {
        return "" + getId() + "/" + getAnno() + "/" + getNombre() + "/" + getSemana();
    }
}
