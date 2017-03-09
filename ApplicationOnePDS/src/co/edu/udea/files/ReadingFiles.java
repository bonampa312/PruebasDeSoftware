/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author santiago.romero
 */
public class ReadingFiles extends JFrame{
    
    private JFileChooser chooser;
    
    public ReadingFiles(){
        chooser = new JFileChooser();
        chooser.setDialogTitle("Seleccione un archivo");
        this.getContentPane().add(chooser);
        chooser.setVisible(false);
        
    }
    public ArrayList readFloatsFile(String fileName) {
        ArrayList lista = new ArrayList();
        return lista;
    }
    
    public FileInputStream openFile(String fileName){
        FileInputStream file = null;
        try {
            file = new FileInputStream(fileName);
        } catch (FileNotFoundException ex) {
            /*
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "JPG & GIF Images", "jpg", "gif");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(this);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                System.out.println("You chose to open this file: " +
                chooser.getSelectedFile().getName());
            }*/
            JFrame frame = new FileChooser();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);                    
        }
        return file;
    }
    
}
