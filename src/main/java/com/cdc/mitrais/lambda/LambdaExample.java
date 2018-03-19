package com.cdc.mitrais.lambda;

import java.util.Map;

public class LambdaExample implements IChat{

	private Map<String,String> phoneNumber;
	
	public LambdaExample(){
		
	}
	
	@Override
	public void getMessage(IMessage message) {
		System.out.println("The Message is:"+message.greet());
	}

	@Override
	public void sendMessage(IMessage message) {
		displayMessage(message.greet());
	}
	
	public void displayMessage(String message){
		System.out.println("The message is:"+message);
	}

	public Map<String,String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Map<String,String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
