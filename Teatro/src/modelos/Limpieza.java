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
public class Limpieza extends ETeatro{
    
    public Limpieza() {
        super();
    }
       public Limpieza(long id, String nombre, String apellidos, String nif, String direccion, String telefono,char categoria, Grupo grupo) {
        super (id,nombre,apellidos,nif,direccion,telefono,categoria,grupo);
    }
   public Limpieza(Limpieza l){
     super(l);
   }
    @Override
    public String toString() {
        return super.toString()+"Limpieza{" + '}';
    }

  
    
   


   
    

   
    
     public String data() {
    return  super.data()+"";
    }
}
