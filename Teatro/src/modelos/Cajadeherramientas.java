/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;


import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
/**
 *
 * @author DAW105
 */
public class Cajadeherramientas {
    
    public static Date readDate(Scanner sc, String format) throws ParseException{
     return (Date) new SimpleDateFormat(format).parse(sc.nextLine());
}
    
}
