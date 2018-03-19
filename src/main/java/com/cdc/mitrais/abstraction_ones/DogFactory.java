package com.cdc.mitrais.abstraction_ones;

public class DogFactory {
	
	public static Dog getDog(String criteria){
		
		if(criteria.toLowerCase().equals("small")){
			return new Poodle();
		}else if(criteria.toLowerCase().equals("big")){
			return new Rottweiler();
		}else if(criteria.toLowerCase().equals("working")){
			return new SiberianHusky();
		}
		
		return null;
	}
}
