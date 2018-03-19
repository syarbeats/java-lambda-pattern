package com.cdc.mitrais.abstraction_ones;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class InnerClassTest {

	static OuterDemo outerDemo;
	static OuterDemo.InnerDemo innerDemo;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		outerDemo = new OuterDemo();
		setNum(15);
		innerDemo = outerDemo.new InnerDemo();
				
	}

	@Test
	public void testGetNumOuterClass() {
		System.out.println("-----Outer Class Getnum-------");
		assertEquals(15, outerDemo.getNum());
	}

	@Test
	public void testGetNumInnerClass() {
		System.out.println("-----Inner Class Getnum-------");
		assertEquals(15, innerDemo.getNum());
	}
	
	@Test 
	public void testAnonymousClass(){
		AnonymousInnerClass anonymousClass =  new AnonymousInnerClass(){

			@Override
			public void printSomething() {
				System.out.println("This is from anonymous class testing");
				
			}

			@Override
			public void setCount(int count) {
				this.count = count;
				
			}

			@Override
			public int getCount() {
				
				return this.count;
			}
			
		};
		
		anonymousClass.setCount(101);
		assertEquals(101,anonymousClass.getCount());
	}
	
	public static void setNum(int num) {
		outerDemo.setNum(num);
	}

}
