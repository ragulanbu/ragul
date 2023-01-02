package com.singleton;

public class Employee {
	
	static Employee object;
	
	private Employee() {
		
		
}
	
	public static Employee  getobject() {
		
		if (object==null) {
			
		System.out.println("before object:"+System.identityHashCode(object));	
		
		object = new Employee();
		
		System.out.println("After object:"+System.identityHashCode(object));	
			
			
			
		}
		return object;
		
		
		
		
		

	}
	
	private void Add() {
		
		
		System.out.println("ragul");

	}
	
	public static void main(String[] args) {
		
		
		Employee a1=getobject();
		
		a1.Add();
		
		System.out.println(System.identityHashCode(a1));
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
	
		
	
	
		
	}	
		
		
		
		

	


