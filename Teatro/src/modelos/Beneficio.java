package modelos;

import java.util.Date;

/**
 *
 * @author Mario
 * @version 1.1
 */
public class Beneficio {
    protected long id;/*Modela el identificador propio*/
    private Date fecha;/*Modela la fecha de adquisicion del beneficio*/
    private double importe;/*Modela importe en euros.*/
    private String reporte;/*Modela reportes.*/
    private Informe informe;
    private Bono bono;
    private Taquilla taquilla;
    

    public Beneficio() {     
    }
    
    public Beneficio(long id, Date fecha, double importe, String reporte, Informe informe,Bono bono, Taquilla taquilla) {
        this.id = id;
        this.fecha = fecha;
        this.importe = importe;
        this.reporte = reporte;
        this.informe = informe;
        this.bono = bono;
        this.taquilla = taquilla;
    }
    
    public Beneficio (Beneficio b) {
        this.id = b.getId();
        this.fecha = b.getFecha();
        this.importe = b.getImporte();
        this.reporte = b.getReporte();
        this.informe = b.getInforme();
        this.bono = b.getBono();
        this.taquilla = b.getTaquilla();
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

    public Informe getInforme() {
        return informe;
    }

    public void setInforme(Informe informe) {
        this.informe = informe;
    }

    public Bono getBono() {
        return bono;
    }

    public void setBono(Bono bono) {
        this.bono = bono;
    }

    public Taquilla getTaquilla() {
        return taquilla;
    }

    public void setTaquilla(Taquilla taquilla) {
        this.taquilla = taquilla;
    }
    
    public String data() {
        return ""+getId()+"|"+getFecha()+"|"+getImporte()+"|"+getReporte();
    }
}
