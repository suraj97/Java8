package com.quinnox.Java8;
import java.util.*;
public class LambdaIterationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("lemon");
		fruits.add("orange");
		
		System.out.println("==== Classic enhanced for loop====");
		
		for(String afruit : fruits)
		{
			System.out.println(afruit);
		}
		System.out.println("\n=== Lambda Expression====");
		fruits.forEach(s -> System.out.println(s));
	}

}
