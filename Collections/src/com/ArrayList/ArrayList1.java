package com.ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
	
	 public static void main(String args[]){  
		  ArrayList<String> a=new ArrayList<String>();  
		  a.add("Bharath");  
		  a.add("Virat");  
		  a.add("Rohit");  
		  a.add("Kalli"); 
		  a.add(1,"Dhawan");
		  
		  for(String obj:a)  
		    System.out.println(obj);  
	 }
}
