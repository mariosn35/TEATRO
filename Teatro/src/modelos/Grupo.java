package modelos;

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
    private int semana;/**  Va del 1 al 52 y al pasar de año se reinicia
                          indica la semana de creacion del grupo  */
    
   
    public Grupo() {
    }

    public Grupo(int semana,int anno,String nombre) {
        
        this.semana = semana;
        this.anno = anno;
        this.nombre = nombre;
    }
    public Grupo(Grupo g) {
        this.semana = g.getSemana();
        this.anno = g.getAnno();
        this.nombre = g.getNombre();
        
        
    }
      public Grupo nuevogrupo() {
        
        Scanner in;
        int a;
        String b;
        
        int c;
       
        
    in = new Scanner(System.in);
    Grupo g = null;
    System.out.println("Año de creacion del grupo");
    a=in.nextInt();
    System.out.println("Nombre del grupo");
    b=in.nextLine();
    do {
    System.out.println("Semana de creacion del grupo que va de 1 al 52");
    c=in.nextInt();
    
    }while (c<1 || c>52);
    
      
    
    return g;
    
    }
       public Grupo getGrupoById (long Id) {
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

    @Override
    public String toString() {
        return "Grupo{" + "id=" + id + ", anno=" + anno + ", nombre=" + nombre + ", semana=" + semana + '}';
    }
    
     public String data() {
    return  ""+getId()+"/"+getAnno()+"/"+getNombre()+"/"+getSemana();
    }
}
