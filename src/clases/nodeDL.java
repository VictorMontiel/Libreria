/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Paco
 */
public class nodeDL <G>{
    protected G data;
    protected nodeDL next;
    protected nodeDL previous;

    public G getData() {
        return data;
    }

    public nodeDL getNext() {
        return next;
    }

    public nodeDL getPrevious() {
        return previous;
    }

    public void setData(G data) {
        this.data = data;
    }

    public void setNext(nodeDL next) {
        this.next = next;
    }

    public void setPrevious(nodeDL previous) {
        this.previous = previous;
    }
    
}
