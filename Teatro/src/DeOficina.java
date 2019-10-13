/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roter
 */
public class DeOficina {
    private int antiguedad;

    public DeOficina() {
    }

    public DeOficina(int antiguedad) {
        this.antiguedad = antiguedad;
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
