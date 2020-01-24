/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author roter
 */
public class Prueba {
        public static void main(String[] args) throws ParseException {
          Franquicia.nuevafranquicia();
         //Usuario.nuevoUsuario();
          //  Acomodador.nuevoAcomodador();
           // Beneficio.nuevoBeneficio();
//           Bono.nuevoBono();
       //   Coste.nuevoCoste();
//           Direccion.nuevoDireccion();
//           EOficina.nuevoEOficina();
//           ETeatro.nuevoETeatro();
//           Empleado.nuevoEmpleado();
//           Grupo.nuevogrupo();
//           Informe.nuevoinforme();
//           Nomina.nuevoNomina();
//           Secretariado.nuevoSecretariado();
//           Taquilla.nuevoTaquilla();
           //  Nomina n=Secretariado.calcularnomina();
             //System.out.println("Tu nomina"+n);
            /* Bono b=Bono.nuevoBono();
            Usuario a = new Usuario();
           
            a= Usuario.nuevoUsuario();
                  
                   a.registrarusuario(a);
            System.out.println("Usuario registrado:"+a.isRegistrado());
             a.comprarbono(b); 
             System.out.println("Tu bono"+b);
*/          
            Secretariado s=new Secretariado();
            s.calcularNomina();
            Acomodador a=new Acomodador();
            a = Acomodador.nuevoAcomodador();
            ArrayList<Coste> costesReparacion = a.añadirCosteReparacion();
            
        }
    
    
}
