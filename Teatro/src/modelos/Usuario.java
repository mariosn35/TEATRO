package modelos;

/**
 *
 * @author Mario
 * @version 1.0
 */
public class Usuario {
    private long identificador;/*Modela id. Valor positivo*/

    public Usuario() {
    }
    
    public Usuario(long identificador) {
       this.identificador = identificador;
    }
    
    public Usuario (Usuario u) {
       this.identificador = u.getIdentificador();
    }
    
    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "identificador=" + identificador + '}';
    }
    
}
