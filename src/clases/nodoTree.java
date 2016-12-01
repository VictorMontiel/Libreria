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
public class nodoTree <T>{
    T data;
    nodoTree left;
    nodoTree right;

public nodoTree(T data){
this.data=data;
left=null;
right=null;
}
}
