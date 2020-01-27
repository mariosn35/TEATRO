package modelos;

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    public static Beneficio nuevoBeneficio() throws ParseException, XxxException, XxxException.tipoinvalido, XxxException.Malmes, XxxException.Malannio {
        char s = 'a';
        char z = 'a';
        Scanner in;

        Double importe;
        String reporte;
        in = new Scanner(System.in);
        Beneficio beneficio = new Beneficio();
        Informe informe = new Informe();
        Taquilla t = new Taquilla();
        Bono bo = new Bono();
        do {
            //System.out.println("Introduzca la fecha de creacion");
            //Date fe = Cajadeherramientas.readDate(in, "DD-MM-YYYY");
            //b.setFecha(fe);
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
            beneficio.setFecha(fe);
        }
       
            System.out.println("Introduzca el importe en euros ");
            importe = in.nextDouble();
            beneficio.setImporte(importe);
            System.out.println("Introduzca el Reporte ");
            reporte = in.nextLine();
            beneficio.setReporte(reporte);
            System.out.println("Quiere introducir el informe  ");
            z = in.next().charAt(0);
            if (z == 's' || z == 'S') {
                informe = Informe.nuevoinforme();
                beneficio.setInforme(informe);
            } else {
                System.out.println("No has asiganado un informe a esta este beneficio");
            }
            System.out.println("Quiere introducir el taquillero ");
            z = in.next().charAt(0);
            if (z == 's' || z == 'S') {
                t = Taquilla.nuevoTaquilla();
                beneficio.setTaquilla(t);
            } else {
                System.out.println("No has asiganado un taquillero a esta este beneficio");
            }
             System.out.println("Quiere introducir el bono ");
             z = in.next().charAt(0);
            if (z == 's' || z == 'S') {
                bo = Bono.nuevoBono();
            beneficio.setBono(bo);
            } else {
                System.out.println("No has asiganado un bono a esta este beneficio");
            }

            System.out.println("¿Los datos son correctos?" + beneficio);

            System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
            s = in.next().charAt(0);
        } while (s != 's' && s != 'S');
        return beneficio;
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
        /* for(int informe=0; informe< Lista.size (); informe++){
     s=(Beneficio) Lista[informe];
     
        if( s.getId()== Id){
        }
        
     } 
         */
        return bf;
    }

    public ArrayList<Beneficio> getAllBeneficios() {
        ArrayList<Beneficio> Beneficios = new ArrayList();
        /*for (int informe=0; informe< Lista.size(); informe++)
           g= Grupo Lista[informe];
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
