package Lesson5;
import java.util.*;
public class LogicOperators {

	public static void main(String[] arrgs) {
		
		int num = 10;
		switch(num) {
			case 10:
				System.out.println("variable is 10");
				break;
			case 20:
				System.out.println("variable is 20");
				break;
			case 80:
				System.out.println("variable is 80");
				break;
				default:
					System.out.println("variable is something else");
		}
		
		
		
		// ==egual to	x==y
		//!=not equal	x!=y
		//> greater than	x>y
		//< less		x<y
		//>=greater than or equal	x>=y
		//<= less than or equal	x<=y
		
		// && logical and return true if both statements are true	x<5 && X<10
		// || logical or return true if one of the statement is true	x<5||x<10
		//! logical not reverse the result, return false if the result is true !(x<5 && x<10) 
		
		boolean isEven = true;
		if(!isEven) {
			System.out.println("boolean is" + isEven);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Please");
		int age = sc.nextInt();
	
		if(age <18) {
			if(age>= 10 && age<=15) {
				System.out.println("Thats teenage");
			}else if (age >=16 && age <=18) {
			System.out.println("Thats grown teenage");	
			}else {
				System.out.println("Its a child");
			}
			
		
		
		}else if (age==20 || (age> 21 && age<99)) {
			System.out.println("Thats");
		}else {
			if(age >=100) {
				System.out.println("Ņo one lives that long");
			}
				
			System.out.println("Update your logic");
		}
	}
}
