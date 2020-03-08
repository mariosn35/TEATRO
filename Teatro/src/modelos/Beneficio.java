package modelos;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
/***
 * 
 */
    public Beneficio() {
    }
/***
 * 
 * @param id
 * @param idBono
 * @param idTaquilla
 * @param idInforme
 * @param fecha
 * @param importe
 * @param reporte
 * @param informe
 * @param bono
 * @param taquilla 
 */
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
/***
 * 
 * @param b 
 */
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
/***
 * Crea un objeto de tipo de beneficio y le al usuario que le asigne valores
 * @return devuelve un beneficio
 * @throws ParseException
 * @throws BonoException 
 */
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
    /***
     * Crea un beneficio
     * @return devuelve un objeto de beneficio
     * @throws ParseException 
     */
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
  /**
     * *
     * Función que exporta un coste a un fichero de texto
     *
     * @param ruta String con la ruta del fichero
     * @return true si se exportó con éxito; false en caso contrario
     * @exception IOException si hubo problema al exportar
     */
    public boolean exportarAFichero(String ruta) throws IOException {
        FileWriter flujoLectura;
        BufferedWriter flujoBuffer = null;
        try {

            //Abro stream, crea el fichero si no existe
            flujoLectura = new FileWriter(ruta);
            flujoBuffer = new BufferedWriter(flujoLectura);
            flujoBuffer.write(this.data());
            flujoBuffer.flush();

        } catch (IOException e) {
            System.out.println("Error E/S: " + e);
            return false;
        }
        return true;
    }

      /***
     * Exporta al fichero en forma de string binario un objeto mediante el metodo data
     * @param ruta String con la ruta del fichero
     * @throws IOException 
     */
      public void exportarABinario(String ruta) throws IOException{
     //Copiado de vindios.
     //Copiado de vindios.
      FileOutputStream flujoLectura;
      ObjectOutputStream Oos;
       try{
           
            //Abro stream, crea el fichero si no existe
            flujoLectura=new FileOutputStream(ruta, true);
            //Escribimos en el fichero un String y un caracter 97 (a)
            Oos = new ObjectOutputStream(flujoLectura);
            Oos.writeObject(this);
           
            Oos.flush();
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
