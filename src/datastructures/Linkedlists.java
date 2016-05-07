/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.HashSet;

/**
 *
 * @author Praneetha
 */
public class Linkedlists {
    
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    public static void removeDup(Node a){
        HashSet<Node> hs = new HashSet<Node>();
        if (a.next == null) return;
        
        while(a.next != null){
            if(!hs.add(a.next)){
                a.next = a.next.next;
            }
            a = a.next;
        }
        
    }
    
    public static Node nthlast(Node a, int n){
        //Have two pointers. take second one n places later and increment
        //both pointers from then. Stop when second pointer hits last.
        Node p1 = a;
        Node p2 = a;
        for (int i=0; i<n; i++){
            if(p2.next != null)
                p2 = p2.next;
        }
        
        while(p2.next!= null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
    
    public static void deleteMiddle(Node head, Node mid){
        //move head until it reached mid and then attach its next pointer
        //to mid's next.
        while(head.next != mid){
            head = head.next;
        }
        head.next = mid.next;
    }
    
    public static Node addNums(Node head1, Node head2){
        if (head1.next == null && head2.next == null)
            return null;
        
        return head2;
    }
    
    public static boolean isCircular(Node head){
        Node p1 = head, p2 = head;
        if(head.next == null)
            return false;
        while(p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
            
            if(p1 == p2){
                int k=1;
                while (p1.next != p2){ //p1 and p2 are same initially
                    p1 = p1.next;
                    k++; //the number of nodes in the loop
                }
                p2 = head;
                p1 = head;
                for (int i=0;i<k;i++){
                    p1 = p1.next;
                }
                
                while(p1 != p2){
                    p1 = p1.next;
                    p2 = p2.next;
                }
                //p1 = p2 = the start of the loop
                //Node at which p1 and p2 now meet will be the start of the loop.
            }
                
        }
        return false;
    }
    
    
    public static void main(String[] args){
        
    }
}
