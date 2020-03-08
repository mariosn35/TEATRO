package modelos;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mario
 * @version 1.1
 */
public class Informe implements Serializable {

    protected long id;/*Modela id. Valor positivo*/
    private int mes;/*Modela el mes. Valor positivo*/
    private int anio;/*Modela el anio. Valor positivo*/
    private double balance;/*Modela balance. Valor positivo o valor negativo*/
    private Secretariado secretariado;
    private long idSecretariado;

    public Informe() {

    }

    public Informe(long id, int mes, int anio, double balance, Secretariado secretariado, long idSecretariado) {

        this.id = id;
        this.mes = mes;
        this.anio = anio;
        this.balance = balance;
        this.secretariado = secretariado;
        this.idSecretariado = idSecretariado;
    }

    public Informe(Informe i) {

        this.id = i.getId();
        this.mes = i.getMes();
        this.anio = i.getAnio();
        this.balance = i.getBalance();
        this.secretariado = i.getSecretariado();
        this.idSecretariado = i.getIdSecretariado();
    }

    
    public static Informe nuevoinforme() {
        char d='a';
        Scanner in;
        int mes;
        int año;

        double c;
        Informe i = new Informe();
        Secretariado s ;

        in = new Scanner(System.in);
        char z;
        
        do {
            do {
                System.out.println("Mes de creacion del Informe");

                mes = in.nextInt();

            } while (mes < 1 || mes > 12);
            System.out.println("Año de creacion del Informe");
            año = in.nextInt();

            System.out.println("Introduce el balance en euros");
            c = in.nextDouble();
            System.out.println("quieres asignar un secretario a esta este informe");
            z = in.next().charAt(0);
            if (z == 's' || z == 'S') {
            s = Secretariado.nuevoSecretariado();
            i.setSecretariado(s);}
            else {
                System.out.println("No has asiganado un secretario a esta este informe");}
            
      
       
       System.out.println("¿Los datos son correctos?"+i);
      
      System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
      d= in.next().charAt(0);
      }
            while (d != 's' && d != 'S');

            return i;

        }

    

    public Informe getInformeById(long Id) {
        Informe i = null;
        /* for(int i=0; i< Lista.size (); i++){
     s=(Beneficio) Lista[i];
     
        if( s.getId()== Id){
        }
        
     } 
         */
        return i;
    }

    public ArrayList<Informe> getAllInformes() {
        ArrayList<Informe> Informes = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           g= Grupo Lista[i];
       Informe.add(f);
       
         */
        return Informes;
    }

    
    public Secretariado getSecretariado() {
        return secretariado;
    }

    
    public void setSecretariado(Secretariado secretariado) {
        this.secretariado = secretariado;
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getIdSecretariado() {
        return idSecretariado;
    }

    public void setIdSecretariado(long idSecretariado) {
        this.idSecretariado = idSecretariado;
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
        return "Informe{" + "id=" + id + ", mes=" + mes + ", anio=" + anio + ", balance=" + balance + ", secretariado=" + secretariado + ", idSecretariado=" + idSecretariado + '}';
    }

  
    public String data() {
        return "" + getId() + "|" + getMes() + "|" + getAnio() + "|" + getBalance() + "|" + getSecretariado() + "|" + getIdSecretariado();
    }
}
