package modelos;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Mario
 * @version 1.1
 */
public class Coste {

    protected long id;/*Modela el número de reportes. Valor positivo*/
    private long idAcomodador;
    private long idLimpieza;
    private long idInforme;
    private long idNomina;
    private Date fecha;/*Modela fecha. Valor positivo*/

    private double importe;/*Modela importe en euros. Valor positivo*/

    private String reporte;/*Modela reporte*/

    private Acomodador acomodador = null;
    private Limpieza limpiador = null;

    public Coste() {
    }

    public Coste(long id, long idAcomodador, long idLimpieza, long idInforme, long idNomina, Date fecha, double importe, String reporte) {
        this.id = id;
        this.idAcomodador = idAcomodador;
        this.idLimpieza = idLimpieza;
        this.idInforme = idInforme;
        this.idNomina = idNomina;
        this.fecha = fecha;
        this.importe = importe;
        this.reporte = reporte;
    }

    

    public Coste(Coste c) {

        this.id = c.getId();
        this.idAcomodador= c.getIdAcomodador();
        this.idLimpieza=c.getIdLimpieza();
        this.idInforme=c.getIdInforme();
        this.idNomina=c.getIdNomina();
        this.fecha = c.getFecha();
        this.importe = c.getImporte();
        this.reporte = c.getReporte();
        this.acomodador = c.getAcomodador();
        this.limpiador = c.getLimpiador();
    }

    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    public long getIdAcomodador() {
        return idAcomodador;
    }

    public void setIdAcomodador(long idAcomodador) {
        this.idAcomodador = idAcomodador;
    }

    public long getIdLimpieza() {
        return idLimpieza;
    }

    public void setIdLimpieza(long idLimpieza) {
        this.idLimpieza = idLimpieza;
    }

    public long getIdInforme() {
        return idInforme;
    }

    public void setIdInforme(long idInforme) {
        this.idInforme = idInforme;
    }

    public long getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(long idNomina) {
        this.idNomina = idNomina;
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

    public static Coste nuevoCoste() throws CosteException {
        char d = 'h';
        char z = 'l';
        Coste coste = new Coste();
        Scanner in;
        double importe = -1;
        String reporte;
        in = new Scanner(System.in);
        Acomodador acomodador = null;
        Limpieza limpieza = null;
        do {

            //System.out.println("Introduzca la fecha de creacion");
            //Date fe=Cajadeherramientas.readDate(in,"DD-MM-YYYY");
            //c.setFecha(fe);
            /*  System.out.println("Introduzca la fecha con formato dd-mm-yyyy");
                 
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
             coste.setFecha(fe);
             }
             */
            try {
                System.out.println("Introduzca el importe en euros");
                importe = Double.valueOf(in.nextLine());
                CosteException.validarImporte(importe);
                coste.setImporte(importe);
            } catch (CosteException ex) {
                System.out.println("se ha producido una CosteException:" + ex.getMessage());
            } catch (java.lang.NumberFormatException ex) {
                System.out.println("se ha producido una NumberFormatException:" + ex.getMessage());
            }

            System.out.println("Introduzca el Reporte");
            reporte = in.nextLine();

            coste.setReporte(reporte);

            System.out.println("¿Los datos son correctos?" + coste);

            System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
            d = in.next().charAt(0);

        } while (d != 's' && d != 'S');
        return coste;
    }

    public Coste getCosteById(long Id) {
        Coste c = null;
        /* for(int importe=0; importe< Lista.size (); importe++){
         s=(Coste) Lista[importe];
     
         if( s.getId()== Id){
         }
        
         } 
         */
        return c;
    }

    public ArrayList<Coste> getAllCostes() {
        ArrayList<Coste> Costes = new ArrayList();
        /*for (int importe=0; importe< Lista.size(); importe++)
         g= Grupo Lista[importe];
         Coste.add(f);
       
         */
        return Costes;
    }

    @Override
    public String toString() {
        return "Coste{" + "id=" + id + ", fecha=" + fecha + ", importe=" + importe + ", reporte=" + reporte + ", acomodador=" + acomodador + ", limpiador=" + limpiador + '}';
    }

    public String data() {
        return "" + getId() + "|"+ getIdAcomodador()+"|"+ getIdLimpieza()+"|"+ getIdInforme()+"|"+ getIdNomina()+"|"+ getFecha() + "|" + getImporte() + "|" + getReporte() + "|" + getAcomodador() + "|" + getLimpiador();
    }
}
