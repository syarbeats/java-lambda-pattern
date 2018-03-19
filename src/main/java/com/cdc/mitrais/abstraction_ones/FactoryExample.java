package com.cdc.mitrais.abstraction_ones;

public class FactoryExample {

	public static void main(String[] args) {
		DogFactory.getDog("Small").speak();
		DogFactory.getDog("Working").speak();
	}

}
