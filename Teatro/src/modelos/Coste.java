package modelos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Mario
 * @version 1.1
 */
public class Coste implements Serializable {


    protected long id;//Modela el número de reportes. Valor positivo
    private long idAcomodador;
    private long idLimpieza;
    private long idInforme;
    private long idNomina;
    private Date fecha;//Modela fecha. Valor positivo*
    private double importe; //Modela importe en euros. Valor positivo
    private String reporte;//Modela reporte
    private Acomodador acomodador = null;
    private Limpieza limpiador = null;

    
    public static void LeerFichero (String archivo){
    FileReader fr = null;
    BufferedReader br = null;
     try {
        
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         String linea;
         while((linea=br.readLine())!=null)
             
            System.out.println(linea);
         
      }
      catch(IOException e1){
         e1.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (IOException e2){ 
            e2.printStackTrace();
         }
      }
}
    
    public Coste() {
    }

    public Coste(long id, long idAcomodador, long idLimpieza, long idInforme, long idNomina, Date fecha, double importe, String reporte) {

        try {
            this.id = id;
            this.idAcomodador = idAcomodador;
            this.idLimpieza = idLimpieza;
            this.idInforme = idInforme;
            this.fecha = fecha;
            if (CosteException.validarImporte(importe)) {
                this.importe = importe;
            }
            if (CosteException.validarReporte(reporte)) {
                this.reporte = reporte;
            }
            this.acomodador = acomodador;
            this.limpiador = limpiador;
        } catch (CosteException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Coste(Coste c) {

        try {
            this.id = c.getId();

            this.idAcomodador = c.getIdAcomodador();
            this.idLimpieza = c.getIdLimpieza();
            this.idInforme = c.getIdInforme();
            this.fecha = c.getFecha();
            if (CosteException.validarImporte(c.getImporte())) {
                this.importe = c.getImporte();
            }
            if (CosteException.validarReporte(c.getReporte())) {
                this.reporte = c.getReporte();
            }
            this.acomodador = c.getAcomodador();
            this.limpiador = c.getLimpiador();
        } catch (CosteException ex) {
            System.out.println(ex.getMessage());
        }
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
        try {
            if (CosteException.validarImporte(importe)) {
                this.importe = importe;
            }
        } catch (CosteException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        try {
            if (CosteException.validarReporte(reporte)) {
                this.reporte = reporte;
            }
        } catch (CosteException ex) {
            System.out.println(ex.getMessage());
        }
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

    public static Coste nuevoCoste() {
        char respuesta = '-';
        char resp = '-';
        Coste coste = new Coste();
        Scanner in;
        double importe;
        String reporte;
        in = new Scanner(System.in);
        Acomodador acomodador = null;
        Limpieza limpieza = null;

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
        OUTER:
        do {
            try {
                in = new Scanner(System.in);
                coste.setId(100);
                coste.setFecha(Calendar.getInstance().getTime());

                System.out.println("Introduzca el importe en euros");
                String importeIntroducido = in.nextLine();
                CosteException.validarImporte(importeIntroducido);
                importe = Double.valueOf(importeIntroducido);
                coste.setImporte(importe);
                System.out.println("Introduzca el Reporte");
                reporte = in.nextLine();
                CosteException.validarReporte(reporte);
                coste.setReporte(reporte);

                System.out.println("¿Los datos son correctos?" + coste);
                System.out.println("Si lo son pulse S para continuar de lo contrario pulse N");
                respuesta = in.next().charAt(0);
            } catch (CosteException ex) {
                System.out.println(ex.getMessage());
                in = new Scanner(System.in);
                do {
                    System.out.println("¿Quiere añadir un nuevo coste? Si es asi pulse S, de lo contrario pulse N");
                    resp = in.next().charAt(0);
                    if (resp == 's' || resp == 'S') {
                        continue;
                    }
                    if (resp == 'n' || resp == 'N') {
                        break OUTER;
                    } else {
                        System.out.println("Respuesta no valida");
                    }
                } while (resp != 's' && resp != 'S' && resp != 'n' && resp != 'N');

            }

        } while (respuesta != 's' && respuesta != 'S');

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
        return "Coste{" + "id=" + id + ", idAcomodador=" + idAcomodador + ", idLimpieza=" + idLimpieza + ", idInforme=" + idInforme + ", idNomina=" + idNomina + ", fecha=" + fecha + ", importe=" + importe + ", reporte=" + reporte + ", acomodador=" + acomodador + ", limpiador=" + limpiador + '}';
    }

    public String data() {
        return "" + getId() + "|" + getIdAcomodador() + "|" + getIdLimpieza() + "|" + getIdInforme() + "|" + getIdNomina() + "|" + getFecha() + "|" + getImporte() + "|" + getReporte() + "|" + getAcomodador() + "|" + getLimpiador();
    }
}
