package modelos;

/**
 *
 * @author Mario
 * @version 1.0
 */
public class Nomina {
    private String mes;/*Modela mes. Valor positivo*/
    private long identificador;/*Modela id. Valor positivo*/
    
    public Nomina() {
        
    }
    
    public Nomina(String mes,long identificador) {
         this.mes = mes;       
         this.identificador = identificador;
    }
    
    public Nomina (Nomina n) {
        this.mes = n.getMes();      
        this.identificador = n.getIdentificador();
    }
    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }
    
    @Override
    public String toString() {
        return "N\u00f3mina{" + "mes=" + mes + ", identificador=" + identificador + '}';
    }
    
    public String data() {
        return ""+getMes()+"|"+getIdentificador();
    }
}
