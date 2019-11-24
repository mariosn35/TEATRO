package modelos;

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.util.Scanner;

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

    public Beneficio(long id, Date fecha, double importe, String reporte, Informe informe, Bono bono, Taquilla taquilla) {
        this.id = id;
        this.fecha = fecha;
        this.importe = importe;
        this.reporte = reporte;
        this.informe = informe;
        this.bono = bono;
        this.taquilla = taquilla;
    }

    public Beneficio(Beneficio b) {
        this.id = b.getId();
        this.fecha = b.getFecha();
        this.importe = b.getImporte();
        this.reporte = b.getReporte();
        this.informe = b.getInforme();
        this.bono = b.getBono();
        this.taquilla = b.getTaquilla();
    }
public static Beneficio nuevoBeneficio() throws ParseException {
        char s;
        Scanner in;
        
        Double d;
        String c;
         in = new Scanner(System.in);
      Beneficio b = new Beneficio();
      Informe i = new Informe();
      Taquilla t= new Taquilla();
      Bono bo = new Bono();
      do{
      System.out.println("Introduzca la fecha de creacion");
    Date fe=Cajadeherramientas.readDate(in,"DD-MM-YYYY");
    b.setFecha(fe);
      System.out.println("Introduzca el importe en euros ");
      d=in.nextDouble();
      b.setImporte(d);
      System.out.println("Introduzca el Reporte ");
      c=in.nextLine();
      b.setReporte(c);
      System.out.println("Introduce el informe al que pertenece ");
      i=Informe.nuevoinforme();
      b.setInforme(i);
      System.out.println("Introduce el Taquillero al que pertenece ");
      t=Taquilla.nuevoTaquilla();
      b.setTaquilla(t);
      System.out.println("Introduce el bono al que pertenece ");
      bo=Bono.nuevoBono();
      b.setBono(bo);
       System.out.println("¿Los datos son correctos?"+b);
      
      System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
      s= in.next().charAt(0);
      } while  (s!='s'&& s!='S' );    
    return b;
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

    public Beneficio getBeneficioById(long Id) {
        Beneficio bf = null;
        /* for(int i=0; i< Lista.size (); i++){
     s=(Beneficio) Lista[i];
     
        if( s.getId()== Id){
        }
        
     } 
         */
        return bf;
    }

    public ArrayList<Beneficio> getAllBeneficios() {
        ArrayList<Beneficio> Beneficios = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           g= Grupo Lista[i];
       Beneficios.add(f);
       
         */
        return Beneficios;
    }

    @Override
    public String toString() {
        return "Beneficio{" + "id=" + id + ", fecha=" + fecha + ", importe=" + importe + ", reporte=" + reporte + ", informe=" + informe + ", bono=" + bono + ", taquilla=" + taquilla + '}';
    }

    public String data() {
        return "" + getId() + "|" + getFecha() + "|" + getImporte() + "|" + getReporte() + "|" + getInforme() + "|" + getBono() + "|" + getTaquilla();
    }
}
