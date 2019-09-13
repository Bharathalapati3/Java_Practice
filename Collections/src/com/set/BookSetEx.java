package com.set;

import java.util.*;  
class Book {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  
public class BookSetEx {  
public static void main(String[] args) {  
    HashSet<Book> set=new HashSet<Book>();  
    Book b1=new Book(1,"Stranger Friends","Swati Sharma","Oxford",25);  
    Book b2=new Book(2,"Harry Potter","Bharath","Times Printers",100);  
    Book b3=new Book(3,"Chota Bheem","Priti Nayak","Jitesh Publications",50);   
    set.add(b1);  
    set.add(b2);  
    set.add(b3); 
    for(Book b:set){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  