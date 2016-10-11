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
public class listaDoblementeEnlazada<G> {

    private nodeDL first;
    private nodeDL last;

    public void insertFirst(G data) {
        nodeDL node = new nodeDL();
        node.setData(data);
        if (eList()) {
            first = node;
            last = node;
        } else {
            node.setNext(first);
            first.setPrevious(node);
            first = node;
        }
    }

    public void insertLast(G data) {
        nodeDL node = new nodeDL();
        node.setData(data);
        if (eList()) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            node.setPrevious(last);
            last = node;
        }

    }

    public boolean eList() {
        return first == null && last == null;
    }

    public void eFirst() {
        first = first.getNext();
        first.setPrevious(null);
    }

    public void eLast() {
        last = last.getPrevious();
        last.setNext(null);
    }

    public boolean eNode(G data) {
        nodeDL aux = searchNode(data);
        if (aux == null) {
            System.out.println("No se encontró el dato " + data);
            return false;
        }
        if (aux == first) {
            eFirst();
            System.out.println("Se borró exitosamente el dato " + data);
            return true;
        }
        if (aux == last) {
            eLast();
            System.out.println("Se borró exitosamente el dato " + data);
            return true;
        }
        System.out.println("Se borró exitosamente el dato " + data);
        aux.getPrevious().setNext(aux.getNext());
        aux.getNext().setPrevious(aux.getPrevious());
        return true;
    }

    public nodeDL searchNode(G data) {
        nodeDL aux;
        if (eList()) {
            return null;
        }
        aux = first;
        while (aux.getData() != data && aux != last) {
            aux = aux.getNext();
        }
        if (aux.getData()== data) {
            return aux;
        }
        return null;
    }

    public void showListaadelante() {
        if (!eList()) {
            nodeDL aux;
            aux = first;
            while (aux != null) {
                if (aux == first) {
                    System.out.print("[" + aux.getData() + "|->");
                    aux = aux.getNext();
                } else {
                    System.out.print("" + aux.getData() + "|->");
                    aux = aux.getNext();
                }
            }
            System.out.println("☠]");
        } else {
            System.out.println("Está vacia");
        }
    }

    public void showListaatras() {
        if (!eList()) {
            nodeDL aux;
            aux = last;
            while (aux != null) {
                if (aux == last) {
                    System.out.print("[" + aux.getData() + "|->");
                    aux = aux.getPrevious();
                } else {
                    System.out.print("" + aux.getData() + "|->");
                    aux = aux.getPrevious();
                }
            }
            System.out.println("☠]");
        } else {
            System.out.println("Está vacia");
        }
    }
}
