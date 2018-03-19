package com.cdc.mitrais.abstraction_ones;

import java.util.List;
import java.util.Map;

public abstract class Employee {
	
	private String name;
	private String address;
	private int number;
	private int numberOfProject;
	private List<String> listProject;
	private Map<String, String> phoneNumber;
	private int age;
	
	enum Car{
		
		lamborgini(900), tata(2), audi(50), fiat(15), honda(12);
		
		private int price;
		
		Car(int p){
			price = p;
		}
		
		int getPrice(){
			return price;
		}
	}
	
	public Employee(String name, String address, int number, int numberOfProject ){
		System.out.println("Constructing an Employee...");
		this.name = name;
		this.address = address;
		this.number = number;
		this.numberOfProject = numberOfProject;
	}
	
	public void getMessage(){
		System.out.println("Access Singleton Class in Employee Class");
		SingletonClass.getInstance().printSomething();
	}
	
	public void getAllCars(){
		
		for(Car car : Car.values()){
			System.out.println("Car "+ car +" Cost is "+car.getPrice());
		}
	}
	
	public abstract double getBonus();
	
	public double computePay(){
		System.out.println("Inside Employee Computing");
		return 0.0;
	}
	
	public void mailCheck(){
		System.out.println("Mailing check to "+this.name+" "+this.address);
	}
	
	public String toString(){
		return name+" "+address+" "+number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumberOfProject() {
		return numberOfProject;
	}

	public void setNumberOfProject(int numberOfProject) {
		this.numberOfProject = numberOfProject;
	}
	
	public void displayMessage(Message message){
		System.out.println(message.greet()+" Everyone what's up...");
	}

	public List<String> getListProject() {
		return listProject;
	}

	public void setListProject(List<String> listProject) {
		this.listProject = listProject;
	}

	public Map<String, String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Map<String, String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
