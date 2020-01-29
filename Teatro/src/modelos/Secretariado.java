package modelos;

import java.text.ParseException;
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
public class Secretariado extends EOficina {

    public Secretariado() {
        super();

    }

    public Secretariado(long id, String nombre, String apellidos, String nif, String direccion, String telefono, int antiguedad, int horastrabajadas, double salarioporhora, double salariomensual) {
        super(id, nombre, apellidos, nif, direccion, telefono, antiguedad, horastrabajadas, salarioporhora, salariomensual);
    }

    public Secretariado(Secretariado s) {
        super(s);
    }

    public Secretariado(EOficina e) {
        super(e);
    }

    public static Secretariado nuevoSecretariado() {
        Secretariado secretariado;
        char d='d';
        Scanner in;
        in = new Scanner(System.in);
        do {
            secretariado = new Secretariado(EOficina.nuevoEOficina());

            System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
            d = in.next().charAt(0);
        } while (d != 's' && d != 'S');

        return secretariado;

    }

    public Secretariado getSecretarioById(long Id) {
        Secretariado s = null;
        /* for(int i=0; i< Lista.size (); i++){
     secretariado=(Secretariado) Lista[i];
     
        if( secretariado.getId()== Id){
        }
        
     } 
         */
        return s;
    }

    public ArrayList<Secretariado> getAllSecretariados() {
        ArrayList<Secretariado> Secretariados = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           g= Grupo Lista[i];
       Secretariado.add(f);
       
         */
        return Secretariados;
    }

    public static boolean revisado(boolean re) {

        return re;
    }

    public ArrayList<Nomina> calcularNomina() throws ParseException, NominaException, CosteException {
        char s = 'k';
       // int horastrabajadas;
       // double salarioporhora;
       // double salariomensual;
        

        ArrayList<Nomina> Nominas = new ArrayList<Nomina>();
        Nomina nomina = new Nomina();
        nomina = Nomina.nuevoNomina();
              Scanner sc = new Scanner (System.in);
            
       
        System.out.print("Ingrese las horas trabajadas: ");
        int horastrabajadas = sc.nextInt();
        System.out.print("Ingrese el valor del salario por hora: ");
        double salarioporhora = sc.nextDouble();
        System.out.print("Ingrese el salario mínimo mensual: ");
        double salariomensual = sc.nextDouble();
        
        double pagonomina = horastrabajadas * salarioporhora;
        if(pagonomina > salariomensual) {
        
        System.out.println("Nómina total del mes: " + pagonomina);  
        
        (nomina.getCoste()).setImporte(pagonomina);
        } else {
        
        System.out.println("La nómina es el salario mínimo = " + salariomensual);
   
         (nomina.getCoste()).setImporte(salariomensual);}
         
    System.out.println("La nomina es:" + nomina);
       
    Nominas.add(nomina);
    return Nominas;
    
    
    }

    @Override
    public String toString() {
        return super.toString() + "";
    }

    public String data() {
        return super.data() + "";
    }
}
