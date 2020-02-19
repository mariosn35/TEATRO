package modelos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
    private long idSecretario;
    private long idEmpleado;
    private int mes;/*Modela mes. Valor positivo*/
    private int anio;/*Modela año. Valor positivo*/
    private boolean revisado;/*Modela si está revisada o no*/
    private Empleado empleado;
    private Coste coste;
    private Secretariado secretariado;

    public Nomina() {

    }

    public Nomina(long id, long idSecretario, long idEmpleado, int mes, int anio, boolean revisado, Empleado empleado, Coste coste, Secretariado secretariado) throws NominaException {
        this.id = id;
        this.idSecretario = idSecretario;
        this.idEmpleado = idEmpleado;
        this.mes = mes;
         if (mes < 1 || mes > 12) {
            throw new NominaException("El mes sólo es valido del uno al doce");
        }
        this.anio = anio;
        if (anio < 1980 || anio > 2021) {
            throw new NominaException("El año sólo puede ser un valor entre 1980 a 2021 ");
        }
        this.revisado = revisado;
        this.empleado = empleado;
        this.coste = coste;
        this.secretariado = secretariado;
    }

    public Nomina(Nomina n) throws NominaException {

        this.id = n.getId();
        this.idEmpleado = n.getIdEmpleado();
        this.idSecretario = n.getIdSecretario();
        this.mes = n.getMes();
        if (mes < 1 || mes > 12) {
            throw new NominaException("El mes sólo es valido del uno al doce");
        }
        this.anio = n.getAnio();   
        if (anio < 1980 || anio > 2021) {
            throw new NominaException("El año sólo puede ser un valor entre 1980 a 2021 ");
        }
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

    public void setMes(int mes) throws NominaException {
        this.mes = mes;
        if (mes < 1 || mes > 12) {
            throw new NominaException("El mes sólo es valido del uno al doce");
        }
    }

    public int getAnio() {
        return anio;
    }

    public long getIdSecretario() {
        return idSecretario;
    }

    public void setIdSecretario(long idSecretario) {
        this.idSecretario = idSecretario;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setAnio(int anio) throws NominaException {
        this.anio = anio;
        if (anio < 1980 || anio > 2021) {
            throw new NominaException("El año sólo puede ser un valor entre 1980 a 2021 ");
        }
    }

    public boolean getRevisado() {
        return revisado;
    }

    public void setRevisado(boolean revisado) {
        this.revisado = revisado;
    }
     public static Nomina nuevoNomina() throws ParseException, NominaException,CosteException {
    char g='s';
    Nomina nomina = new Nomina();
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
    nomina.setMes(mes);
    if (mes < 1 || mes > 12) {
    throw new NominaException("El mes sólo es valido del uno al doce");
    }
    System.out.println("Mete el año de creacion");
    año=in.nextInt();
    nomina.setAnio(año);        
    if (año < 1980 || año > 2021) {
            throw new NominaException("El año sólo puede ser un valor entre 1980 a 2021 ");
        }
    do{
    System.out.println("Di si esta revisado s para si n para no");
    c = in.next().charAt(0); 
    
    
    } while (c!='s'&& c!='S' && c!='n'&& c!='N' );
    if  (c=='s' || c=='S') accesible=true; 
    else accesible=false;
    nomina.setRevisado(accesible);
       System.out.println("quieres asignar un secretariado a esta nomina");
             z = in.next().charAt(0);
         if (z == 's' || z == 'S') {
             secretariado=Secretariado.nuevoSecretariado();
    nomina.setSecretariado(secretariado);
            } else {
                System.out.println("No has asiganado un secretariado a esta nomina");
            }
      
       System.out.println("quieres asignar un empleado a esta nomina");
             z = in.next().charAt(0);
         if (z == 's' || z == 'S') {
             empleado=Empleado.nuevoEmpleado();
    nomina.setEmpleado(empleado);
            } else {
                System.out.println("No has asiganado un empleado a esta nomina");
            }
         System.out.println("quieres asignar un coste a esta nomina");
          z = in.next().charAt(0);
         if (z == 's' || z == 'S') {
           coste=Coste.nuevoCoste();
    nomina.setCoste(coste);
            } else {
                System.out.println("No has asiganado un coste a esta nomina");
            }

    System.out.println("¿Los datos son correctos?"+nomina);
      
      System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
      g= in.next().charAt(0);
    } while  (g!='s'&& g!='S' );  
    return nomina;
    
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
     public void exportarAFichero(String ruta) throws IOException{
     
     FileWriter flujoLectura;
     BufferedWriter flujoBuffer = null;
       try{
           
            //Abro stream, crea el fichero si no existe
            flujoLectura=new FileWriter(ruta);
            //Escribimos en el fichero un String y un caracter 97 (a)
            flujoBuffer=new BufferedWriter(flujoLectura);
            flujoBuffer.write(this.data());
           
            flujoBuffer.flush();
                //Abro el stream, el fichero debe existir
            
            //Leemos el fichero y lo mostramos por pantalla
            
          
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
    

    
//String[]Cadenas=String split ("\\|")
    
   
    }
    @Override
    public String toString() {
        return "Nomina{" + "id=" + id + ", idSecretario=" + idSecretario + ", idEmpleado=" + idEmpleado + ", mes=" + mes + ", anio=" + anio + ", revisado=" + revisado + ", empleado=" + empleado + ", coste=" + coste + ", secretariado=" + secretariado + '}';
    }

    public String data() {
        return "" + getId() + "|" + getIdSecretario() + "|" + getIdEmpleado() + "|" + getMes() + "|" + getAnio() + "|" + getRevisado() + "|" + getEmpleado() + "|" + getCoste() + "|" + getSecretariado();
    }
}
