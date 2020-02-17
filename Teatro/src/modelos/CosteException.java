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
public class CosteException extends Exception {

    public CosteException(String msj) {
        super(msj);
    }

    public static boolean validarImporte(String importe) throws CosteException {
        try {
            double imp = Double.valueOf(importe);
            return validarImporte(imp);
        } catch (NumberFormatException e) {
            throw new CosteException("Se ha producido una CosteException, introduzca un valor numerico para el importe.");
        }
    }

    public static boolean validarImporte(double importe) throws CosteException {
        if (importe > 3000 || importe < 0) {
            throw new CosteException("Se ha producido una CosteException, introduzca un valor mayor de 0 y menor de 3000 para el importe.");
        }
        return true;
    }

    public static boolean validarReporte(String reporte) throws CosteException {
        if (reporte.length() < 4) {
            throw new CosteException("Se ha producido una CosteException, introduzca mas de 4 caracteres para el reporte.");
        }

        return true;
    }
}
