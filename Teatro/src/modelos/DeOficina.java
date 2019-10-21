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
public class DeOficina {
    protected long id;
    private int antiguedad;/**Modela a los empleados de oficina 
     *                        cuantos años llevan trabajando en
     *                        el teatro y puede tomar valores positivos y no puede ser negativo */

    public DeOficina() {
    }

    public DeOficina(int antiguedad,long id) {
        this.antiguedad = antiguedad;
        this.id = id;
    }
    public DeOficina(DeOficina o) {
        this.antiguedad = o.getAntiguedad();
        this.id = o.getId();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "DeOficina{" + "id=" + id + ", antiguedad=" + antiguedad + '}';
    }
   
    public String data() {
    return  ""+getId()+"/"+getAntiguedad();
    }
}
