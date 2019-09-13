package com.ArrayList;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String args[]){  
		  ArrayList<String> al=new ArrayList<String>();  
		           System.out.println("Initial elements: " +al); 
		           
		           //Adding elements to the end of the list  
		           al.add("Bharath");  
		           al.add("Rahul");  
		           al.add("Dhawan");  
		           System.out.println("After adding elements: "+al);  
		           
		           //Adding an element at the specific position  
		           al.add(1, "Rohit");  
		           System.out.println("After adding element at secific position "+al); 
		           
		           //Removing elements
		           al.remove(1);
		           System.out.println("After removing elements at index 1:" +al);
		           
		           ArrayList<String> al2=new ArrayList<String>();  
		           al2.add("Warner");  
		           al2.add("Smith");  
		           
		           //Adding second list elements to the first list  
		           al.addAll(al2);  
		           System.out.println("After addAll: "+al); 
		           
		           ArrayList<String> al3=new ArrayList<String>();  
		           al3.add("Duplesis");  
		           al3.add("Devilliers");  
		           
		           //Adding third list elements to the first list at specific position  
		           al.addAll(1, al3);  
		           System.out.println("After addAll at index 1 "+al);  
		           
		           //Retain only third list elements
		           al.retainAll(al3);
		           System.out.println("After retaining only third list elements" +al);
		             
		 }  

}
