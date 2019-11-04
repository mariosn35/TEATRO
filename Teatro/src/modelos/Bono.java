package modelos;

/**
 *
 * @author Mario
 * @version 1.0
 */
public class Bono {
    protected long identificador;/*Modela id. Valor positivo*/
    char tipo;
    int mes;
    public Bono() {
    }

    public Bono(char tipo, int mes) {
        this.tipo = tipo;
        this.mes = mes;
    }
   public Bono(Bono b){
   this.mes = b.getMes();
   this.tipo= b.getTipo();
   }
    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Bono{" + "identificador=" + identificador + ", tipo=" + tipo + ", mes=" + mes + '}';
    }
 
    
    
    public String data() {
        return ""+getIdentificador()+"|"+getMes()+"|"+getTipo();
    }    
    
}
