/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario
 */
public class Nómina {
    private String mes;
    private long identificador;
    
    public Nómina() {
        
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
}
