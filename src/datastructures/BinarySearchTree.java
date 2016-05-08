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
    
    Node searchNode(int x, Node root){
        if(root == null || root.val == x)
            return root;
        if(x > root.val)
            searchNode(x, root.right);
        else
            searchNode(x, root.left);
        
        return null;
    }
    
    void insertNode(int x, Node root){
        if(x < root.val){
            if(root.left == null)
                root.left = new Node(x);
            else
                insertNode(x, root.left);
        } else {
            if(root.right == null)
                root.right = new Node(x);
            else
                insertNode(x, root.right);
        }
    }
    
    int maxdepth(Node root){
        if(root == null)
            return 0;
        int ldepth = maxdepth(root.left);
        int rdepth = maxdepth(root.right);
        return 1 + Math.max(ldepth, rdepth);
    }
    
    int mindepth(Node root){
        if (root == null)
            return 0;
        return 1 + Math.min(mindepth(root.left), mindepth(root.right));
    }
    
    boolean isBalanced(Node root){
        return maxdepth(root)-mindepth(root) <= 1;
    }

    private static class Node {
        Node left, right;
        int val;
        public Node() {
        }
        public Node (int x){
            val = x;
            left = null;
            right = null;
        }
        public Node(int x, Node left, Node right){
            val = x;
            this.left = left;
            this.right = right;
        }
    }
}
