package Lesson5;
/*
SmartNumber.java cumputes property value of number
 */

public class SmartNumber {

	
	//declare an empty constructor
	public SmartNumber() {
		System.out.println("Starting the app");
		System.out.println("");
	}
	
	//compute whether the number is even. Return true if the number is even, otherwise returns false
	public boolean isNumberEven(int number) {
		//declare a variable to store whether the number is even
		boolean isEven= false;
		int remainder = number%2;
		//return isEven;
		
		if (remainder ==0) {
			isEven =true;
		}
		return isEven;
		
		
	}
}
