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
    empleado.nuevoEmpleado();
//    empleado.setId(1);
//    empleado.setNombre("Mario");
//    empleado.setApellidos("Mario");
//    empleado.setNif("Mario");
//    empleado.setDireccion("Mario");
//    empleado.setTelefono("Mario");
//    empleado.setHorastrabajadas(3);
//    empleado.setSalarioporhora(2.00);
//    empleado.setSalariomensual(2.00);
    try {
      /**
       *  Serializing the object
       */
      WriteObject.serialize(empleado, "D:\\Users\\DAW114\\Desktop\\serialization.txt");
      /**
       * Deserializing the object
       */
      Empleado newEmpleado = (Empleado) WriteObject.deserialize("D:\\Users\\DAW114\\Desktop\\serialization.txt");
      System.out.println(newEmpleado.toString());
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
