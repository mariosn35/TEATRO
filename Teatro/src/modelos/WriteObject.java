/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author DAW114
 */
public class WriteObject {

    public static Object deserialize(String fileName) throws IOException,
      ClassNotFoundException {
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();
            ois.close();
            return obj;
  }
  /**
   * serialize the given object and save it to given file
   */
    public static void serialize(Object obj, String fileName)
        throws IOException {
              FileOutputStream fos = new FileOutputStream(fileName);
              BufferedOutputStream bos = new BufferedOutputStream(fos);
              ObjectOutputStream oos = new ObjectOutputStream(bos);
              oos.writeObject(obj);
              oos.close();
    }
}
