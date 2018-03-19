package com.cdc.mitrais.abstraction_ones;

public class OuterDemo {
	
	private int num;

	static class StaticNestedDemo{
		
		public void printFromStaticNestedClass(){
			System.out.println("This is came from static nested class");
		}
	}
	
	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void myMethod(){
		final int count = 23;
		
		class InnerLocalClass{
			public void print(){
				System.out.println("This is came from Local Inner Class...");
			}
			
			public int getCount(){
				return count;
			}
		}
		
		InnerLocalClass innerLocalClass = new InnerLocalClass();
		innerLocalClass.print();
	}
	
	public class InnerDemo{
		public void print(){
			System.out.println("This is an inner class");
		}
		
		public int getNum(){
			System.out.println("This is getnum method from inner class");
			return num;
		}
	}
	
	public void displayInner(){
		InnerDemo innerDemo = new InnerDemo();
		innerDemo.print();
	}

}
