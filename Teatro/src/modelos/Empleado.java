/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import java.util.ArrayList;
import java.util.Scanner;
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
    private String nif;
    //Modela el NIF del empleado
    private String direccion;
    //Modela la direccion de empadronamiento del empleado
    private String telefono;
    //Modela el telefono de contacto del empleado
    

    public Empleado() {
        super();
    }

    public Empleado(Empleado a) {
        this.apellidos = a.getApellidos();
        this.direccion = a.getDireccion();
        this.id = a.getId();
        this.nombre = a.getNombre();
        this.nif = a.getNif();
        this.telefono = a.getTelefono();
    }

    public Empleado(long id, String nombre, String apellidos, String nif, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.direccion = direccion;
        this.telefono = telefono;
    }
       public static Empleado nuevoEmpleado() {
        char s;
        Scanner in;
        String a;
        String b;
        String c;
        String d;
        String f;
        
    in = new Scanner(System.in);
    Empleado e = new Empleado();
    do{
    System.out.println("Introduce tu nombre");
    a=in.nextLine();
    e.setNombre(a);
    System.out.println("Introduce tus apellidos");
    b=in.nextLine();
    e.setApellidos(b);
    System.out.println("Introduce tu nif");
    c=in.nextLine();
    e.setNif(c);
    System.out.println("Introduce tu direccion");
    d=in.nextLine();
    e.setDireccion(d);
    System.out.println("Introduce tu telefono");
    f=in.nextLine();
    e.setTelefono(f);
      System.out.println("¿Los datos son correctos?"+e);
      
      System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
      s= in.next().charAt(0);
      } while  (s!='s'&& s!='S' );           

    return e;
    
       }
           public Empleado getEmpleadoById (long Id) {
    Empleado e = null;
    /* for(int i=0; i< Lista.size (); i++){
     e=(Empleado) Lista[i];
     
        if( e.getId()== Id){
        }
        
     } 
     */
    return e;
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

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    public String data() {
        return "" + getId() + "|" + getNif() + "|" + getNombre() + "|" + getApellidos() + "|" + getTelefono() + "|" + getDireccion();
    }

}
