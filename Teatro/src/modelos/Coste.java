package modelos;

import java.util.Date;

/**
 *
 * @author Mario
 * @version 1.0
 */
public class Coste {
    protected long id;/*Modela el número de reportes. Valor positivo*/
    private Date fecha;
    private double importe;
    private String reporte;
    
    public Coste() {
    }
    
    public Coste( Date fecha, double importe, String reporte) {
        
        this.fecha = fecha;
        this.importe = importe;
        this.reporte = reporte;
    }
    
    public Coste (Coste c) {
        
        this.fecha = c.getFecha();
        this.importe = c.getImporte();
        this.reporte = c.getReporte();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        this.reporte = reporte;
    }

    @Override
    public String toString() {
        return "Coste{" + "id=" + id + ", fecha=" + fecha + ", importe=" + importe + ", reporte=" + reporte + '}';
    }
    
    public String data() {
        return ""+getId()+"|"+getFecha()+"|"+getImporte()+"|"+getReporte();
    }           
}
