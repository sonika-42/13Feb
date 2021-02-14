package com.student;
public class Implicit {
	public static void main(String[] args) {		
	int i = 123;  //Implicit conversion 
        long l = i;     
        float f = l;
        Integer a = i;
      
        System.out.println("Int value "+i); 
        System.out.println("Long value "+l); 
        System.out.println("Float value "+f);
        System.out.println("Integer (Convert in Wrapper)= "+a);
	}
}
