package modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario
 */
public class Coste {
    String reportes;

    public Coste() {
        
    }

    public String getReportes() {
        return reportes;
    }

    public void setReportes(String reportes) {
        this.reportes = reportes;
    }

    @Override
    public String toString() {
        return "Coste{" + "reportes=" + reportes + '}';
    }
           
}
