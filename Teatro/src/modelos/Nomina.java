package modelos;

/**
 *
 * @author Mario
 * @version 1.0
 */
public class Nomina {
    protected long id;/*Modela id. Valor positivo*/   
    private int mes;/*Modela mes. Valor positivo*/
    private int anio;
    private boolean revisado;
    
    public Nomina() {
        
    }
    
    public Nomina( int mes, int anio, boolean revisado) {
             
         this.mes = mes;
         this.anio = anio;
         this.revisado = revisado;
    }
    
    public Nomina (Nomina n) {
        
        this.mes = n.getMes();
        this.anio = n.getAnio();
        this.revisado = n.getRevisado();
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

    @Override
    public String toString() {
        return "Nomina{" + "id=" + id + ", mes=" + mes + ", anio=" + anio + ", revisado=" + revisado + '}';
    }
    
    public String data() {
        return ""+getId()+"|"+getMes()+"|"+getAnio()+"|"+getRevisado();
    }
}
