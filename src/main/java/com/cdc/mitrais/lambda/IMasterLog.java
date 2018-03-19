package com.cdc.mitrais.lambda;

public interface IMasterLog {
	
	public void writeLog(String log);
	
	default void log(String log){
		System.out.println("This is the log:"+log);
	}
	
	public static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}
