/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Paco
 * @param <G>
 */
public class Queue<G> {
     //Atributes
    private nodeClass first;
    private nodeClass last;
    private int size;
    
    //Methods
    //Constructor
    public Queue() {
        this.first = null;
        this.last = null;
        size = 0;
    }
    
    public Queue(G data) {
        insertLast(data);
    }

    //Getters
    public nodeClass getFirst() {
        return first;
    }

    public nodeClass getLast() {
        return last;
    }

    public int getSize() {
        return size;
    }

    //Setters
    public void setFirst(nodeClass first) {
        this.first = first;
    }

    public void setLast(nodeClass last) {
        this.last = last;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty() {
        return this.first == null;
    }
    
    public void insertLast(G data) {
        nodeClass node = new nodeClass();
        node.setData(data);
        if (isEmpty()) {
            this.first = node;
            this.last = node;
        } else {
            node.setNext(last);
            last = node;
        }
         ++size;
    }
    
    public void eFirst() {
        nodeClass temp;
        if (!isEmpty()) {
            temp = last;
            while (temp.getNext() != first) {
                temp = temp.getNext();
            }
            temp.setNext(null);
            first = temp;
            --size;
        }
    }
    
    public void eQueue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
}

