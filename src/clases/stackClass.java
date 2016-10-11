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
public class stackClass <G>{
    
    private int size = 0;
    private nodeClass top;

    public nodeClass getTop() {
        return top;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(G data) {
        nodeClass node = new nodeClass();
        node.setData(data);
        if (isEmpty()) {
            top = node;
        } else {
            node.setNext(top);
            top = node;
        }
        ++size;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacia");
        } else {
            top = top.getNext();
            --size;
        }
    }

    public nodeClass pop(int g) {
        if (isEmpty()) {
            System.out.println("La pila está vacia");
            return null;
        } else {
            nodeClass aux = top;
            top = top.getNext();
            --size;
            return aux;
        }
    }
}
