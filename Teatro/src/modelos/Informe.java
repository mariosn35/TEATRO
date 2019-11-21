package modelos;

import java.util.Scanner;

/**
 *
 * @author Mario 
 * @version 1.1
 */
public class Informe extends Nomina{
    protected long id;/*Modela id. Valor positivo*/
    private int mes;/*Modela el mes. Valor positivo*/
    private int anio;/*Modela el anio. Valor positivo*/
    private double balance;/*Modela balance. Valor positivo o valor negativo*/
    private Secretariado secretariado;
    
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
      public Informe nuevoinforme() {
        
        Scanner in;
        int a;
        int b;
        
        double c;
        Secretariado s=new Secretariado();
        
    in = new Scanner(System.in);
    Informe i = null;
    do {
    System.out.println("Mes de creacion del grupo");
    
    a=in.nextInt();
    
    }while (a<1 || a>12);
    System.out.println("Año de creacion del grupo");
    b=in.nextInt();
    
    System.out.println("Introduce el balance en euros");
    c=in.nextDouble();
    System.out.println("Grupo:");
    
    
    
      
    
    return i;
    
    }

    public Secretariado getSecretariado() {
        return secretariado;
    }

    public void setSecretariado(Secretariado secretariado) {
        this.secretariado = secretariado;
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
        return "Informe{" + "id=" + id + ", mes=" + mes + ", anio=" + anio + ", balance=" + balance + ", secretariado=" + secretariado + '}';
    }

   
    
    public String data() {
        return ""+getId()+"|"+getMes()+"|"+getAnio()+"|"+getBalance()+"|"+getSecretariado();
    }
}
