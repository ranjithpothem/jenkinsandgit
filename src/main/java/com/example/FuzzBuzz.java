package com.example;

public class FuzzBuzz {
	
	public String play(int number) {
		
		if(number%3==0) return "Fuzz";
		if(number%5==0) return "Buzz";

		hello();
		return String.valueOf(number);
	}
	public static void hello() {
		System.out.println("hello");
	}

}
