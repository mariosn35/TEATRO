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
    private Limpiador limpiador = null;
/***
 * despedaza las lineas de texto del archivo de texto y luego las pasa como parametros y crea un objeto
 * @param archivo
 * @return devuelve un array de costes
 */
    public static ArrayList<Coste> LeerFichero(String archivo) {
        FileReader entrada = null;
        BufferedReader br = null;
        ArrayList<Coste> ret = new ArrayList<Coste>();

        try {
            entrada = new FileReader(archivo);
            br = new BufferedReader(entrada);
        
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("\\|");
                long idCoste = Integer.valueOf(partes[0]);
                long idAcomodador = Integer.valueOf(partes[1]);
                long idLimpieza = Integer.valueOf(partes[2]);
                long idInforme = Integer.valueOf(partes[3]);
              //  Date fecha = Date.valueOf(partes[4]);
              Date fecha = null;
                long idNomina = Integer.valueOf(partes[5]);
                double importe = Integer.valueOf(partes[6]);
                String reporte = String.valueOf(partes[7]);


                Coste c = new Coste(idCoste, idAcomodador, idLimpieza, idInforme, idNomina, fecha, importe, reporte); 
                ret.add(c);
            }

        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return ret;
    }

    public Coste() {
    }
/***
 * 
 * @param id
 * @param idAcomodador
 * @param idLimpieza
 * @param idInforme
 * @param idNomina
 * @param fecha
 * @param importe
 * @param reporte 
 */
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
/***
 * 
 * @param c 
 */
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

    public Limpiador getLimpiador() {
        return limpiador;
    }

    public void setLimpiador(Limpiador limpiador) {
        this.limpiador = limpiador;
    }
/***
 * crea un objeto de tipo coste y le pide al usuario que le meta los datos
 * @return un objeto de tipo coste
 */
    public static Coste nuevoCoste() {
        char respuesta = '-';
        char resp = '-';
        Coste coste = null;
        Scanner in;
        double importe;
        String reporte;
        in = new Scanner(System.in);
        Acomodador acomodador = null;
        Limpiador limpieza = null;

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
                coste = new Coste();
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
        return "Coste{" + "id=" + id + ", idAcomodador=" + idAcomodador + ", idLimpieza=" + idLimpieza + ", idInforme=" + idInforme + ", idNomina=" + idNomina + ", fecha=" + fecha + ", importe=" + importe + ", reporte=" + reporte + ", acomodador=" + acomodador + ", limpiador=" + limpiador + '}';
    }

    public String data() {
        return "" + getId() + "|" + getIdAcomodador() + "|" + getIdLimpieza() + "|" + getIdInforme() + "|" + getIdNomina() + "|" + getFecha() + "|" + getImporte() + "|" + getReporte();
    }
}
