package com.lambdaExpression;

interface Sayable{  
    public String say();  
}  
public class LambdaEx{  
public static void main(String[] args) {  
    Sayable s=()->{  
        return "Hello World";  
    };  
    System.out.println(s.say());  
}  
}  