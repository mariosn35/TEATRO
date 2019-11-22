/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author Andres version 1.0
 */
public class ETeatro extends Empleado {

    private char categoria;
    //Modela la categoria del empleado entre A,B,C o D
    private Grupo grupo;

    public ETeatro() {
        super();
    }

    public ETeatro(ETeatro a) {
        super(a);
        this.categoria = a.getCategoria();

    }

    public ETeatro(long id, String nombre, String apellidos, String nif, String direccion, String telefono, char categoria, Grupo grupo) {
        super(id, nombre, apellidos, nif, direccion, telefono);
        this.categoria = categoria;
        this.grupo = grupo;
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

    @Override
    public String toString() {
        return "ETeatro{" + "categoria=" + categoria + ", grupo=" + grupo + '}';
    }

    public String data() {
        return super.data() + "|" + getCategoria() + "|" + getGrupo();
    }
}
