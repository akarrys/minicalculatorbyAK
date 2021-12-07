package main;

import java.util.*;

import calculations.CalculatorMethods;


/*
 * A java program to act as a simple calculator.
 * Author: AK
 */

public class MyCalculator {
	public static double one; //static fields
	public static double two;
	public static char symbol;
	

	


	public static void main(String[] args) { //main start of program
		Scanner keyboard = new Scanner(System.in); //scanner object declared and ready
		System.out.println("AK's mini calculator");
		
		
		System.out.println("Please type the fist number: "); //asks user for first number
		 one = keyboard.nextDouble(); //store user input first double num
		
		System.out.println("Please type the second number: ");
		 two = keyboard.nextDouble(); //store user input double num 
		
		System.out.println("Please type what operator you would like to use.ex...+,-,*,/");
		 symbol = keyboard.findWithinHorizon(".", 0).charAt(0); //finds what user will enter after one blank string pattern
		
		 
		 if (symbol == '+') {
			 CalculatorMethods.getAddition(one, two); //call to static method addition
		 }
		 if(symbol == '-') {
			CalculatorMethods.getSubtraction(one, two); //call to static method subtraction
		 }
		 if(symbol == '*') {
			 CalculatorMethods.getMultiplication(one, two); //call to static method multiplication 
		 }
		 if(symbol == '/') {
			 CalculatorMethods.getDivision(one, two); //call to static method division
		 }
		
		
	}
	 
}
