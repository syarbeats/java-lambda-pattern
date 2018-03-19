package com.cdc.mitrais.abstraction_ones;

public class Toyota extends AsianCar {
	
	private String name;
	private String producer;
	private String year;

	static{
		CarFactory.getInstance().registerProduct("CARID1", Toyota.class);
	}
	
	
	public Toyota(String name, String producer, String year) {
		super(name, producer, year);
		
	}
	
	public String getEngineName(){
		return "3S-GTE";
	}

	
}
