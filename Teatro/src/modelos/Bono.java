package modelos;

import java.util.ArrayList;
import java.util.Scanner;
import modelos.XxxException.Malannio;
import modelos.XxxException.Malmes;
import static modelos.XxxException.invalido;
import static modelos.XxxException.mala;
import static modelos.XxxException.malm;
import modelos.XxxException.tipoinvalido;

/**
 *
 * @author Mario
 * @version 1.1
 */
public class Bono {

    protected long id;/*Modela id. Valor positivo*/
    char tipo;/*c para completo s para parcial*/
    int mes;/*del uno al doce*/
    int año;/*del 0 al año actual*/
    
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
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
     public static Bono nuevoBono()throws XxxException, XxxException.tipoinvalido, XxxException.Malmes, XxxException.Malannio {
          char s='s';
          char z='z';
      Bono bono = new Bono();
      char categoria;
      int mes;
      int annio;
      Usuario usuario = new Usuario();
      Scanner in;
       in = new Scanner(System.in);
       do{
      System.out.println("Introduzca el tipo de bono puede ser c o p");
       categoria = in.next().charAt(0);
          try{    invalido(categoria);}
       catch(tipoinvalido err){
        System.out.println(err);
       }
       finally{
       bono.setTipo(categoria);}
      
       System.out.println("Introduzca el mes en que es valido el bono");
       mes= in.nextInt();
       try{ malm(mes);}
       catch(Malmes err){
        System.out.println(err);
       }
       finally{
           bono.setMes(mes);
       }
       
        System.out.println("Introduzca el año en que es valido el bono");
       annio= in.nextInt();
        try{ mala(annio);}
       catch(Malannio err){
        System.out.println(err);
       }
       finally{
            bono.setAño(annio);
       }
      System.out.println("Quiere asignar el usuario propietario del bono");
         z = in.next().charAt(0);
         if (z == 's' || z=='S') {


       usuario=Usuario.nuevoUsuario();
      
            } else {System.out.println("No a asignado un usuario a este bono");}
       bono.setUsuario(usuario);
        
        System.out.println("¿Los datos son correctos?"+bono);
      
      System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
      s= in.next().charAt(0);
      } while  (s!='s'&& s!='S' );    
      
    return bono;
         }
      
           
         public static Bono nuevoBonoUsuario()throws XxxException, XxxException.tipoinvalido, XxxException.Malmes, XxxException.Malannio {
          char s='s';
          char z='z';
      Bono bono = new Bono();
      char categoria;
      int mes;
      int annio;
      Usuario usuario = new Usuario();
      Scanner in;
       in = new Scanner(System.in);
       do{
      System.out.println("Introduzca el tipo de bono puede ser c o p");
       categoria = in.next().charAt(0);
          try{    invalido(categoria);}
       catch(tipoinvalido err){
        System.out.println(err);
       }
       finally{
       bono.setTipo(categoria);}
      
       System.out.println("Introduzca el mes en que es valido el bono");
       mes= in.nextInt();
       try{ malm(mes);}
       catch(Malmes err){
        System.out.println(err);
       }
       finally{
           bono.setMes(mes);
       }
       
        System.out.println("Introduzca el año en que es valido el bono");
       annio= in.nextInt();
        try{ mala(annio);}
       catch(Malannio err){
        System.out.println(err);
       }
       finally{
            bono.setAño(annio);
       }
      
        
        System.out.println("¿Los datos son correctos?"+bono);
      
      System.out.println("Si lo son pulse s para continuar de lo contrario pulse n");
      s= in.next().charAt(0);
      } while  (s!='s'&& s!='S' );    
      
    return bono;
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
