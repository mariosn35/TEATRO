/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Andres version 1.0
 */
public class Franquicia {

    protected long id;
    //Modela el numero identificador propio de cada franquicia
    private String fecha_creacion;
    //Modela la fecha en la que fueron creadas las franquicias 
    private String ubicacion;
    //Modela la ubicacion en la que se va a representar
    private boolean accesible;
    //Modela si tiene o no acceso a minusvalidos
    private Grupo grupo;
    private Informe informe;
    private Direccion director;
    
    public Franquicia( String fecha_creacion, String ubicacion, boolean accesible, Grupo grupo,Informe informe,Direccion director) {
        
        this.fecha_creacion = fecha_creacion;
        this.ubicacion = ubicacion;
        this.accesible = accesible;
        this.grupo = grupo;
        this.informe= informe;
        this.director = director;
    }

    public Franquicia() {
    }

    public Franquicia(Franquicia a) {
        this.fecha_creacion = a.getFecha_creacion();
        
        this.ubicacion = a.getUbicacion();
        this.accesible = a.isAccesible();
    }
    public Grupo getgrupo(){
    return grupo;
    }
    public Informe getinforme(){
    return informe;
     }
     public Direccion getdirector(){
    return director;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public void setInforme(Informe informe) {
        this.informe = informe;
    }

    public void setDirector(Direccion director) {
        this.director = director;
    }
     
    public long getId() {
        return id;
    }

   

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isAccesible() {
        return accesible;
    }

    public void setAccesible(boolean accesible) {
        this.accesible = accesible;
    }

    @Override
    public String toString() {
        return "Franquicia{" + "id=" + id + ", fecha_creacion=" + fecha_creacion + ", ubicacion=" + ubicacion + ", accesible=" + accesible + ", grupo=" + grupo + ", informe=" + informe + ", director=" + director + '}';
    }

   

    public String data() {
        return "" + getId() + "|" + isAccesible() + "|" + getFecha_creacion() + "|" + getUbicacion();
    }
}
