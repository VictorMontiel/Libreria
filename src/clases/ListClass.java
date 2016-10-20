package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paco
 */
public class ListClass <G>{
    private nodeClass first;
    private nodeClass last;
    
    public nodeClass getFirst(){
        return this.first;
    }
    public nodeClass getLast(){
        return this.last;
    }
    public void setFirst(nodeClass n){
        this.first=n;
    }
    public void setLast(nodeClass n){
        this.last=n;
    }

    public void insertFirst(G n) {
        nodeClass node = new nodeClass();
        node.setData(n);
        if (eList()) {
            setFirst(node);
            setLast(node);
        } else {
            node.setNext(first); 
            setFirst(node);

        }
    }

    public void insertLast(G n) {
        nodeClass node = new nodeClass();
        node.setData(n);
        if (eList()) {
            setFirst(node);
            setLast(node);
        } else {
            last.setNext(node);
            setLast(node);
        }
    }

    private boolean eList() {
        return first == null;
    }

    public void showLista() {
        if (!eList()) {
            nodeClass aux;
            aux = first;
            while (aux != null) {
                if (aux==first) {
                    System.out.print("["+aux.getData()+"|->");
                    aux = aux.getNext();
                }else{
                System.out.print("" + aux.getData()+"|->");
                aux = aux.getNext();
                }
            }
            System.out.println("☠]");
        } else {
            System.out.println("Está vacia");
        }
    }

    public boolean eNode(G n) {
        nodeClass aux = first;
        if(first.getData()==n){
            eFirst();
            return true;
        }
        if (last.getData()==n) {
            eLast();
            return true;
        }
        while (aux.getNext()!=null && aux.getNext().getData()!=n ){
            aux=aux.getNext();
        }
        if (aux.getNext()!=null && aux.getNext().getData()==n) {
            aux.setNext(aux.getNext().getNext());
            return true;
        }
            return false;
    }
    public void eFirst (){
        first=first.getNext();
        
    }
    public void eLast (){
        nodeClass aux=first;
        while (aux.getNext().getNext()!=null){
            aux=aux.getNext();
        }
        aux.setNext(null);
        last=aux;
    }
}
