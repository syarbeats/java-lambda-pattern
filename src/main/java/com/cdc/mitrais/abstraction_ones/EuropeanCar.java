package com.cdc.mitrais.abstraction_ones;

public class EuropeanCar implements CarProduct {
	
	private String name;
	private String producer;
	private String year;

	public EuropeanCar(String name, String producer, String year){
		this.name = name;
		this.producer = producer;
		this.year = year;
	}
	
	@Override
	public String getEngineCapasity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEngineSpeed() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEngineVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEngineModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
