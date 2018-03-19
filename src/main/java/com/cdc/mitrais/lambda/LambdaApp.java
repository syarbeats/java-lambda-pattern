package com.cdc.mitrais.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaApp{

	public static void main(String[] args) {
		
		LambdaExample lambda =  new LambdaExample();
		lambda.getMessage(new IMessage(){

			@Override
			public String greet() {
				
				return "Hello Everyone";
			}
			
		});
		
		/**************************************************
		 * Lambda to access Class Member
		 * ************************************************/
		lambda.getMessage(()->"Hello Lambda");
		
		Runnable runnable1 = new Runnable(){

			@Override
			public void run() {
				System.out.println("This is runnable without lambda");
			}
			
		};
		
		Runnable runnable2 = ()->System.out.println("This is runnable with lambda");
		
		runnable1.run();
		runnable2.run();
		
		
		/*************************************************
		 * Lambda to access Map data
		 *************************************************/
		Map<String,String> phoneNumber = new HashMap<String,String>();
		phoneNumber.put("John Lennon", "0987233784");
		phoneNumber.put("Paul McCartney", "05289700230");
		phoneNumber.put("Ringgo Star", "082736648900");
		
		phoneNumber.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
		
		
		/*************************************************************************
		 * Lambda for comparing
		 *************************************************************************/
		
		List<Person> personList = Person.createShortList();
		System.out.println(".............Before sorting.............");
		
		for(Person person : personList){
			person.printName();
		}
		
		/* Old sytle - comparing using Inner Class*/
		Collections.sort(personList, new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {	
				
				return o1.getSurName().compareTo(o2.getSurName());
			}
			
		});
		
		System.out.println(".............After sorting.............");
		for(Person person : personList){
			person.printName();
		}
		
		/*************************************************************
		 * JAVA 8 Style using Lambda
		 * ***********************************************************/
		System.out.println("Sorting using Lambda Ascending");
		Collections.sort(personList, (Person p1, Person p2) -> p1.getSurName().compareTo(p2.getSurName()));
        
		for(Person p : personList){
			p.printName();
		}
		
		System.out.println("Sorting using Lambda Descending");
		Collections.sort(personList, (p1, p2) -> p2.getSurName().compareTo(p1.getSurName()));
        
		for(Person p : personList){
			p.printName();
		}
		
		Predicate<Person> allDrivers = p -> p.getAge() >= 60;
		RoboContactLambda robo = new RoboContactLambda();
		robo.phoneContacts(personList, allDrivers);
		
		System.out.println("All Pilots Search Criteria");
		robo.phoneContacts(personList, SearchCriteria.getInstance().getCriteria("allPilots"));
		
		/**************************************************************
		 *JAVA 8 Lambda Type Inference 
		 *************************************************************/
		BiFunction<Integer, Integer, Integer> summer = (number1, number2) -> {return number1 + number2;};
		
		Integer number1 = 11;
		Integer number2 = 15;
		
		System.out.println("Number1:"+number1+" and Number2:"+number2+" The result is:"+summer.apply(number1, number2));
		
		/****************************************************************************
		 * JAVA 8 LAMBDA SCOPE
		 ***************************************************************************/
		final String salutation = "Holla Bonjors";
		GreetingService greeting = message -> System.out.println(salutation + message);
		greeting.sayMessage(" Bondiaz");
		
		/***************************************************************************
		 * JAVA.UTIL.FUNCTION
		 ***************************************************************************/
		for(Person person : personList){
			System.out.println(person.printCustom(p -> "Name: "+ p.getGivenName() + " EMail: " + p.geteMail()));
		}
		
		Function<Person, String> westernStyle = p -> {
			return "\nName: " + p.getGivenName() + " " + p.getSurName() + "\n" +
					              "Age: " + p.getAge() + "  " + "Gender: " + p.getGender() + "\n" +
					             "EMail: " + p.geteMail() + "\n" + 
					              "Phone: " + p.getPhone() + "\n" +
					              "Address: " + p.getAddress();
			
		};
		
		System.out.println("\n===Western List===");
		for (Person person:personList){
			System.out.println(
					person.printCustom(westernStyle)
		    );
		}
		
		/**************************************************************
		 * JAVA 8 DEFAULT METHOD
		 *************************************************************/
		for(Person p: personList){
			p.log("APP-ONE");
		   
		}
		
		

		
	}
	
	interface BiFunction<K,V,R>{
		R apply(K k, V v);
	}
	
	interface GreetingService{
		void sayMessage(String message);
	}

	}
