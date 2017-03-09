/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import org.junit.Assert.*;
import co.edu.udea.files.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.*;

/**
 *
 * @author santiago.romero
 */
public class ReadFileTest {
    
    public ReadFileTest() {
    }
    
    @Test
    public void testReadFileReturn(){
        ReadingFiles rf = new ReadingFiles();
        ArrayList lista = rf.readFloatsFile("");
    }
    
    @Test
    public void testReadFileNull(){
        ReadingFiles rf = new ReadingFiles();
        ArrayList lista = rf.readFloatsFile("");
        assertTrue(lista != null);
    }
    
    @Test
    public void testOpenFile() throws FileNotFoundException{
        ReadingFiles rf = new ReadingFiles();
        FileInputStream file = rf.openFile("archivoLista.dat");
    }
    
}
