package modelos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mario
 * @version 1.0
 */
public class Usuario {

    protected long identificador;/*Modela id. Valor positivo*/
    private String nombre;/*Modela nombre. Contiene solo caracteres alfabéticos*/
    private String telefono;/*Modela id. Valor positivo*/
    private String NIF;/*Modela id. Valor positivo*/
    private String email;/*Modela id. Valor positivo. Contiene números, letras y caracteres especiales.*/
    private boolean registrado;
    public Usuario() {
    }

    public Usuario(String nombre, String telefono, String NIF, String email,boolean registrado) {

        this.nombre = nombre;
        this.telefono = telefono;
        this.NIF = NIF;
        this.email = email;
        this.registrado = registrado;
    }

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
    
       public static Usuario nuevoUsuario() {
         
       char s;
         
      Usuario u = new Usuario() ;
      Scanner in;
      String a;
      String b;
      String c;
      String d;
      do{
      in = new Scanner(System.in);
      System.out.println("Introduzca Nombre");
      a=in.nextLine();
      u.setNombre(a);
      System.out.println("Introduzca su telefono");
      b=in.nextLine();
      u.setTelefono(b);
      System.out.println("Introduzca su nif");
      c=in.nextLine();
      u.setNIF(c);
      System.out.println("Introduzca email");
      d=in.nextLine();
      u.setEmail(d);
      System.out.println("¿Los datos son correctos?"+u);
      
      System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
      s= in.next().charAt(0);
      } while  (s!='s'&& s!='S' );           

    
    return u;
    
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
    public void registrarusuario(Usuario a){
    
            a.setRegistrado(true);
            
    
    }
    public void comprarbono(Bono b){
            Bono aus=Bono.nuevoBono();
            b.setUsuario(this);
      
          
           
    
   
    }
    @Override
    public String toString() {
        return "Usuario{" + "identificador=" + identificador + ", nombre=" + nombre + ", telefono=" + telefono + ", NIF=" + NIF + ", email=" + email + '}';
    }

    public String data() {
        return "" + getIdentificador() + "|" + getNombre() + "|" + getTelefono() + "|" + getNIF() + "|" + getEmail();
    }

}
