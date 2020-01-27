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
