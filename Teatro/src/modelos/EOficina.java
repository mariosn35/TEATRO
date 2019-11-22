package modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author roterr
 * @version 1.0
 */
public class EOficina extends Empleado {

    private int antiguedad;

    /**
     * Modela a los empleados de oficina cuantos años llevan trabajando en el
     * teatro y puede tomar valores positivos y no puede ser negativo
     */
    public EOficina() {
        super();
    }

    public EOficina(long id, String nombre, String apellidos, String nif, String direccion, String telefono, int antiguedad) {
        super(id, nombre, apellidos, nif, direccion, telefono);
        this.antiguedad = antiguedad;

    }

    public EOficina(EOficina o) {
        super(o);
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
        return super.toString() + "EOficina{" + "antiguedad=" + antiguedad + '}';
    }

    public String data() {
        return super.data() + "" + getAntiguedad();
    }
}
