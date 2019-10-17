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
public class Director {
    private int añoscargo;/**Modela a los directores cuantos años llevan en el cargo
     *                        puede ser de positivo y no pueden ser negativos */

    public Director() {
    }

    public Director(int añoscargo) {
        this.añoscargo = añoscargo;
    }
     public Director(Director d){
        
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
        return "DeDirrecion{" + "a\u00f1oscargo=" + añoscargo + '}';
    }
public String data() {
 return  ""+getAñoscargo();

}
}
