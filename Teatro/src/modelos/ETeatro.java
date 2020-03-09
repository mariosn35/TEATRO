/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andres version 1.0
 */
public class ETeatro extends Empleado implements Serializable {

    private char categoria;
    private long idGrupo;
    //Modela la categoria del empleado entre A,B,C o D
    private Grupo grupo;

    public ETeatro() {
        super();
    }
/***
 * 
 * @param e 
 */
    public ETeatro(Empleado e) {
        super(e);
    }
/***
 * 
 * @param e
 * @param c
 * @param g
 * @param idGrupo 
 */
    public ETeatro(Empleado e, char c, Grupo g, long idGrupo) {
        super(e);
        this.categoria = c;
        this.grupo = g;
        this.idGrupo = idGrupo;

    }
/***
 * 
 * @param a 
 */
    public ETeatro(ETeatro a) {
        super(a);
        this.categoria = a.getCategoria();
        this.grupo = a.getGrupo();
        this.idGrupo = a.getIdGrupo();

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
    public ETeatro(long id, String nombre, String apellidos, String nif, String direccion, String telefono, int horastrabajadas, double salarioporhora, double salariomensual,long idGrupo ,char categoria, Grupo grupo) {
        super(id, nombre, apellidos, nif, direccion, telefono, horastrabajadas, salarioporhora, salariomensual);
        this.idGrupo = idGrupo;
        this.categoria = categoria;
        this.grupo = grupo;
    }
/***
 * crea un objeto de tipo etreatro y le pide al usuario que le meta los datos
 * @return un objeto de tipò eteatro 
 */
    public static ETeatro nuevoETeatro() {
        char z='f';
        char d='d';
        Scanner in;
        char a='s';
        ETeatro eteatro;
        Grupo grupo;
        in = new Scanner(System.in);
        do {
            eteatro = new ETeatro(Empleado.nuevoEmpleado());
            System.out.println("Mete tu categoria");
            a = in.next().charAt(0);
            eteatro.setCategoria(a);
            System.out.println("quieres asignar un grupo a esta este empleado de teatro");
            z = in.next().charAt(0);
            if (z == 's' || z == 'S') {
                grupo = Grupo.nuevogrupo();
                eteatro.setGrupo(grupo);
            } else {
                System.out.println("No has asiganado un grupo a esta este empleado de teatro");
            }

            System.out.println("¿Los datos son correctos?" + eteatro);

            System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
            d = in.next().charAt(0);
        } while (d != 's' && d != 'S');

        return eteatro;

    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public long getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(long idGrupo) {
        this.idGrupo = idGrupo;
    }

    public ETeatro getETeatroById(long id) {

        ETeatro et = null;
        /* for(int i=0; i< Lista.size (); i++){
     et=(Eteatro) Lista[i];
     
        if( f.getId()== Id){
        }
        
     } 
         */
        return et;
    }

    public ArrayList<ETeatro> getAllEsTeatro() {
        ArrayList<ETeatro> EsTeatro = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           f= ETeatro Lista[i];
        EsTeatro.add(f);
       
         */
        return EsTeatro;
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
        return "ETeatro{" + "categoria=" + categoria + ", idGrupo=" + idGrupo + ", grupo=" + grupo + '}';
    }

    public String data() {
        return super.data() + "|" + getCategoria() + "|"  + getIdGrupo();
    }
}
