/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Queue;

/**
 *
 * @author Praneetha
 */
public class BinarySearchTree {
    BinarySearchTree(){}
    
    void preorder(Node root){
        System.out.print(root.val);
        if(root.left != null)
            preorder(root.left);
        if(root.right != null)
            preorder(root.right);
    }
    
    void postorder(Node root){
        if(root.left != null)
            postorder(root.left);
        if(root.right != null)
            postorder(root.right);
        System.out.print("" + root.val);
    }
    
    void inorder(Node root){
        if(root.left != null)
            postorder(root.left);
        System.out.print("" + root.val);
        if(root.right != null)
            postorder(root.right);
    }
    
    void levelorder(Node root){
        Queue<Node> q = null;
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.remove();
            System.out.print("" + temp.val);
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
                
        }
    }

    private static class Node {
        Node left, right;
        int val;
        public Node() {
        }
        
        public Node(int x, Node left, Node right){
            val = x;
            this.left = left;
            this.right = right;
        }
    }
}
