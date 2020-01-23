package modelos;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author roter
 * @version 1.0
 */
public class EOficina extends Empleado {

    private int antiguedad;

    /**
     * Modela a los empleados de oficina cuantos años llevan trabajando en el
     * teatro y puede tomar valores positivos y no puede ser negativo
     */
    public EOficina() {
        super();
    }

    public EOficina(long id, String nombre, String apellidos, String nif, String direccion, String telefono, int antiguedad, int horastrabajadas, double salarioporhora, double salariomensual) {
        super(id, nombre, apellidos, nif, direccion, telefono, horastrabajadas, salarioporhora, salariomensual);
        this.antiguedad = antiguedad;

    }

    public EOficina(Empleado e) {
        super(e);
    }

    public EOficina(Empleado e, int anios) {
        super(e);
        this.antiguedad = anios;
    }

    public EOficina(EOficina o) {
        super(o);
        this.antiguedad = o.getAntiguedad();

    }

    public static EOficina nuevoEOficina() {
        char d;
        Scanner in;
        int a;
        EOficina o ;
        in = new Scanner(System.in);

        do {
            o = new EOficina(Empleado.nuevoEmpleado());
            
            System.out.println("Mete tus años de antiguedad");
            a = in.nextInt();
            o.setAntiguedad(a);
            System.out.println("¿Los datos son correctos?" + (EOficina) o);
            System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
            d = in.next().charAt(0);
        } while (d != 's' && d != 'S');

        return o;

    }

    public EOficina getEOficinaById(long Id) {
        EOficina e = null;
        /* for(int i=0; i< Lista.size (); i++){
     e=(Empleado) Lista[i];
     
        if( e.getId()== Id){
        }
        
     } 
         */
        return e;
    }

    public ArrayList<EOficina> getAllEOficinas() {
        ArrayList<EOficina> EOficinas = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           e= Empleado Lista[i];
       Empleados.add(f);
       
         */
        return EOficinas;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return super.toString() + "EOficina{" + "antiguedad=" + antiguedad + '}';
    }

    @Override
    public String data() {
        return super.data() + "" + getAntiguedad();
    }
}
