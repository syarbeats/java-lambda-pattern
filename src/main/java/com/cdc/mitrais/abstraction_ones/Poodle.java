package com.cdc.mitrais.abstraction_ones;

class Poodle implements Dog{

	@Override
	public void speak() {
		System.out.println("The Poodle say \"arfff\"");	
	}

}

class Rottweiler implements Dog{

	@Override
	public void speak() {
		System.out.println("The Rottweiler says (in a very deep voice ) \"Woof!\" ");
	}
	
}

class SiberianHusky implements Dog{

	@Override
	public void speak() {
		System.out.println("The Husky says \"Dude, What's up?\" ");
	}
	
}
