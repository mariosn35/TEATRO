/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

/**
 *(idGrupo,seman,anio,nombre)
(idEteatro,idGrupo,atributosEpleado,categoria)Mario
(idFranquicia,idGrupo,idInforme,idDireccion,fechaCreacion,ubicacion,accesible)Mario
(idInforme,idSecretariado,mes,anio,balance)Mario
(idSecretariado,atributosEOficina)
(idDireccion,atributosEOficina)
(idCoste,idInforme,idAcomodador,idLimpieza,idNomina,fecha,importe,reporte)Aidan
(idBeneficio,idInforme,idTaquilla,idBono,fecha,reporte,importe)Aidan
(idAcomodador,atributosdeETeatro)
(idLimpieza,atributosdeETeatro)
(idNomina,idSecretariado,idEmpleado,revisado,mes,anio)Andres
(idTaquilla,atributosETeatro)
(idBono,idUsuario,tipo,mes)Andres
(idUsuario,nombre,telefono,nif,email)
(idEmpleado,nombre,apellidos,nif,direccion,telefono)
(idEOficina,atributosEmpleado,antiguedad)
 * @author roter
 */
public class Prueba {

    public static void main(String[] args) throws ParseException, CosteException, IOException{
        //Franquicia.nuevafranquicia();
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

        /*     Secretariado s=new Secretariado();
            s.calcularNomina();
            Acomodador a=new Acomodador();
            a = Acomodador.nuevoAcomodador();
            ArrayList<Coste> costesReparacion = a.añadirCosteReparacion();
         */
        String texto = "texto.txt";
        Acomodador acomo=new Acomodador();
        acomo =Acomodador.nuevoAcomodador();
        if (acomo!=null);
        acomo.exportarAFichero(texto);
        int opcion;
      Scanner in = new Scanner(System.in);
        do {
              
        System.out.println("Pulse 1 para comprar bono");
        System.out.println("Pulse 2 reportar costes");
        System.out.println("Pulse 3 para calcular nomina");
        System.out.println("Pulse 4 para salir");
        opcion = in.nextInt();
            
            switch (opcion) {
                case 1:
                    Bono bono = new Bono();

                    Usuario aidan = Usuario.nuevoUsuario();

                    aidan.registrarusuario();
                    System.out.println("Usuario registrado:" + aidan.isRegistrado());
                    bono = aidan.comprarbono();
                    

                    System.out.println("Tu bono" + bono);
                    break;
                case 2:
                    Coste.nuevoCoste();
                    break;

                case 3:
                    boolean nominacorrecta = true;
                    Secretariado secretario = new Secretariado();
                    do {
                        try {
                            secretario.calcularNomina();
                        } catch (NominaException ex) {
                            nominacorrecta = false;
                            System.out.println("Los datos son incorrectos");
                        }
                    } while (!nominacorrecta);
                    break;

                case 4:
                    Coste c= new Coste();
                    c.nuevoCoste();

                    c.LeerFichero(texto);
                    break;
                default:
                    System.out.println("Valor incorrecto!");
                        
            }
        } while (opcion != 4);

    }
    
}
