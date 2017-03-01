/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author santiago.romero
 */
public class NodeTest {
    private Node node;
    
    public NodeTest() {
        node = new Node();
    }
    
    @Test
    public void testConstructor() {
        node = new Node();
        assertTrue(node.getData() == 0 && node.getLink() == null);
    }
    
    @Test
    public void testGetNodeData(){
        node.setData(5);
        
        double data = node.getData();
        assertTrue(data == 5);
    }
    
    @Test
    public void testSetNodeData(){
        Double data = 0.0;
        node.setData(data);
    }
    
    @Test
    public void testSetLink(){
        Node link = new Node();
        node.setLink(link);
    }
    
    @Test
    public void testSetLinkNull(){
        node.setLink(null);
    }
    
    @Test
    public void testGetLink(){
        
        Node link = node.getLink();
    }
    
}
