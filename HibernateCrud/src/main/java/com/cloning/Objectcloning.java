package com.cloning;

public class Objectcloning implements Cloneable {
	
	int i=10;
	int j=20;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		/*
		 * 
		 *   it is process of creating exact duplicate object 
		 * clone method is object class method
		 * 
		 * 
		 */
		
		
		
		Objectcloning objc=new Objectcloning();
		
		System.out.println(objc.i+ " "+objc.j );
		Objectcloning clone1 = (Objectcloning) objc.clone();
		
		
		clone1.i=20;
		clone1.j=10;
		System.out.println(clone1.i+" "+clone1.j);
		System.out.println(objc.i+ " "+objc.j );
		
		
	}
	
	
	
	
	
	
	

}
