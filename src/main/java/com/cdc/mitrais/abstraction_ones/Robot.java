package com.cdc.mitrais.abstraction_ones;

public class Robot {
	
	private IBehaviour behaviour;
	private String name;
	
	public Robot(String name){
		this.name = name;
	}
	
	public IBehaviour getBehaviour() {
		return behaviour;
	}
	
	public void setBehaviour(IBehaviour behaviour) {
		this.behaviour = behaviour;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void move(){
		System.out.println(this.name+ ": Based on current position "+"the behaviour object decide the next move:");
		int command =  behaviour.moveCommand();
		System.out.println("\tThe result returned by behaviour object "+"is sent to the movement mechanism "+"for robot '"+this.name+"'");
	}

}
