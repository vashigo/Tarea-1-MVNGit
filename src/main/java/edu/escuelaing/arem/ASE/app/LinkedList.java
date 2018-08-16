/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

/* Class linkedList */
public class LinkedList {

private Node first = null;
private int size = 0;

public void insertFirst(double data) {
    Node n = new Node(data);
    n.next = first;
    first = n;
    size+=1;
}

public Node deleteFirst() {
    Node temp = first;
    first = first.next;
    if (first!=null){
        size-=1;
    }
    return temp;
}


public boolean isEmpty() {
    return (first == null);
  }
public double getNode(double i) {
    int n = indexOf(first); // count-1 actually
    Node current = first;
    while (n > i) {
        --n;
        current = current.next;
    }
    return current.data;
}

private int indexOf(Node link) {
    if (link == null) {
        return -1;
    }
    return 1 + indexOf(link.next);
}
public int getSize() {
    return size;
}


}