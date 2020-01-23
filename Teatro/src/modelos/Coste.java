package modelos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    private Acomodador acomodador;
    private Limpieza limpiador;
    public Coste() {
    }

    public Coste(long id, Date fecha, double importe, String reporte,Acomodador acomodador,Limpieza limpiador) {

        this.id = id;
        this.fecha = fecha;
        this.importe = importe;
        this.reporte = reporte;
        this.acomodador=acomodador;
        this.limpiador=limpiador;
    }

    public Coste(Coste c) {

        this.id = c.getId();
        this.fecha = c.getFecha();
        this.importe = c.getImporte();
        this.reporte = c.getReporte();
        this.acomodador=c.getAcomodador();
        this.limpiador=c.getLimpiador();
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

    public Acomodador getAcomodador() {
        return acomodador;
    }

    public void setAcomodador(Acomodador acomodador) {
        this.acomodador = acomodador;
    }

    public Limpieza getLimpiador() {
        return limpiador;
    }

    public void setLimpiador(Limpieza limpiador) {
        this.limpiador = limpiador;
    }
    
     public static Coste nuevoCoste()   {
         char d='h';
         char z='l';
      Coste c = new Coste();
      Scanner in;
      double i;
      String r;
      in = new Scanner(System.in);
      Acomodador a = new Acomodador();
      Limpieza l = new Limpieza();
      do{
             try {
                 //System.out.println("Introduzca la fecha de creacion");
                 //Date fe=Cajadeherramientas.readDate(in,"DD-MM-YYYY");
                 //c.setFecha(fe);
                 System.out.println("Introduzca la fecha con formato dd-mm-yyyy");
                 
                 String fecha = in.nextLine();
                 SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                 String date = fecha;
                 Date testDate = df.parse(date);
                 long lnMilisegundos = testDate.getTime();
                 
                 java.sql.Date fe = new java.sql.Date(lnMilisegundos);;
                 System.out.println("Ahora hemos creado un objeto date con la fecha indicada, "+fe);
                 
                 if (!df.format(testDate).equals(date)){
                     System.out.println("invalid date!!");
                 } else {
                     System.out.println("valid date");
                     c.setFecha(fe);
                 }
                 
                 System.out.println("Ha sido reportado por un empleado de limpieza s");
                 z = in.next().charAt(0);
                 if (z == 's' || z=='S') {
                     
                     
                     l=Limpieza.nuevoLimpiador();
                     c.setLimpiador(l);
                 } else {System.out.println("Es un acomodador intruzca los datos");
                 a=Acomodador.nuevoAcomodador();
                 c.setAcomodador(a);}
                 
                 
                 System.out.println("Introduzca el importe en euros");
                 i=in.nextDouble();
                 c.setImporte(i);
                 System.out.println("Introduzca el Reporte");
                 r=in.nextLine();
                 c.setReporte(r);
                 
                 System.out.println("¿Los datos son correctos?"+c);
                 
                 System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
                 d= in.next().charAt(0);
             } catch (ParseException ex) {
                 Logger.getLogger(Coste.class.getName()).log(Level.SEVERE, null, ex);
             }
      } while  (d!='s'&& d!='S' );           
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
        return "Coste{" + "id=" + id + ", fecha=" + fecha + ", importe=" + importe + ", reporte=" + reporte + ", acomodador=" + acomodador + ", limpiador=" + limpiador + '}';
    }


    

    public String data() {
        return "" + getId() + "|" + getFecha() + "|" + getImporte() + "|" + getReporte()+"|"+getAcomodador()+"|"+getLimpiador();
    }
}
