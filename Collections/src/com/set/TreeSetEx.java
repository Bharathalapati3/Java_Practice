package com.set;

import java.util.*;  
class TreeSetEx{  
 public static void main(String args[]){  
  TreeSet<String> set=new TreeSet<String>();  
         set.add("C");  
         set.add("B");  
         set.add("A");  
         set.add("E");  
         set.add("D");  
         System.out.println("Initial Set: "+set);  
           
         System.out.println("Reverse Set: "+set.descendingSet());  
           
         System.out.println("Head Set: "+set.headSet("C", true));  
          
         System.out.println("SubSet: "+set.subSet("A", false, "E", true));  
           
         System.out.println("TailSet: "+set.tailSet("C", false));  
 }  
}  