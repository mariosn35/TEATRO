package modelos;

import java.util.ArrayList;

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

    public Usuario() {
    }

    public Usuario(String nombre, String telefono, String NIF, String email) {

        this.nombre = nombre;
        this.telefono = telefono;
        this.NIF = NIF;
        this.email = email;
    }

    public Usuario(Usuario u) {

        this.nombre = u.getNombre();
        this.telefono = u.getTelefono();
        this.NIF = u.getNIF();
        this.email = u.getEmail();
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

    @Override
    public String toString() {
        return "Usuario{" + "identificador=" + identificador + ", nombre=" + nombre + ", telefono=" + telefono + ", NIF=" + NIF + ", email=" + email + '}';
    }

    public String data() {
        return "" + getIdentificador() + "|" + getNombre() + "|" + getTelefono() + "|" + getNIF() + "|" + getEmail();
    }

}
