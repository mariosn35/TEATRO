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
public class Acomodador extends ETeatro{

  
    //Modela los costes producidos por cada acomod

    public Acomodador() {
    }
    public Acomodador(long id, String nombre, String apellidos, String nif, String direccion, String telefono,char categoria) {
        super (id,nombre,apellidos,nif,direccion,telefono,categoria);
    }
    public Acomodador(Acomodador a) {
       super(a);
    }

    @Override
    public String toString() {
        return super.toString()+"Acomodador{" + '}';
    }

  public String data() {
    return super.data() ;
    }
  
}
