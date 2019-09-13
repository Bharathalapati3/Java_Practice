package com.set;

import java.util.*; 
public class SetExample
{ 
    public static void main(String[] args) 
    { 
        // Set using HashSet
        HashSet<String> hash_Set = new HashSet<String>(); 
        hash_Set.add("Geeks"); 
        hash_Set.add("For"); 
        hash_Set.add("Geeks"); 
        hash_Set.add("Example"); 
        hash_Set.add("Set"); 
        System.out.print("HashSet Output"); 
        System.out.println(hash_Set); 
  
        // TreeSet Implementation
        System.out.print("TreeSet Output"); 
        Set<String> tree_Set = new TreeSet<String>(hash_Set); 
        System.out.println(tree_Set); 
    } 
} 