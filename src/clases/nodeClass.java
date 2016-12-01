/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paco
 * @param <G>
 */
public class nodeClass <G>{
    
   protected G data;
   protected nodeClass next;
    
    public G getData(){ //método para obtener el dato
        return this.data;
       
    }
    public void setData(G data){//método para darle valor al dato del nodo
        this.data=data;
    }
    public nodeClass getNext(){ //método para obtener el siguiente nodo
        return this.next;
    }
    public void setNext(nodeClass node){ //método para apuntar al siguiente nodo
        this.next=node;
    }
}