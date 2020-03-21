package Lesson5;
/*
 SmartNumberApp use instantiable class to determine the properties of some number entered by user
 
 */
import java.util.*;
public class SmartNumberApp {

	private static void main(String[]args) {
	int n;
	
	boolean property;
	SmartNumber number = new SmartNumber();
	Scanner myScanner = new Scanner (System.in);
	System.out.println("Please enter an integer");
	n = myScanner.nextInt();
	
	property = number.isNumberEven(n);
	System.out.println("is "+ n + "even?" + property);
	
	
	
}
}
