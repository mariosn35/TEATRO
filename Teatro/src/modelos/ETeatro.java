/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Andres version 1.0
 */
public class ETeatro extends Empleado{

    private char categoria;
    //Modela la categoria del empleado entre A,B,C o D
    public Grupo grupo;

    public ETeatro() {
        super();
    }

    public ETeatro(ETeatro a) {
        super(a);
        this.categoria = a.getCategoria();

    }

    public ETeatro(long id, String nombre, String apellidos, String nif, String direccion, String telefono,char categoria, Grupo grupo) {
        super(id,nombre,apellidos,nif,direccion,telefono);
        this.categoria = categoria;
        this.grupo = grupo;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString()+"deTeatro{" + "categoria=" + categoria + '}';
    }

    public String data() {
        return super.data()+"" + getCategoria();
    }
}
