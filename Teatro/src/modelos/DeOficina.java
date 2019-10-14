package modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roter @version 1
 */
public class DeOficina {
    private int antiguedad;/**Modela a los empleados de oficina 
     *                        cuantos años llevan trabajando en
     *                        el teatro y puede tomar valores positivos y no puede ser negativo */

    public DeOficina() {
    }

    public DeOficina(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    public DeOficina(DeOficina o) {
        this.antiguedad = o.getAntiguedad();
    }

    

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    @Override
    public String toString() {
        return "DeOficina{" + "antiguedad=" + antiguedad + '}';
    }
}
