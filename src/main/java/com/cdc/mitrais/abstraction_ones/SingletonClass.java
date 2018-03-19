package com.cdc.mitrais.abstraction_ones;

public class SingletonClass {
	
	private static SingletonClass instance;
	
	private SingletonClass(){
		System.out.println("SingletonClass(): Initializing Instance");
	}
	
	public static SingletonClass getInstance(){
		
		if(instance == null){
			
			synchronized(SingletonClass.class){
				
				if(instance == null){
					System.out.println("getInstance(): First time getInstance was invoked!");
					instance = new SingletonClass();
				}
			}
		}
		
		return instance;
	}
	
	public void printSomething(){
		System.out.println("This is came from singleton class....");
	}
	

}
