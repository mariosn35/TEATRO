package modelos;

/**
 *
 * @author Mario
 * @version 1.0
 */
public class Bono {
    private long identificador;/*Modela id. Valor positivo*/

    public Bono() {
    }
    
    public Bono(long identificador) {
        this.identificador = identificador;
    }
    
    public Bono (Bono b) {
        this.identificador = b.getIdentificador();
    }       
    
    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }
    
    @Override
    public String toString() {
        return "Bono{" + "identificador=" + identificador + '}';
    }
    
}
