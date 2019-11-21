/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import java.sql.Date;
import java.text.ParseException;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author Andres version 1.0
 */
public class Franquicia {

    protected long id;
    //Modela el numero identificador propio de cada franquicia
    private Date fecha_creacion;
    //Modela la fecha en la que fueron creadas las franquicias 
    private String ubicacion;
    //Modela la ubicacion en la que se va a representar
    private boolean accesible;
    //Modela si tiene o no acceso a minusvalidos
    private Grupo grupo; //
    private Informe informe;
    private Direccion director;
    
    public Franquicia( Date fecha_creacion, String ubicacion, boolean accesible, Grupo grupo,Informe informe,Direccion director) {
        
        this.fecha_creacion = fecha_creacion;
        this.ubicacion = ubicacion;
        this.accesible = accesible;
        this.grupo = grupo;
        this.informe= informe;
        this.director = director;
    }
    public Franquicia nuevafranquicia() throws ParseException{
        
        Scanner in;
        Date a;
        String b;
        Boolean c;
        Grupo d;
        Informe e;
        Direccion g;
        char respuesta ;
    in = new Scanner(System.in);
    Franquicia f = null;
    System.out.println("Introduzca la fecha de creacion");
    Date fe=Cajadeherramientas.readDate(in,"DD-MM-YYYY");
    f.setFecha_creacion(fe);
    
    System.out.println("Introduzca la ubicacion");
    b=in.nextLine();
    f.setUbicacion(b);
    System.out.println("¿Es accesible para minusvalidos?");
    do {
    System.out.println("¿Es accesible?");
    
      respuesta = in.next().charAt(0); 
    
    
    } while (respuesta!='s'&& respuesta!='S' && respuesta!='n'&& respuesta!='N' );
    if  (respuesta=='s' || respuesta=='S') c=true; 
    else c=false;
    f.setAccesible(c);
    System.out.println("Grupo:");
    System.out.println("Informe:");
    System.out.println("Director:");
    return f;
    
    }
    public Franquicia getFranquiciaById (long Id) {
     Franquicia f = null;
    /* for(int i=0; i< Lista.size (); i++){
     f=(Franquicia) Lista[i];
     
        if( f.getId()== Id){
        }
        
     } 
     */
    return f;
    }
    
    public ArrayList<Franquicia> getAllFranquicias() {
       ArrayList<Franquicia> Franquicias = new ArrayList();
       /*for (int i=0; i< Lista.size(); i++)
           f= Franquicia Lista[i];
        Franquicias.add(f);
       
       */
        return Franquicias;
    }
    public Franquicia() {
    }

    public Franquicia(Franquicia a) {
        this.fecha_creacion = a.getFecha_creacion();
        this.director = a.getdirector();
        this.grupo = a.getgrupo();
        this.informe = a.getinforme();
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

   

    public  Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
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
