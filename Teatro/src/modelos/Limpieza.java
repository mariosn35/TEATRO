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
public class Limpieza extends ETeatro {

    
    

    public Limpieza() {
        super();
    }

    public Limpieza(long id, String nombre, String apellidos, String nif, String direccion, String telefono, int horastrabajadas, double salarioporhora, double salariomensual,long idGrupo, char categoria, Grupo grupo, Coste coste) {
        super(id, nombre, apellidos, nif, direccion, telefono, horastrabajadas, salarioporhora, salariomensual,idGrupo, categoria, grupo);
    }

    public Limpieza(Limpieza l) {
        super(l);
    }
    public Limpieza(ETeatro e) {
        super(e);
    }
 

   


    public static Limpieza nuevoLimpiador() {
        char s='a';
      char z='s';
        Scanner in;
         in = new Scanner(System.in);
         
      Limpieza limpieza;
      do{
    limpieza = new Limpieza(ETeatro.nuevoETeatro());
    
     
      System.out.println("¿Los datos son correctos?"+limpieza);
      
      System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
      s= in.next().charAt(0);
      }while  (s!='s'&& s!='S' ); 
    return limpieza;
    
    
    }
       public  Coste nuevoCoste() throws ParseException   {
         char d='h';
         char z='l';
      Coste coste = new Coste();
      Scanner in;
      double importe;
      String reporte;
      in = new Scanner(System.in);
      Acomodador acomodador =null;
      Limpieza limpieza = null;
      do{
             
                 //System.out.println("Introduzca la fecha de creacion");
                 //Date fe=Cajadeherramientas.readDate(in,"DD-MM-YYYY");
                 //c.setFecha(fe);
              coste.setLimpiador(this);
                 
                 
               /*  System.out.println("Introduzca la fecha con formato dd-mm-yyyy");
                 
                 String fecha = in.nextLine();
                 SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                 String date = fecha;
                 Date testDate = df.parse(date);
                 long lnMilisegundos = testDate.getTime();
                 
                 java.sql.Date fe = new java.sql.Date(lnMilisegundos);;
                 System.out.println("Ahora hemos creado un objeto date con la fecha indicada, "+fe);
                 
                 if (!df.format(testDate).equals(date)){
                     System.out.println("invalid date!!");
                 } else {
                     System.out.println("valid date");
                     coste.setFecha(fe);
                 }
                 */
               
                 
                 System.out.println("Introduzca el importe en euros");
                 importe=in.nextDouble();
                 coste.setImporte(importe);
                 System.out.println("Introduzca el Reporte");
                 reporte=in.nextLine();
                 coste.setReporte(reporte);
                 
                 System.out.println("¿Los datos son correctos?"+coste);
                 
                 System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
                 d= in.next().charAt(0);
         
      } while  (d!='s'&& d!='S' );           
return coste;
    }
    public Limpieza getLimpiezasById(long id) {

        Limpieza l = null;
        /* for(int i=0; i< Lista.size (); i++){
     c=(Limpieza) Lista[i];
     
        if( f.getId()== Id){
        }
        
     } 
         */
        return l;
    }

    public ArrayList<Limpieza> getAllLimpiezas() {
        ArrayList<Limpieza> Limpiezas = new ArrayList();
        /*for (int i=0; i< Lista.size(); i++)
           c= Limpieza Lista[i];
        Limpiezas.add(f);
       
         */
        return Limpiezas;
    }

    @Override
    public String toString() {
        return super.toString()+"Limpieza{" + '}';
    }

    

    public String data() {
        return super.data();
    }
}
