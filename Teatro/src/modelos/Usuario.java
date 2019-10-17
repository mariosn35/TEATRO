package modelos;

/**
 *
 * @author Mario
 * @version 1.0
 */
public class Usuario {
    private long identificador;/*Modela id. Valor positivo*/
    private String nombre;/*Modela nombre. Contiene solo caracteres alfabéticos*/
    private String telefono;/*Modela id. Valor positivo*/
    private String NIF;/*Modela id. Valor positivo*/
    private String email;/*Modela id. Valor positivo. Contiene números, letras y caracteres especiales.*/

    public Usuario() {
    }
    
    public Usuario(long identificador,String nombre, String telefono, String NIF, String email) {
       this.identificador = identificador;
       this.nombre = nombre;
       this.telefono = telefono;
       this.NIF = NIF;
       this.email = email;
    }
    
    public Usuario (Usuario u) {
       this.identificador = u.getIdentificador();
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

    @Override
    public String toString() {
        return "Usuario{" + "identificador=" + identificador + ", nombre=" + nombre + ", telefono=" + telefono + ", NIF=" + NIF + ", email=" + email + '}';
    }
    
    public String data() {
        return ""+getIdentificador()+"|"+getNombre()+"|"+getTelefono()+"|"+getNIF()+"|"+getEmail();
    }
    
}
