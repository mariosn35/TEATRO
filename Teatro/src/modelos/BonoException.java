/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author DAW105
 */
public class BonoException extends Exception {

    public  BonoException (String msj) {
            super(msj);
    }
    public static boolean validarCategoria(char categoria) throws BonoException{
        
                     if (categoria != 'C' && categoria != 'P') {
            throw new BonoException("El tipo no es valido. C o P validos");
        }
                     return true;
   }
    
       public static boolean validarMes(int mes) throws BonoException{
        
              if (mes < 1 || mes > 12) {
             throw new BonoException("El mes no es valido.De uno a doce ");
        }
                     return true;
   }
          public static boolean validarAnnio(int annio) throws BonoException{
        
             if (annio < 1980 || annio > 2021) {
            throw new BonoException("El año no es valido.De 1980 a 2021 ");
        }
                     return true;
   }
//    public static int invalido(char a) throws tipoinvalido {
//        if (a != 'c' && a != 'p') {
//            throw new tipoinvalido();
//        }
//
//        return a;
//    }
//
//    public static class Malmes extends Exception {
//
//        Malmes() {
//            super("Solo hay 12 meses");
//        }
//    }
//
//    public static int malm(int a) throws Malmes {
//        if (a < 1 || a > 12) {
//            throw new Malmes();
//        }
//        return a;
//    }
//
//    public static class Malannio extends Exception {
//
//        Malannio() {
//            super("Es un año invalido del 0 al actual");
//        }
//    }
//
//    public static int mala(int a) throws Malannio {
//        if (a < 0 || a > 2020) {
//            throw new Malannio();
//        }
//        return a;
//    }
}
