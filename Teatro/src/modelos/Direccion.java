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
public class Direccion extends EOficina{
   
    private int añoscargo;/**Modela a los directores cuantos años llevan en el cargo
     *                        puede ser de positivo y no pueden ser negativos */

    public Direccion() {
        super();
    }
public Direccion(long id, String nombre, String apellidos, String nif, String direccion, String telefono,int antiguedad) {
        super (id,nombre,apellidos,nif,direccion,telefono,antiguedad);
    }
   
     public Direccion(Direccion d){
        super(d);
        this.añoscargo = d.getAñoscargo();
        
    }

   

    
    
    

    
    public int getAñoscargo() {
        return añoscargo;
    }

    public void setAñoscargo(int añoscargo) {
        this.añoscargo = añoscargo;
    }

    @Override
    public String toString() {
        return super.toString()+"Direccion{" + "a\u00f1oscargo=" + añoscargo + '}';
    }

   
   
public String data() {
 return  super.data()+""+getAñoscargo();

}
}
