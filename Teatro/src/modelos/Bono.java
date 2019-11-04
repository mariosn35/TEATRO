package modelos;

/**
 *
 * @author Mario
 * @version 1.1
 */
public class Bono {
    protected long id;/*Modela id. Valor positivo*/
    char tipo;
    int mes;
    
    public Bono() {
    }

    public Bono(long id, char tipo, int mes) {
        this.id = id;
        this.tipo = tipo;
        this.mes = mes;
    }
    
    public Bono(Bono b){
       
        this.id = b.getId();
        this.mes = b.getMes();
        this.tipo= b.getTipo();
   }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        return "Bono{" + "id=" + id + ", tipo=" + tipo + ", mes=" + mes + '}';
    }
 
    
    
    public String data() {
        return ""+getId()+"|"+getMes()+"|"+getTipo();
    }    
    
}
