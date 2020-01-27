package modelos;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mario
 * @version 1.1
 */
public class Nomina {

    protected long id;/*Modela id. Valor positivo*/
    private int mes;/*Modela mes. Valor positivo*/
    private int anio;/*Modela año. Valor positivo*/
    private boolean revisado;/*Modela si está revisada o no*/
    private Empleado empleado;
    private Coste coste;
    private Secretariado secretariado;

    public Nomina() {

    }

    public Nomina(long id, int mes, int anio, boolean revisado, Empleado empleado, Coste coste, Secretariado secretariado) throws NominaException {

        this.id = id;
        this.mes = mes;
        this.anio = anio;
        this.revisado = revisado;
        this.empleado = empleado;
        this.coste = coste;
        this.secretariado = secretariado;
    }

    public Nomina(Nomina n) throws NominaException {

        this.id = n.getId();
        this.mes = n.getMes();
        this.anio = n.getAnio();
        this.revisado = n.getRevisado();
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Coste getCoste() {
        return coste;
    }

    public void setCoste(Coste coste) {
        this.coste = coste;
    }

    public Secretariado getSecretariado() {
        return secretariado;
    }

    public void setSecretariado(Secretariado secretariado) {
        this.secretariado = secretariado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean getRevisado() {
        return revisado;
    }

    public void setRevisado(boolean revisado) {
        this.revisado = revisado;
    }
     public static Nomina nuevoNomina() throws ParseException, NominaException {
    char g='s';
    Nomina n = new Nomina();
    int mes;
    int año;
    char c='s';
    boolean accesible;
    char z='s';
    Scanner in;
    Secretariado secretariado;
    Empleado empleado;
    Coste coste;
    in = new Scanner(System.in);
    do{
    System.out.println("Mete el mes de creacion de la nomina");
    mes=in.nextInt();
    n.setMes(mes);
    System.out.println("Mete el año de creacion");
    año=in.nextInt();
    n.setAnio(año);
    do{
    System.out.println("Di si esta revisado s para si n para no");
    c = in.next().charAt(0); 
    
    
    } while (c!='s'&& c!='S' && c!='n'&& c!='N' );
    if  (c=='s' || c=='S') accesible=true; 
    else accesible=false;
    n.setRevisado(accesible);
       System.out.println("quieres asignar un secretariado a esta nomina");
             z = in.next().charAt(0);
         if (z == 's' || z == 'S') {
             secretariado=Secretariado.nuevoSecretariado();
    n.setSecretariado(secretariado);
            } else {
                System.out.println("No has asiganado un secretariado a esta nomina");
            }
      
       System.out.println("quieres asignar un empleado a esta nomina");
             z = in.next().charAt(0);
         if (z == 's' || z == 'S') {
             empleado=Empleado.nuevoEmpleado();
    n.setEmpleado(empleado);
            } else {
                System.out.println("No has asiganado un empleado a esta nomina");
            }
         System.out.println("quieres asignar un coste a esta nomina");
          z = in.next().charAt(0);
         if (z == 's' || z == 'S') {
           coste=Coste.nuevoCoste();
    n.setCoste(coste);
            } else {
                System.out.println("No has asiganado un coste a esta nomina");
            }

    System.out.println("¿Los datos son correctos?"+n);
      
      System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
      g= in.next().charAt(0);
    } while  (g!='s'&& g!='S' );  
    return n;
    
    }
    public Nomina getNominaById(long id) {

        Nomina n = null;
        /* for(int i=0; i< Lista.size (); i++){
     n=(Nomina) Lista[i];
     
        if( f.getId()== Id){
        }
        
     } 
         */
        return n;
    }

    public ArrayList<Nomina> getAllNominas() {
        ArrayList<Nomina> Nominas = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           f= Franquicia Lista[i];
        Franquicias.add(f);
       
         */
        return Nominas;
    }

    @Override
    public String toString() {
        return "Nomina{" + "id=" + id + ", mes=" + mes + ", anio=" + anio + ", revisado=" + revisado + '}' + ", empleado=" + empleado + "coste=" + coste + ", secretariado=" + secretariado;
    }

    public String data() {
        return "" + getId() + "|" + getMes() + "|" + getAnio() + "|" + getRevisado() + "|" + getEmpleado() + "|" + getCoste() + "|" + getSecretariado();
    }
}
