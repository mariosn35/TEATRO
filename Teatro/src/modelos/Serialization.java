/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import java.io.IOException;

/**
 * @author DAW114
 */
public class Serialization {
    public static void main(String[] args) {
    Empleado empleado = new Empleado();
    empleado = Empleado.nuevoEmpleado();
    try {
      /**
       *  Serializing the object
       */
      SerializationUtil.serialize(empleado, "serialization.txt");
      /**
       * Deserializing the object
       */
      Empleado newEmpleado = (Empleado) SerializationUtil.deserialize(".txt");
      System.out.println(newEmpleado.toString());
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
