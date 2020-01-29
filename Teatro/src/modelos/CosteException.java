/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

/**
 *
 * @author Andres
 */
public class CosteException extends Exception{
        
    public CosteException(String msj){
    super(msj);
    }
    
    public static boolean validarImporte(double importe) throws CosteException{
     if (importe > 3000 || importe <0 ) 
            throw new CosteException("");
        
        
    return true;
    }
    
    
}
