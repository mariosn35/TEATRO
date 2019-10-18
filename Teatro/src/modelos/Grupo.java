package modelos;


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
        return "Grupos{" + "semana=" + semana + '}';
    }
     public String data() {
    return  ""+getSemana();
    }
}
