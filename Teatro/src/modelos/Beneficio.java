package modelos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
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
public class Beneficio implements Serializable  {

    protected long id;/*Modela el identificador propio*/
    private long idBono;
    private long idTaquilla;
    private long idInforme;
    private Date fecha;/*Modela la fecha de adquisicion del beneficio*/
    private double importe;/*Modela importe en euros.*/
    private String reporte;/*Modela reportes.*/
    private Informe informe;
    private Bono bono;
    private Taquilla taquilla;

    public Beneficio() {
    }

    public Beneficio(long id,long idBono,long idTaquilla,long idInforme ,Date fecha, double importe, String reporte, Informe informe, Bono bono, Taquilla taquilla) {
        this.id = id;
        this.idBono = idBono;
        this.idTaquilla=idTaquilla;
        this.idInforme=idInforme;
        this.fecha = fecha;
        this.importe = importe;
        this.reporte = reporte;
        this.informe = informe;
        this.bono = bono;
        this.taquilla = taquilla;
    }

    public Beneficio(Beneficio b) {
        this.id = b.getId();
        this.idBono= b.getIdBono();
        this.idTaquilla=b.getIdTaquilla();
        this.idInforme=b.getIdInforme();
        this.fecha = b.getFecha();
        this.importe = b.getImporte();
        this.reporte = b.getReporte();
        this.informe = b.getInforme();
        this.bono = b.getBono();
        this.taquilla = b.getTaquilla();
    }

    public static Beneficio nuevoBeneficio() throws ParseException, BonoException {
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
    public Beneficio nuevoBeneficioBono() throws ParseException {
        char s = 'a';
        char z = 'a';
        Scanner in;

        Double importe;
        String reporte;
        in = new Scanner(System.in);
        Beneficio beneficio = new Beneficio();
        Informe informe ;
        Taquilla t ;
        
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
            
        java.sql.Date fe = new java.sql.Date(lnMilisegundos);
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

    public long getIdBono() {
        return idBono;
    }

    public void setIdBono(long idBono) {
        this.idBono = idBono;
    }

    public long getIdTaquilla() {
        return idTaquilla;
    }

    public void setIdTaquilla(long idTaquilla) {
        this.idTaquilla = idTaquilla;
    }

    public long getIdInforme() {
        return idInforme;
    }

    public void setIdInforme(long idInforme) {
        this.idInforme = idInforme;
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
    
     public void exportarAFichero(String ruta) throws IOException{
     
     FileWriter flujoLectura;
     BufferedWriter flujoBuffer = null;
       try{
           
            //Abro stream, crea el fichero si no existe
            flujoLectura=new FileWriter(ruta);
            //Escribimos en el fichero un String y un caracter 97 (a)
            flujoBuffer=new BufferedWriter(flujoLectura);
            flujoBuffer.write(this.data());
           
            flujoBuffer.flush();
                //Abro el stream, el fichero debe existir
            
            //Leemos el fichero y lo mostramos por pantalla
            
          
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
    

    
//String[]Cadenas=String split ("\\|")
    
   
    }
    @Override
    public String toString() {
        return "Beneficio{" + "id=" + id + ", idBono=" + idBono + ", idTaquilla=" + idTaquilla + ", idInforme=" + idInforme + ", fecha=" + fecha + ", importe=" + importe + ", reporte=" + reporte + ", informe=" + informe + ", bono=" + bono + ", taquilla=" + taquilla + '}';
    }

   

    

    public String data() {
        return "" + getId() + "|" +getIdBono() +"|"+getIdTaquilla() +"|" +getIdInforme() +"|"+getFecha() + "|" + getImporte() + "|" + getReporte();
    }
}
