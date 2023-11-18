package com.lambda.program;

@FunctionalInterface
public interface Calculator{

	//void switchOn();
	int subsTraction(int a,int b);

	
}

 class CalculatorImpl{
	
	 
	 public static void main(String[] args) {
		
	//Calculator calculator=()->System.out.println("Switch On Mobile");
	//calculator.switchOn();
		
	Calculator calculator1=(a,b)-> a-b;
	System.out.println(calculator1.subsTraction(55, 4));
		 
	}
	
}
