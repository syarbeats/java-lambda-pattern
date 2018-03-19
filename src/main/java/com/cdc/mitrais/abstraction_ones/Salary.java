package com.cdc.mitrais.abstraction_ones;

public class Salary extends Employee {
	
	private double Salary;

	public Salary(String name, String address, int number, int numberOfProject, double salary) {
		super(name, address, number, numberOfProject);
		setSalary(salary);
	}
	
	public void mailCheck(){
		System.out.println("Within mail check of salary class");
		System.out.println("Mailing check to "+ getName() +" With salary "+Salary);
	}

	public double computePay(){
		
		System.out.println("Computing salary for "+ getName());
		return Salary/52;
	}
	
	public double getSalary() {
		return Salary;
	}

	public void setSalary(double newSalary) {
		if(newSalary >= 0.0){
			Salary = newSalary;
	    }
	}

	@Override
	public double getBonus() {
		if(super.getNumberOfProject() > 5)
			return 2500;
		else
			return 1000;
	}

}
