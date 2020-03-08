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
 * @version 1.0
 */
public class Usuario implements Serializable {

    protected long identificador;/*Modela id. Valor positivo*/

    private String nombre;/*Modela nombre. Contiene solo caracteres alfabéticos*/

    private String telefono;/*Modela id. Valor positivo*/

    private String NIF;/*Modela id. Valor positivo*/

    private String email;/*Modela id. Valor positivo. Contiene números, letras y caracteres especiales.*/

    private boolean registrado;

    public Usuario() {
    }
    /**
     * Constructor de argumentos.
     * @param nombre
     * @param telefono
     * @param NIF
     * @param email
     * @param registrado Un boolean te dice si esta registrado o no.
     */
    public Usuario(String nombre, String telefono, String NIF, String email, boolean registrado) {

        this.nombre = nombre;
        this.telefono = telefono;
        this.NIF = NIF;
        this.email = email;
        this.registrado = registrado;
    }
    /**
     * Constructor de copia.
     * @param u 
     */
    public Usuario(Usuario u) {

        this.nombre = u.getNombre();
        this.telefono = u.getTelefono();
        this.NIF = u.getNIF();
        this.email = u.getEmail();
        this.registrado = u.isRegistrado();
    }

    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isRegistrado() {
        return registrado;
    }

    public void setRegistrado(boolean registrado) {
        this.registrado = registrado;
    }

    /**
     * *
     * Este metodo crea un nuevo usuario predeterminado con los datos que se
     * vayan introduciendo por teclado en los campos requeridos.
     *
     * @return Devuelve un nuevo usuario ya creado con los datos introducidos.
     */
    public static Usuario nuevoUsuario() {

        char s = 's';

        Usuario usuario = new Usuario();
        Scanner in;
        String nombre;
        String telefono;
        String nif;
        String email;
        do {
            in = new Scanner(System.in);
            System.out.println("Introduzca Nombre");
            nombre = in.nextLine();
            usuario.setNombre(nombre);
            System.out.println("Introduzca su telefono");
            telefono = in.nextLine();
            usuario.setTelefono(telefono);
            System.out.println("Introduzca su nif");
            nif = in.nextLine();
            usuario.setNIF(nif);
            System.out.println("Introduzca email");
            email = in.nextLine();
            usuario.setEmail(email);
            System.out.println("¿Los datos son correctos?" + usuario);

            System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
            s = in.next().charAt(0);
        } while (s != 's' && s != 'S');

        return usuario;

    }

    public Usuario getUsuarioById(long id) {

        Usuario u = null;
        /* for(int i=0; i< Lista.size (); i++){
         n=(Usuario) Lista[i];
     
         if( f.getId()== Id){
         }
        
         } 
         */
        return u;
    }

    public ArrayList<Usuario> getAllUsuarios() {
        ArrayList<Usuario> Usuario = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
         g= Grupo Lista[i];
         Usuario.add(f);
       
         */
        return Usuario;
    }

    /**
     * *
     * Este metodo registra en el sistema el usuario que se este usando en caso
     * de que el usuario indique que quiere registrarse.
     */
    public void registrarusuario() {
        char z = 'z';
        Scanner in = new Scanner(System.in);
        System.out.println("Quiere registrarse s para si n para no");
        z = in.next().charAt(0);
        if (z == 's' || z == 'S') {

            this.setRegistrado(true);
        } else if (z == 's' || z == 'S') {
            System.out.println("No se ha registrado");

        }

    }

    /**
     * *
     * Este metodo 
     *
     * @return
     */
    public Bono comprarbono() {
        Bono b = new Bono();
        int a;
        Scanner in = new Scanner(System.in);
        if (this.isRegistrado() == true) {

            System.out.println("Pulse 1 para comprar bono");
            System.out.println("Pulse 2 para salir ");
            a = in.nextInt();
            switch (a) {
                case 1:
                    b = Bono.nuevoBonoUsuario();
                    Beneficio beneficio = new Beneficio();
                    beneficio.setBono(b);

                    b.setUsuario(this);
                case 2:
                    break;

            }

        }
        return b;
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
        } catch (IOException e) {
            System.out.println("Error E/S: " + e);
        }

//String[]Cadenas=String split ("\\|")
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "identificador=" + identificador + ", nombre=" + nombre + ", telefono=" + telefono + ", NIF=" + NIF + ", email=" + email + '}';
    }

    public String data() {
        return "" + getIdentificador() + "|" + getNombre() + "|" + getTelefono() + "|" + getNIF() + "|" + getEmail();
    }

}
