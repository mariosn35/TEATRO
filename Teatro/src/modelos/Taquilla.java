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
public class Taquilla extends ETeatro{

    public Taquilla() {
        super();
    }
    public Taquilla(long id, String nombre, String apellidos, String nif, String direccion, String telefono,char categoria) {
        super (id,nombre,apellidos,nif,direccion,telefono,categoria);
    }
   public Taquilla(Taquilla t){
       super(t);
   }
    @Override
    public String toString() {
        return super.toString()+"Taquilleros{" + '}';
    }

    public String data() {
        return super.data()+"";
    }
}
