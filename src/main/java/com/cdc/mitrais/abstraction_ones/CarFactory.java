package com.cdc.mitrais.abstraction_ones;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class CarFactory {
	
	private static HashMap m_RegisteredProducts = new HashMap();
	private static CarFactory instance = new CarFactory();
	
	public static CarFactory getInstance(){
		return instance;	
	}
	
	public void registerProduct(String productID, Class productClass){
		m_RegisteredProducts.put(productID, productClass);
	}
	
	public static AsianCar produceCar(String productID) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		Class CarProduct = (Class) m_RegisteredProducts.get(productID);
		Constructor productConstructor = CarFactory.class.getDeclaredConstructor(new Class[] { String.class });
		
		return (AsianCar)productConstructor.newInstance(new Object[] {AsianCar.class});
	}
}
