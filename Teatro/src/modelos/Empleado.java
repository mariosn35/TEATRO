/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;
/**
 *
 * @author Andres version 1.0
 */
public class Empleado implements Serializable {
    
    private static final long serialVersionUID = 123325L;

    protected long id;
    //Modela el identificador propio de cada empleado
    private String nombre;
    //Modela el nombre del empleado en cuestion
    private String apellidos;
    //Modela los dos primeros apellidos del empleado
    private String nif;
    //Modela el NIF del empleado
    private String direccion;
    //Modela la direccion de empadronamiento del empleado
    private String telefono;
    //Modela el telefono de contacto del empleado
    private int horastrabajadas;
    private double salarioporhora;
    private double salariomensual;
    

    public Empleado() {
        super();
    }

    public Empleado(Empleado empleado) {
        this.apellidos = empleado.getApellidos();
        this.direccion = empleado.getDireccion();
        this.id = empleado.getId();
        this.nombre = empleado.getNombre();
        this.nif = empleado.getNif();
        this.telefono = empleado.getTelefono();
        this.horastrabajadas = empleado.getHorastrabajadas();
        this.salarioporhora = empleado.getSalarioporhora();
        this.salariomensual = empleado.getSalariomensual();
    }

    public Empleado(long id, String nombre, String apellidos, String nif, String direccion, String telefono, int horastrabajadas, double salarioporhora, double salariomensual) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horastrabajadas = horastrabajadas;
        this.salarioporhora = salarioporhora;
        this.salariomensual = salariomensual;

    }
       public static Empleado nuevoEmpleado() {
        char s='s';
        Scanner in;
        String nombre;
        String apellidos;
        String nif;
        String direccion;
        String telefono;
        int horastrabajadas;
        double salarioporhora;
        double salariomensual;
        
    in = new Scanner(System.in);
    Empleado empleado = new Empleado();
    do{
    System.out.println("Introduce tu nombre");
    nombre=in.nextLine();
    empleado.setNombre(nombre);
    System.out.println("Introduce tus apellidos");
    apellidos=in.nextLine();
    empleado.setApellidos(apellidos);
    System.out.println("Introduce tu nif");
    nif=in.nextLine();
    empleado.setNif(nif);
    System.out.println("Introduce tu direccion");
    direccion=in.nextLine();
    empleado.setDireccion(direccion);
    System.out.println("Introduce tu telefono");
    telefono=in.nextLine();
    empleado.setTelefono(telefono);
        System.out.println("Introduce las horas trabajadas");
    horastrabajadas=in.nextInt();
    empleado.setHorastrabajadas(horastrabajadas);
        System.out.println("Introduce el salario por hora");
    salarioporhora=in.nextDouble();
    empleado.setSalarioporhora(salarioporhora);
        System.out.println("Introduce el salario mínimo mensual");
    salariomensual=in.nextDouble();
    empleado.setSalariomensual(salariomensual);
      System.out.println("¿Los datos son correctos?"+empleado);
      
      System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
      s= in.next().charAt(0);
      } while  (s!='s'&& s!='S' );           

    return empleado;
    
       }
           public Empleado getEmpleadoById (long Id) {
    Empleado empleado = null;
    /* for(int i=0; i< Lista.size (); i++){
     e=(Empleado) Lista[i];
     
        if( e.getId()== Id){
        }
        
     } 
     */
    return empleado;
    }
    
    public ArrayList<Empleado> getAllEmpleados() {
       ArrayList<Empleado> Empleados = new ArrayList();
       /*for (int i=0; i< Lista.size(); i++)
           e= Empleado Lista[i];
       Empleados.add(f);
       
       */
        return Empleados;
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

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public double getSalarioporhora() {
        return salarioporhora;
    }

    public void setSalarioporhora(double salarioporhora) {
        this.salarioporhora = salarioporhora;
    }

    public double getSalariomensual() {
        return salariomensual;
    }

    public void setSalariomensual(double salariomensual) {
        this.salariomensual = salariomensual;
    }

    
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", direccion=" + direccion + ", telefono=" + telefono + ", horastrabajadas=" + horastrabajadas + ", salarioporhora=" + salarioporhora + ", salariomensual=" + salariomensual + '}';
    }
    
    public String data() {
        return "" + getId() + "|" + getNif() + "|" + getNombre() + "|" + getApellidos() + "|" + getTelefono() + "|" + getDireccion() + "|" + getHorastrabajadas() + "|" + getSalarioporhora() + "|" + getSalariomensual();
    }

}
