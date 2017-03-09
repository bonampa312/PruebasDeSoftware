package co.edu.udea.files;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author santiago.romero
 */
public class ReadingFiles extends JFrame{
    
   private static JFrame mainFrame;
    
    public ReadingFiles(){        
    }
    
    public static ArrayList readFloatsFile() throws NumberFormatException, IOException {
        ArrayList lista = null;
        lista = readFileValues(",");
        
        return lista;
    }
    
    public static String getFilePath(){
        String fileName = "";
        JFileChooser  fileDialog = new JFileChooser();
        int returnVal = fileDialog.showOpenDialog(mainFrame);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
               fileName = fileDialog.getSelectedFile().getAbsolutePath();
        } else { 
           fileName = "";
        }
        return fileName;
    }
    
    public static ArrayList readFileValues(String delimiter) throws  FileNotFoundException, IOException, NumberFormatException {
        String filePath = getFilePath();
        InputStream in = new FileInputStream(filePath);
        String thisLine;
        BufferedInputStream s = new BufferedInputStream(in);
        BufferedReader myInput = new BufferedReader(new InputStreamReader(s));
        
        ArrayList values = new ArrayList();

        while ((thisLine = myInput.readLine()) != null) {
          StringTokenizer st = 
               new StringTokenizer(thisLine, delimiter);
          while(st.hasMoreElements())
            values.add(Float.parseFloat(st.nextToken()));
            }
         return(values);
    }
    
    
}
