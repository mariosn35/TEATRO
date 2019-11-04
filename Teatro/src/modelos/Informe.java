package modelos;

/**
 *
 * @author Mario
 * @version 1.1
 */
public class Informe {
    protected long id;/*Modela id. Valor positivo*/
    private int mes;/*Modela el mes. Valor positivo*/
    private int anio;/*Modela el anio. Valor positivo*/
    private double balance;/*Modela balance. Valor positivo*/
    
    public Informe() {
    }
    
    public Informe(long id, int mes, int anio, double balance) {
        
        this.id = id;
        this.mes = mes;
        this.anio = anio;
        this.balance = balance;
    }
    
    public Informe (Informe i) {
        
        this.id = i.getId();
        this.mes = i.getMes();
        this.anio = i.getAnio();
        this.balance = i.getBalance();
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

    @Override
    public String toString() {
        return "Informe{" + "id=" + id + ", mes=" + mes + ", a\u00f1o=" + anio + ", balance=" + balance + '}';
    }
    
    public String data() {
        return ""+getId()+"|"+getMes()+"|"+getAnio()+"|"+getBalance();
    }
}
