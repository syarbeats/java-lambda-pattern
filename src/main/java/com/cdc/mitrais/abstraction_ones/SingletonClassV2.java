package com.cdc.mitrais.abstraction_ones;

public class SingletonClassV2 {
	
	private static SingletonClassV2 instance = new SingletonClassV2();
	
	private SingletonClassV2(){
		System.out.println("SingletonClassV2(): Initializing Instance..");
	}
	
	public static SingletonClassV2 getInstance(){
		return instance;
	}
	
	public void getMessage()
	{
		System.out.println("This message came from SingletonClassV2");
	}
}
