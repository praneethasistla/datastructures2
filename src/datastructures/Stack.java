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
public class Stack {
    int[] stackArray = new int[300];//some random number to approx the size.
    int topindex;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    Node top;
    public Node pop(){
        if(top != null){
            Node item = top;
            top = top.next;
            return item;
        }
        return null;
    }
    
    public void push(Node node){
        node.next = top;
        top = node;
    }
    
    public void pushStackArray(int num){
        if(topindex++ == stackArray.length)
            System.out.println("Stack is full. New element not added");
        stackArray[topindex++] = num;
    }
    
    public int popStackArray(){
        int temp = stackArray[topindex];
        topindex--;
        return temp;
    }
    
    public int peekStackArray(){
        return stackArray[topindex];
    }
    
    public boolean isEmptyStackArray(){
        return topindex == 0;
    }
    
}
