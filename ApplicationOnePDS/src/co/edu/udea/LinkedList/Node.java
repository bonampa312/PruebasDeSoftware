/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.LinkedList;

/**
 *
 * @author santiago.romero
 */
public class Node {
    private double data;
    private Node link;
    
    public Node() {
        data= 0.0;
        link = null;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }
    
    public Node getLink(){
        return this.link;
    }

    void setLink(Node link) {
        
        this.link = link;
    }
}
