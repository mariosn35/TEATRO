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
public class Empleado {

    protected long id;
    //Modela el identificador propio de cada empleado
    private String nombre;
    //Modela el nombre del empleado en cuestion
    private String apellidos;
    //Modela los dos primeros apellidos del empleado
    private int nif;
    //Modela el NIF del empleado
    private String direccion;
    //Modela la direccion de empadronamiento del empleado
    private int telefono;
    //Modela el telefono de contacto del empleado

    public Empleado() {
    }

    public Empleado(Empleado a) {
        this.apellidos = a.getApellidos();
        this.direccion = a.getDireccion();
        this.id = a.getId();
        this.nombre = a.getNombre();
        this.nif = a.getNif();
        this.telefono = a.getTelefono();
    }

    public Empleado(long id, String nombre, String apellidos, int nif, String direccion, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Empleados{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    public String data() {
        return "" + getId() + "|" + getNif() + "|" + getNombre() + "|" + getApellidos() + "|" + getTelefono() + "|" + getDireccion();
    }

}
