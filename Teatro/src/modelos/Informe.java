package modelos;

/**
 *
 * @author Mario
 * @version 1.0
 */
public class Informe {
    private long identificador;/*Modela id. Valor positivo*/
    private String mes;/*Modela el mes. Valor positivo*/
    private String año;/*Modela el año. Valor positivo*/
    private int balance;/*Modela balance. Valor positivo*/
    
    public Informe() {
    }
    
    public Informe(long identificador,String mes,String año,int balance) {
        this.identificador = identificador;
        this.mes = mes;
        this.año = año;
        this.balance = balance;
    }
    
    public Informe (Informe i) {
        this.identificador = i.getIdentificador();
        this.mes = i.getMes();
        this.año = i.getAño();
        this.balance = i.getBalance();
    }
    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Informe{" + "identificador=" + identificador + ", mes=" + mes + ", a\u00f1o=" + año + ", balance=" + balance + '}';
    }
       
}
