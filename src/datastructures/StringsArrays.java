/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author Praneetha
 */
public class StringsArrays {

    /**
     * @param args the command line arguments
     */
    public static boolean uniquechars(String s){
        HashSet<String> chars = new HashSet<String>();
        char[] ca = s.toCharArray();
        for (char c: ca)
            if (!chars.add("" + c))
                return false;
        return true;
    }
    
    public static boolean uniquechars2(String s){
        char[] ca = s.toCharArray();
        for (int i=0; i<ca.length-1; i++){
            if (s.substring(i+1).contains("" + ca[i]))
                return false;
        }
        return true;
        
    }
    
    public static String removeDup(String s){
        //Not lexicographically smallest.
        HashSet<String> str = new HashSet<String>();
        char[] ca = s.toCharArray();
        String returnstr = "";
        for (char c: ca)
            if (str.add("" + c))
                returnstr = returnstr + c;
        return returnstr;
    }
    
    public static boolean isAnagram(String orig, String str){
        //Time: O(n) for each string to hashmap + time to compare two hashmaps which is O(n)
        if (orig == null || str == null || orig.length() != str.length())
            return false;
        
        HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
        HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
        char[] ca1 = orig.toCharArray();
        char[] ca2 = str.toCharArray();
        
        for (char c: ca1){
            if(hm1.containsKey(c))
                hm1.put("" + c, hm1.get("" + c)+1);
        }
        for (char c: ca2){
            if(hm2.containsKey(c))
                hm2.put("" + c, hm2.get("" + c)+1);
        }
        if (hm1.equals(hm2))
            return true;
        return false;
    }
    
    public static String reverseString(String s){
        //recursion or use stack.
        if (s.length() <= 1)
            return s;
        else
        return reverseString(s.substring(s.length()/2)) + reverseString(s.substring(0, s.length()/2));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("" + uniquechars2("test"));
        System.out.println("" + reverseString("true"));
        System.out.println("" + removeDup("test"));
        System.out.println("" + isAnagram("carta", "arttc"));
    }
    
}
