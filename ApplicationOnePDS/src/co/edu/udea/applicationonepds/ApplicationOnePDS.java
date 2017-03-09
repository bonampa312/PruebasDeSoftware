package co.edu.udea.applicationonepds;

import co.edu.udea.files.ReadingFiles;
import java.util.ArrayList;

/**
 *
 * @author santiago.romero
 */
public class ApplicationOnePDS {

    public static void main(String[] args) {
        ArrayList list = ReadingFiles.readFloatsFile();
        for (int i = 0; i<list.size(); i++) {
            System.out.println("Item: "+list.get(i).toString());
        }
    }
    
}
