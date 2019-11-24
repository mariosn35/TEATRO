package modelos;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Mario
 * @version 1.1
 */
public class Coste {

    protected long id;/*Modela el número de reportes. Valor positivo*/
    private Date fecha;/*Modela fecha. Valor positivo*/
    private double importe;/*Modela importe en euros. Valor positivo*/
    private String reporte;/*Modela reporte*/

    public Coste() {
    }

    public Coste(long id, Date fecha, double importe, String reporte) {

        this.id = id;
        this.fecha = fecha;
        this.importe = importe;
        this.reporte = reporte;
    }

    public Coste(Coste c) {

        this.id = c.getId();
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
     public static Coste nuevoCoste() throws ParseException {
      Coste c = new Coste();
      Scanner in;
      double i;
      String r;
      in = new Scanner(System.in);
      System.out.println("Introduzca la fecha de creacion");
    java.sql.Date fe=Cajadeherramientas.readDate(in,"DD-MM-YYYY");
    c.setFecha(fe);
    System.out.println("Introduzca el importe en euros");
    i=in.nextDouble();
    c.setImporte(i);
    System.out.println("Introduzca el Reporte");
    r=in.nextLine();
    c.setReporte(r);
    return c;
    
    }
    public Coste getCosteById(long Id) {
        Coste c = null;
        /* for(int i=0; i< Lista.size (); i++){
     s=(Coste) Lista[i];
     
        if( s.getId()== Id){
        }
        
     } 
         */
        return c;
    }

    public ArrayList<Coste> getAllCostes() {
        ArrayList<Coste> Costes = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           g= Grupo Lista[i];
       Coste.add(f);
       
         */
        return Costes;
    }

    @Override
    public String toString() {
        return "Coste{" + "id=" + id + ", fecha=" + fecha + ", importe=" + importe + ", reporte=" + reporte + '}';
    }

    public String data() {
        return "" + getId() + "|" + getFecha() + "|" + getImporte() + "|" + getReporte();
    }
}
