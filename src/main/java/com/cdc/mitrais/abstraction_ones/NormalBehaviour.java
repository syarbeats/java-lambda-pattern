package com.cdc.mitrais.abstraction_ones;

public class NormalBehaviour implements IBehaviour{

	@Override
	public int moveCommand() {
		System.out.println("\tNormal Behaviour: if find another robot ignore it");
		return 0;
	}

}
