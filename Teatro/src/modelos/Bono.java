package modelos;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import modelos.BonoException;
import static modelos.BonoException.validarAnnio;
import static modelos.BonoException.validarCategoria;
import static modelos.BonoException.validarMes;
import java.io.Serializable;

/**
 *
 * @author Mario
 * @version 1.1
 */
public class Bono implements Serializable {

    protected long id;/*Modela id. Valor positivo*/
    private long idUsuario;
    char tipo;/*c para completo p para parcial*/
    int mes;/*del uno al doce*/
    int annio;/*del 0 al annio actual*/

    private Usuario usuario;
    /***
     * 
     */
    public Bono() {
    }
/***
 * 
 * @param id
 * @param idUsuario
 * @param tipo
 * @param mes
 * @param annio
 * @param usuario
 * @throws BonoException 
 */
    public Bono(long id, long idUsuario, char tipo, int mes, int annio, Usuario usuario) throws BonoException {

        this.id = id;
        this.idUsuario = idUsuario;

         if (tipo != 'C' && tipo != 'P') {
            throw new BonoException("El tipo no es valido. C o P validos");
        }this.tipo = tipo;
        this.mes = mes;
         if (mes <  1 || mes >12) {
            throw new BonoException("El mes no es valido.De uno a doce ");
        }
        this.annio = annio;
        if (annio < 1980 || annio > 2021) {
            throw new BonoException("El año no es valido.De 1980 a 2021 ");
        }
        this.usuario = usuario;
    }
/***
 * 
 * @param b
 * @throws BonoException 
 */
    public Bono(Bono b) throws BonoException {

        this.id = b.getId();
        this.id = b.getIdUsuario();
        this.mes = b.getMes();
        if (mes < 1 || mes >12) {
            throw new BonoException("El mes no es valido.De uno a doce ");
        }
        this.tipo = b.getTipo();
        if (tipo != 'C' && tipo != 'P') {
            throw new BonoException("El tipo no es valido. C o P validos");
        }
        this.annio = b.getAño();
         if (annio < 1980 || annio > 2021) {
            throw new BonoException("El año no es valido.De 1980 a 2021 ");
        }
        this.usuario = b.getUsuario();
    }

    public int getAño() {
        return annio;
    }

    public void setAño(int año) throws BonoException {
        this.annio = año;
        if (annio < 1980 || annio > 2021) {
            throw new BonoException("El año no es valido.De 1980 a 2021 ");
        }
    }

    public long getId() {
        return id;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public void setId(long id) {
        this.id = id;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) throws BonoException {

        this.tipo = tipo;
        if (tipo != 'C' && tipo != 'P') {
            throw new BonoException("El tipo no es valido. C o P validos");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws BonoException {

        this.mes = mes;
       if (mes < 1 || mes >12) {
            throw new BonoException("El mes no es valido.De uno a doce ");
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
/***
 * Crea un objeto de tipo bono y le pide al usuario que asigne valores
 * @return devuelve un objeto tipo bono
 * @throws BonoException 
 */
    public static Bono nuevoBono() throws BonoException {
        char s = 's';
        char z = 'z';
        Bono bono = new Bono();
        char categoria;
        int mes;
        int annio;
        Usuario usuario = new Usuario();
        Scanner in;
        in = new Scanner(System.in);
        do {
            System.out.println("Introduzca el tipo de bono puede ser c o p");
            categoria = in.next().charAt(0);
            
                bono.setTipo(categoria);
                 if (categoria != 'C' && categoria != 'P') {
            throw new BonoException("El tipo no es valido. C o P validos");
        }

            System.out.println("Introduzca el mes del 1 al 12");
            mes = in.nextInt();
       
                bono.setMes(mes);
            if (mes < 1 || mes > 12) {
             throw new BonoException("El mes no es valido.De uno a doce ");
        }

            System.out.println("Introduzca el año del 1980 a 2021");
            annio = in.nextInt();
            
                bono.setAño(annio);
             if (annio < 1980 || annio > 2021) {
            throw new BonoException("El año no es valido.De 1980 a 2021 ");
        }
            System.out.println("Quiere asignar el usuario propietario del bono");
            z = in.next().charAt(0);
            if (z == 's' || z == 'S') {

                usuario = Usuario.nuevoUsuario();

            } else {
                System.out.println("No a asignado un usuario a este bono");
            }
            bono.setUsuario(usuario);

            System.out.println("¿Los datos son correctos?" + bono);

            System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
            s = in.next().charAt(0);
        } while (s != 's' && s != 'S');

        return bono;
    }
/***
 * crea un objeto de tipo bono y le pide al usuario que asigne valores
 * @return un objeto de tipo bono
 */
    public static Bono nuevoBonoUsuario() {
        char s = 's';
        char z = 'z';
        Bono bono = new Bono();
        char categoria;
        int mes;
        int annio;
        Usuario usuario = new Usuario();
        Scanner in;
        in = new Scanner(System.in);
        do {
           
            System.out.println("Introduzca el tipo de bono puede ser c o p");
            categoria = in.next().charAt(0);
            try {
                if (validarCategoria(categoria)){
                    bono.setTipo(categoria);
                }
            } catch (BonoException ex) {
               System.out.println("Los valores de la categoria son incorrectos");
            }

            System.out.println("Introduzca el mes en que es valido el bono");
            mes = in.nextInt();
       try {
                if (validarMes(mes)){
                    bono.setMes(mes);
                }
            } catch (BonoException ex) {
               System.out.println("Los valores del mes son incorrectos");
            }

                
            

            System.out.println("Introduzca el año en que es valido el bono");
            annio = in.nextInt();
            
                
                 try {
                if (validarAnnio(annio)){
                    bono.setAño(annio);
                }
            } catch (BonoException ex) {
               System.out.println("Los valores del año son incorrectos");
            }
            
            System.out.println("¿Los datos son correctos?" + bono);
 
            System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
            s = in.next().charAt(0);
        } while (s != 's' && s != 'S');

        return bono;
    }
    
    public Bono getBonoById(long Id) {
        Bono b = null;
        /* for(int i=0; i< Lista.size (); i++){
     s=(Bono) Lista[i];
     
        if( s.getId()== Id){
        }
        
     } 
         */
        return b;
    }

    public ArrayList<Bono> getAllBonos() {
        ArrayList<Bono> Bonos = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           g= Grupo Lista[i];
       Bono.add(f);
       
         */
        return Bonos;
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
        return "Bono{" + "id=" + id + ", idUsuario=" + idUsuario + ", tipo=" + tipo + ", mes=" + mes + ", annio=" + annio + ", usuario=" + usuario + '}';
    }

    public String data() {
        return "" + getId() + "|" + getIdUsuario() + "|" + getMes() + "|" + getTipo() + "|" + getUsuario();
    }

}
