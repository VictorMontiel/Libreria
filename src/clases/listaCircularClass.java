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
public class listaCircularClass <G>{
    
    private nodeClass pivote;

    public void insert(G g) {  //método para insertar un nodo
        nodeClass nodo = new nodeClass();
        nodo.setData(g); //se crea el nodo con el dato ingresado
        if (!eList()) { //si la lista no está vacía, se coloca al principio de esta
            nodo.setNext(pivote); //el nodo se pone antes del pivote
            nodeClass aux = pivote;
            while (aux.getNext() != pivote) { //se encuentra el nodo señalando al pivote
                aux = aux.getNext();
            }
            aux.setNext(nodo);//ese nodo ahora señala a nuestro nuevo nodo
            pivote = nodo;//el pivote señala al nuevo nodo
        } else {
            pivote = nodo;
            nodo.setNext(pivote);
        }
    }

    public boolean encontrarDato(G g) {// método para buscar un dato
        nodeClass aux = pivote;
        while (aux.getData() != g && aux.getNext() != pivote) {//este while recorre toda la lista, deteniéndose cuando halla el dato  o termina de recorrerla
            aux = aux.getNext();
        }
        if (aux.getData() == g) { //avisa si la busqueda fue exitosa o fallida
            System.out.println("Sí se encontró el dato '" + g + "'");
            return true;
        } else {
            System.out.println("No se encontró el dato '" + g + "'");
            return false;
        }
    }

    public boolean eList() { //devuelve true si está vacia la lista, false de lo contrario
        return pivote == null;
    }

    public boolean eliminar(G g) { //método para eliminar un nodo con el dato ingresado
        if (eList()) { //verifica si hay lista
            System.out.println("La lista está vacía");
            return false;
        } else {
            if (pivote.getData() == g) { //caso si el pivote es el nodo con el dato
                if (pivote.getNext() == pivote) {//caso si la lista es de un sólo nodo
                    pivote = null; //se elimina la lista haciendo que el pivote apunte a nada
                    System.out.println("Se ha eliminado el último dato de la lista '" + g + "'");
                    return true;
                }//de haber más de un elemento en la lista
                nodeClass aux = pivote; 
                while (aux.getNext() != pivote) { //es while pone el auxiliar en el nodo anterior al pivote
                    aux = aux.getNext();
                }
                aux.setNext(aux.getNext().getNext()); //se elimina el pivote de las referencias de la lista
                pivote = aux.getNext();
                System.out.println("Se eliminó el dato '" + g + "'");
                return true;
            }
            nodeClass aux = pivote; //caso si el dato no se encuentra en el pivote
            while (aux.getNext().getData() != g && aux.getNext() != pivote) {//recorre todos los nodos hasta encontrar el que su next tenga el dato
                aux = aux.getNext();
            }
            if (aux.getNext().getData() == g) {//de haberlo encontrado, se elimina la referenci hacia el siguiente nodo (el que tiene el dato)
                aux.setNext(aux.getNext().getNext());
                System.out.println("Se eliminó el dato '" + g + "'");
                return true;
            } else { //de haber no encontrado el dato, se avisa
                System.out.println("No se encontró el dato '" + g + "'");
                return false;
            }
        }
    }

    public void mostrar() { //método para mostrar la lista
        if (!eList()) {//se verifica si hay lista para mostrar
            nodeClass aux = pivote;
            System.out.print("...->[" + aux.getData() + "]->");//primero se imprime el pivote
            while (aux.getNext() != pivote) { //el while recorre los nodos hasta llegar al anterior del pivote
                System.out.print("[" + aux.getNext().getData() + "]->");
                aux = aux.getNext();
            }
            System.out.println("...");
        } else { //avisa si la lista está vacía
            System.out.println("La lista está vacía");
        }
    }

}
