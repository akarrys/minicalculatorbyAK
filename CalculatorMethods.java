package calculations;
import java.util.*;
import main.MyCalculator;

public class CalculatorMethods extends MyCalculator { //Mycalculator is able to use this class
	public static double sum; //sum is usable to all methods 

  


public static double getAddition(double one, double two) { //addition method
	
	if (symbol == '+') { //does addition method based on what user answers in char
		sum = one + two; //user input double one and user input double two
		System.out.println(sum); //print addition of a and b 
		
	} 
	 return sum; //returns sum
	
	

	
 }

public static double getSubtraction(double one, double two) { //subtraction method
	if (symbol == '-') { //does subtraction method based on what user answers in char
		sum = one - two; // user inputs
	   System.out.println(sum); //prints subtraction of one-two
	}
	 return sum; //return sum
	 
}


public static double getMultiplication(double one, double two) { //multiplication method
	if(symbol == '*') { //does multiplication method on what user answers in char
		sum = one * two; //user inputs
		System.out.println(sum); //prints multiplication of one and two
	} 
	 return sum;
}


public static double getDivision(double one, double two) { //Division method
	if(symbol == '/' && two != 0) { //does Division based on what user answers in char
		sum = one / two; //user inputs
		System.out.println(sum); //prints division of one and two
	}
	 return sum;
}

}