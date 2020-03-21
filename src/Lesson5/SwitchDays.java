package Lesson5;
/** Home Work:
Write an application that prompts a student to input a day of the week, and then it will display whether there are classes scheduled for that day.
Day        Message
Monday:	Evening classes at 19:00
Tuesday:   No classes
Wednesday:	Evening classes at 19:00
Thursday:  No classes
Friday:	No classes
Saturday:	Whole day Labs :)
Sunday:	It's finally Sunday! : default:   check your input mate/fella/gal
*/
import java.util.*;
public class SwitchDays {
   public static void main(String args[]) {
       // declare a variable 
	   String day;
	    
       // create a Scanner object to read input from the keyboard
	   Scanner sc = new Scanner(System.in);
	   
       // prompt the user to enter a day of the week
       System.out.println("Please enter a day of the week to see whether there are any classes scheduled for that day");
       
       // read the string provided by the user
       day = sc.next().toLowerCase();
       
       switch (day) {
//note: a switch statement accepts a constant expression/variable of type String only starting with Java version 7; in earlier versions the compiler shows an "incompatible types" error.
           case "monday":
               System.out.println("Evening classes at 19:00");
               break;
               
           case "tuesday":
               System.out.println("No classes");
               break;
               
           case "wednesday":
               System.out.println("Evening classes at 19:00");
               break;
               
           case "thursday":
               System.out.println("No classes");
               break;
               
           case "friday":
               System.out.println("No classes");
               break;
               
           case "saturday":
               System.out.println("Whole day Labs :)");
               break;
               
           case "sunday":
               System.out.println("It's finally Sunday!");
               break;
               
               default: 
               System.out.println("Unknown input");
               break;
       }
   }
}

