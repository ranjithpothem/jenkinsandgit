package com.example;

public class FuzzBuzz {
	
	public String play(int number) {
		
		if(number%3==0) return "Fuzz";
		if(number%5==0) return "Buzz";
		
		return String.valueOf(number);
	}
	public void hello() {
		
	}

}
