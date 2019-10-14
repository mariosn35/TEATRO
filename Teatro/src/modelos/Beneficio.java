package modelos;

/**
 *
 * @author Mario
 * @version 1.0
 */
public class Beneficio {
    private int entradasvendidas;/**Modela las entradas vendidas. Valor positivo.*/
    private int precioentrada;/*Modela el precio de cada entrada. Valor positivo.*/

    public Beneficio() {     
    }
    
    public Beneficio(int entradasvendidas,int precioentrada) {
        this.entradasvendidas = entradasvendidas;
        this.precioentrada = precioentrada;
    }
    
    public Beneficio (Beneficio b) {
        this.entradasvendidas = b.getEntradasvendidas();
        this.precioentrada = b.getPrecioentrada();
    }
    public int getEntradasvendidas() {
        return entradasvendidas;
    }

    public void setEntradasvendidas(int entradasvendidas) {
        this.entradasvendidas = entradasvendidas;
    }

    public int getPrecioentrada() {
        return precioentrada;
    }

    public void setPrecioentrada(int precioentrada) {
        this.precioentrada = precioentrada;
    }

    @Override
    public String toString() {
        return "Beneficio{" + "entradasvendidas=" + entradasvendidas + ", precioentrada=" + precioentrada + '}';
    }
    
    public String data() {return toString;
    }
}
