package modelos;

import java.util.Date;

/**
 *
 * @author Mario
 * @version 1.0
 */
public class Beneficio {
    protected long id;/*Modela las entradas vendidas. Valor positivo.*/
    private Date fecha;/*Modela el precio de cada entrada. Valor positivo.*/
    private double importe;
    private String reporte;

    public Beneficio() {     
    }
    
    public Beneficio(long id, Date fecha, double importe, String reporte) {
        this.id = id;
        this.fecha = fecha;
        this.importe = importe;
        this.reporte = reporte;
    }
    
    public Beneficio (Beneficio b) {
        this.id = b.getId();
        this.fecha = b.getFecha();
        this.importe = b.getImporte();
        this.reporte = b.getReporte();
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
    
    public String data() {
        return ""+getId()+"|"+getFecha()+"|"+getImporte()+"|"+getReporte();
    }
}
