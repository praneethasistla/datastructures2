/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author Praneetha
 */
public class QueueWithStack {
    Node first, last;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    public void enqueue(int item){
        Node node = new Node(item);
        if(first == null){
            first = node;
            last = node;
        } else{
            last.next = node;
            last = node; 
        }
   }
    
    public Node dequeue(){
        if (first == null)
            return null;
        Node temp = first;
        first = first.next;
        return temp;
    }
}
