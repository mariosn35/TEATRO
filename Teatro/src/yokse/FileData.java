/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yokse;
import java.io.IOException;

/**
 *
 * @author DAW114
 */
public class FileData {
    
    public static void main(String[] args) throws IOException {
    
        String file_name = "D:/Users/DAW114/Desktop/test.txt";
        
        try {
            ReadFile file = new ReadFile(file_name);
            String [] aryLines = file.OpenFile();
            
            int i;
            for (i=0; i < aryLines.length; i++) {
                System.out.println(aryLines[i]);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        
//        WriteFile
    try {
        WriteFile data = new WriteFile(file_name, true);
        data.writeToFile("This is another line of text");
    }
    catch (IOException e){
        System.out.println("Text File Written To");
    }
    
    }
}
