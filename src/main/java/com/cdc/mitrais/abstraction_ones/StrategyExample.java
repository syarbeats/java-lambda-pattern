package com.cdc.mitrais.abstraction_ones;

public class StrategyExample {

	public static void main(String[] args) {
		
		Robot r1 = new Robot("Big Robot");
		Robot r2 = new Robot("Goerge v.2.1");
		Robot r3 = new Robot("R2");
		
		r1.setBehaviour(new AgressiveBehaviour());
		r2.setBehaviour(new DefensiveBehaviour());
		r3.setBehaviour(new NormalBehaviour());
		
		r1.move();
		r2.move();
		r3.move();
		
		System.out.println("\r\nNew Behaviours: "+"\r\n\t'Big Robot' gets really scared"+
							"\r\n\t, 'Goergev.2.1' became really mad because"+
							" it's always attacked by other robots" +
							"\r\n\t and R2 keeps its calm\r\n");
		
		r1.setBehaviour(new DefensiveBehaviour());
		r2.setBehaviour(new AgressiveBehaviour());
		
		r1.move();
		r2.move();
		r3.move();
	}

}
