package modelos;

/**
 *
 * @author Mario
 * @version 1.0
 */
public class Coste {
    private String reportes;/*Modela el número de reportes. Valor positivo*/

    public Coste() {
    }
    
    public Coste(String reportes) {
        this.reportes = reportes;
    }
    
    public Coste (Coste c) {
        this.reportes = c.getReportes();
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
