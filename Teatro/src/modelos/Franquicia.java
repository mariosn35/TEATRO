/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;
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

    public Franquicia(Date fecha_creacion, String ubicacion, boolean accesible, Grupo grupo, Informe informe, Direccion director) {

        this.fecha_creacion = fecha_creacion;
        this.ubicacion = ubicacion;
        this.accesible = accesible;
        this.grupo = grupo;
        this.informe = informe;
        this.director = director;
    }

    public static Franquicia nuevafranquicia() throws ParseException {
        char s;
        char z;
        Scanner in;
        Date a;
        String b;
        Boolean c;
        Grupo d = new Grupo();
        Informe e = new Informe();
        Direccion g = new Direccion();
        char respuesta;
        in = new Scanner(System.in);
        Franquicia f = new Franquicia();
        do {
            System.out.println("Introduzca la fecha de creacion");
            Date fe = Cajadeherramientas.readDate(in, "DD-MM-YYYY");
            f.setFecha_creacion(fe);

            System.out.println("Introduzca la ubicacion");
            b = in.nextLine();
            f.setUbicacion(b);

            do {
                System.out.println("¿Es accesible?");

                respuesta = in.next().charAt(0);

            } while (respuesta != 's' && respuesta != 'S' && respuesta != 'n' && respuesta != 'N');
            if (respuesta == 's' || respuesta == 'S') {
                c = true;
            } else {
                c = false;
            }
            f.setAccesible(c);
            System.out.println("Quiere asignar un grupo a esta franquicia");
            z = in.next().charAt(0);
            if (z == 's' || z == 'S') {
                d = Grupo.nuevogrupo();
                f.setGrupo(d);
            } else {
                System.out.println("No has asiganado un grupo a esta franquicia");
            }

            System.out.println("Quiere asignar un Informe a esta franquicia");
            z = in.next().charAt(0);
            if (z == 's' || z == 'S') {

                e = Informe.nuevoinforme();
                f.setInforme(e);
            } else {
                System.out.println("No has asiganado un informe a esta franquicia");
            }
            System.out.println("Quiere asignar un director a esta franquicia");
            if (z == 's' || z == 'S') {
                g = Direccion.nuevoDireccion();
            f.setDirector(g);}
            else {
                System.out.println("No has asiganado un director a esta franquicia");
            }
            System.out.println("¿Los datos son correctos?" + f);

            System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
            s = in.next().charAt(0);
        } while (s != 's' && s != 'S');

        return f;

    }

    public Franquicia getFranquiciaById(long Id) {
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
        this.director = a.getDirector();
        this.grupo = a.getGrupo();
        this.informe = a.getInforme();
        this.ubicacion = a.getUbicacion();
        this.accesible = a.isAccesible();
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public Informe getInforme() {
        return informe;
    }

    public Direccion getDirector() {
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

    public Date getFecha_creacion() {
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
        return "" + getId() + "|" + isAccesible() + "|" + getFecha_creacion() + "|" + getUbicacion() + "|" + getGrupo() + "|" + getInforme() + "|" + getDirector();
    }
}
