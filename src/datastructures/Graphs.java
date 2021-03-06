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
public class Graphs {
    boolean[][] edges;
    int[] labels;
    
    Graphs(int s, int v){
        edges = new boolean[s][v];
    }
    
    int[] getneighbours(int s){
        int count=0;
        int[] answer = new int[edges[s].length];
        for (int i=0; i<edges[s].length; i++){
            if(edges[s][i]){
                answer[count] = i;
                count++;
            }
        }
        return answer;
    }
    
    void dfs(int start){
        boolean[] marked = new boolean[labels.length];
        int[] neighbours = getneighbours(start); // get all the neightbours of this node
        marked[start] = true;
        for (int i=0; i<neighbours.length; i++)
            if(!marked[neighbours[i]])
                dfs(neighbours[i]);
    }
    /*
    For breadth first search, use a queue.
    Add the first node to the queue, then start a while loop.
    while the queue is not empty, dequeue the node and mark it.
    Then add the node's neighbours to the queue.
    */
    
}
