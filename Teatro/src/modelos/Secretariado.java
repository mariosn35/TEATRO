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
public class Secretariado extends EOficina{
    
    public Secretariado() {
        super();
        
    }
    public Secretariado(long id, String nombre, String apellidos, String nif, String direccion, String telefono,int antiguedad) {
        super (id,nombre,apellidos,nif,direccion,telefono,antiguedad);
    }
   
      public Secretariado(Secretariado s) {
       super(s);
    }


    @Override
    public String toString() {
      return super.toString()+"";
    }

   
     public String data() {
    return  super.data()+"";
    }
}
