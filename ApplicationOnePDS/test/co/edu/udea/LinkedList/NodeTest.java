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

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testSetNodeData(){
        Double data = 0.0;
        node.setData(data);
    }
    
    @Test
    public void testGetNodeData(){
        node.setData(5);
        double data = node.getData();
        assertTrue(data == 5);
    }
    
    @Test
    public void testSetLink(Node link){
        node.setLink(link);
    }
    
    @Test
    public void testSetLinkNull(){
        node.setLink(null);
    }
    
    @Test
    public void testOwnGetLink(){
        Node a = new Node();
        a.setData(1);
        Node b = new Node();
        b.setLink(a);
        Node link = b.getLink();
        assertTrue(link.getData() == a.getData());
    }
    
    @Test
    public void testConstructor() {
        node = new Node();
        assertTrue(node.getData() == 0 && node.getLink() == null);
    }

    /**
     * Test of getData method, of class Node.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Node instance = new Node();
        double expResult = 0.0;
        double result = instance.getData();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Node.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        double data = 0.0;
        Node instance = new Node();
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLink method, of class Node.
     */
    @Test
    public void testGetLink() {
        System.out.println("getLink");
        Node instance = new Node();
        Node expResult = null;
        Node result = instance.getLink();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLink method, of class Node.
     */
    @Test
    public void testSetLink() {
        System.out.println("setLink");
        Node link = null;
        Node instance = new Node();
        instance.setLink(link);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
