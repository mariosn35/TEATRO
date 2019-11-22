package modelos;

import java.util.ArrayList;

/**
 *
 * @author Mario
 * @version 1.1
 */
public class Bono {

    protected long id;/*Modela id. Valor positivo*/
    char tipo;
    int mes;
    private Usuario usuario;

    public Bono() {
    }

    public Bono(long id, char tipo, int mes, Usuario usuario) {
        this.id = id;
        this.tipo = tipo;
        this.mes = mes;
        this.usuario = usuario;
    }

    public Bono(Bono b) {

        this.id = b.getId();
        this.mes = b.getMes();
        this.tipo = b.getTipo();
        this.usuario = b.getUsuario();
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Bono getBonoById(long Id) {
        Bono b = null;
        /* for(int i=0; i< Lista.size (); i++){
     s=(Bono) Lista[i];
     
        if( s.getId()== Id){
        }
        
     } 
         */
        return b;
    }

    public ArrayList<Bono> getAllBonos() {
        ArrayList<Bono> Bonos = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           g= Grupo Lista[i];
       Bono.add(f);
       
         */
        return Bonos;
    }

    @Override
    public String toString() {
        return "Bono{" + "id=" + id + ", tipo=" + tipo + ", mes=" + mes + ", usuario=" + usuario + '}';
    }

    public String data() {
        return "" + getId() + "|" + getMes() + "|" + getTipo() + "|" + getUsuario();
    }

}
