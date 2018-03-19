package com.cdc.mitrais.abstraction_ones;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class App 
{
    public static void main( String[] args )
    {
    	/*-----------------------------------------------------------------------
    	 * ABSTRACT CLASS
    	 *-----------------------------------------------------------------------*/
    	
    	Salary salary = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 10, 3600.00);
    	Employee employee =  new Salary("John Adams", "Boston, MA", 2, 3,2400.00);
    	System.out.println("Call mailCheck using Salary reference --");
    	salary.mailCheck();
    	salary.toString();
    	salary.getBonus();
    	System.out.println("Employee name:" +salary.getName());
    	System.out.println("Call mailCheck using Employee reference --");
    	employee.mailCheck();
    	employee.toString();
    	System.out.println("Employee name:" +employee.getName());
    	OuterDemo outerDemo =  new OuterDemo();
    	outerDemo.setNum(10);
    	System.out.println("OuterDemo:"+outerDemo.getNum());
    	outerDemo.displayInner();
       
       /*--------------------------------------------------
        * INNER CLASS
        * -----------------------------------------------*/       
       OuterDemo.InnerDemo innerDemo = outerDemo.new InnerDemo();
       System.out.println(innerDemo.getNum());
       
       /*-------------------------------------------------
        * LOCAL INNER CLASS
        * -----------------------------------------------*/
       	outerDemo.myMethod();
       
       /*-----------------------------------------------
        * ANONYMOUS CLASS
        * ----------------------------------------------*/
       	
       	AnonymousInnerClass anonymousClass =  new AnonymousInnerClass(){

			@Override
			public void printSomething() {
				System.out.println("This is came from Anonymous Class......");
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
       	anonymousClass.setCount(202);
       	System.out.println("Value from anonymous class:"+anonymousClass.getCount());
       	
       	employee.displayMessage(new Message(){

			@Override
			public String greet() {
				
				return "Hello";
			}
       		
       	});
       	
       	/************************************************************************
       	 * Enum
       	 ********************************************************************** */
       	employee.getAllCars();
       	
       	/**********************************************************************
       	 * Collection
       	 * **********************************************************************/
       	List<String> listProject = new ArrayList<String>();
       	listProject.add("Customer POS");
       	listProject.add("FFP");
       	listProject.add("Mobile WMS");
       	listProject.add("Project Monitoring Tool");
       	
       	employee.setListProject(listProject);
       	
       	Iterator<String> iterator = employee.getListProject().iterator();
       	
       	while(iterator.hasNext()){
       		System.out.println("The lis of Project is:"+iterator.next());
       	}
       	
       	/*String project = employee.getListProject().get(0);*/
       	
       	Map<String, String> phoneNumber = new HashMap<String, String>();
       	phoneNumber.put("John Lennon", "085287234293");
       	phoneNumber.put("Paul McCartney", "0982312933");
       	phoneNumber.put("Goerge Harisson", "0832784577");
       	phoneNumber.put("Ringgo Star", "0856029345");
       	
       	employee.setPhoneNumber(phoneNumber);
       	
       	Map<String, String> phoneNumberMap = new HashMap<String, String>();
       	phoneNumberMap = employee.getPhoneNumber();
       	
       	Iterator<Entry<String,String>> iteratorMap = phoneNumberMap.entrySet().iterator();
       	
       	while(iteratorMap.hasNext()){
       		System.out.println("Name: "+iteratorMap.next().getKey()+" Phone Number: "+iteratorMap.next().getValue());
       	}
       	
       	System.out.println("---------Java 8 Sytle-----");
       	phoneNumberMap.forEach((k,v)->System.out.println("Key:"+k+" Value:"+v));
       	
       	/*employee.getPhoneNumber().get(key);*/
       	
       	/*System.out.println("\nExample 2...");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

		// weired, but works anyway, not recommend!
		System.out.println("\nExample 3...");
		for (Object key : map.keySet()) {
			System.out.println("Key : " + key.toString() + " Value : " + map.get(key));
		}

		//Java 8 only, forEach and Lambda. recommend!
		System.out.println("\nExample 4...");
		map.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));*/
       	
       	Set<String> setA = new HashSet<String>();
        /*FILO*/
       	setA.add("element 0");
       	setA.add("element 1");
       	setA.add("element 2");

       	//access via Iterator
       	Iterator<String> iteratorSet = setA.iterator();
       	while(iteratorSet.hasNext()){
       	  String element = iteratorSet.next();
       	  System.out.println("Element: "+ element);
       	}


       	//access via new for-loop
       	for(Object object : setA) {
       	    String element = (String) object;
       	    System.out.println("Element: "+ element);
       	}
       	
       	Queue<String> queue = new LinkedList<String>();
       	queue.add("John Lennon");
       	queue.add("Paul McCartney");
       	queue.add("Goerge Harisson");
       	queue.add("Ringgo Star");
       	
       	for(String name : queue){
       		System.out.println("Queue:"+name);
       	}
       	
       	System.out.println("Process Customer: "+ queue.poll());
       	
       	System.out.println("-------The Last Queueing-----------");
       	for(String name : queue){
       		System.out.println("Queue:"+name);
       	}
       	
       	//StackClass stackClass = new StackClass();
       	
       	Stack<Integer> stack = new Stack<Integer>();
        
       	StackClass.stack_push(stack);
       	StackClass.stack_pop(stack);
       	StackClass.stack_push(stack);
       	StackClass.stack_peek(stack);
       	StackClass.stack_search(stack, 2);
       	StackClass.stack_search(stack, 6);
       	
       	List<Salary> employeeList = new ArrayList<Salary>();
       	employeeList.add(new Salary("Richard max", "Ambehta, UP", 3, 10, 6600.00));
       	employeeList.add(new Salary("Keith Richard", "FastTech Inc", 2, 11, 5600.00));
       	employeeList.add(new Salary("Brian Jones", "Tempura Tech", 1, 12, 4000.00));
       	employeeList.add(new Salary("Mick Jagger", "Union Tech", 4, 13, 4500.00));
       	employeeList.add(new Salary("Billy Joel", "Living Tech", 5, 14, 3000.00));
       	
       	List<Salary> higherSalary = employeeList.stream().filter(e -> e.getSalary() > 4000).collect(Collectors.toList());
       	
       	for(Salary employeeWithHighSalary : higherSalary){
       		System.out.println("The employee with salary more than $4000 is:"+employeeWithHighSalary.getName());
       	}
       	
       	/*Collections.sort(List);
       	Collections.reverse(List);*/
       	
       	/*persons.removeIf(p -> p.getAge() <= 16);*/
       	/*List<Person> beerDrinkers = select(persons, having(on(Person.class).getAge(),
          greaterThan(16)));*/
       	
        Map<Integer, String> HOSTING = new HashMap<>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, "aws.amazon.com");

        String result = "";
        for (Map.Entry<Integer, String> entry : HOSTING.entrySet()) {
            if ("aws.amazon.com".equals(entry.getValue())) {
                result = entry.getValue();
            }
        }
        System.out.println("Before Java 8 : " + result);

		//Map -> Stream -> Filter -> String
        result = HOSTING.entrySet().stream()
                .filter(map -> "aws.amazon.com".equals(map.getValue()))
                .map(map -> map.getValue())
                .collect(Collectors.joining());

        System.out.println("With Java 8 : " + result);

       	/*
       	 * 	Map<Integer, String> HOSTING = new HashMap<>();
	        HOSTING.put(1, "linode.com");
	        HOSTING.put(2, "heroku.com");
	        HOSTING.put(3, "digitalocean.com");
	        HOSTING.put(4, "aws.amazon.com");
       	 *  Map<Integer, String> collect = HOSTING.entrySet().stream()
                .filter(map -> map.getKey() == 2)
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
       	 * */
        
        /*
         *  List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        	Person result1 = persons.stream()                        // Convert to steam
            .filter(x -> "jack".equals(x.getName()))        // we want "jack" only
            .findAny()                                      // If 'findAny' then return found
            .orElse(null);                                  // If not found, return null
			System.out.println(result1);
         * */
        
        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        Person result1 = persons.stream()
                .filter((p) -> "jack".equals(p.getName()) && 20 == p.getAge())
                .findAny()
                .orElse(null);

        System.out.println("result 1 :" + result1.getName());

        //or like this
        Person result2 = persons.stream()
                .filter(p -> {
                    if ("jack".equals(p.getName()) && 20 == p.getAge()) {
                        return true;
                    }
                    return false;
                }).findAny()
                .orElse(null);

        System.out.println("result 2 :" + result2.getName());
        
        
        /******************************************************************
         * DESIGN PATTERN SINGLETON
         ******************************************************************/
        SingletonClass.getInstance().printSomething();
        employee.getMessage();
        SingletonClassV2.getInstance().getMessage();
        
        /****************************************************************
         * DESIGN PATTERN FACTORY
         * ***************************************************************/
       try {
    	   AsianCar coronaAbsolute = CarFactory.getInstance().produceCar("CARID1");
    	   System.out.println("Corona Absolute Engine:"+coronaAbsolute.getEngineName());
    	   
		} catch (NoSuchMethodException e1) {
			
			e1.printStackTrace();
		} catch (SecurityException e1) {
			
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			
			e1.printStackTrace();
		}
	    }
}
