package modelos;

import java.util.ArrayList;

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
    
    public Nomina(long id, int mes, int anio, boolean revisado, Empleado empleado, Coste coste, Secretariado secretariado) {
         
         this.id = id;
         this.mes = mes;
         this.anio = anio;
         this.revisado = revisado;
         this.empleado = empleado;
         this.coste = coste;
         this.secretariado = secretariado;
    }
    
    public Nomina (Nomina n) {
        
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

    public Nomina getNominaById (long id) {
     
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
        return "Nomina{" + "id=" + id + ", mes=" + mes + ", anio=" + anio + ", revisado=" + revisado + '}' +", empleado=" + empleado +"coste=" + coste + ", secretariado=" + secretariado;
    }
    
    public String data() {
        return ""+getId()+"|"+getMes()+"|"+getAnio()+"|"+getRevisado()+"|"+getEmpleado()+"|"+getCoste()+"|"+getSecretariado();
    }
}
