/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.files;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author santiago.romero
 */
public class FileChooser extends JFrame{
    
    private JFileChooser fileChooser;
    
    public FileChooser() {
        fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose a file");
        this.getContentPane().add(fileChooser);
        fileChooser.setVisible(true);
    }
    
    
}
