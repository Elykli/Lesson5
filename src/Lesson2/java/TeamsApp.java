package Lesson2.java;
/*
Problem 3
        You have been asked to develop a java application
        to allow to enter the number of Students can hit in the group. The application
        should then calculate and display how many Students can be filled  in the Team and how
        many Students have left over.
        Your application should use instantiable classes to separate the calculations from the user input and output.
        TeamsApp.java
        -- takes input from the user
        -- uses the Teams -- the instantiable class to perform the actual computations
*/
import java.util.Scanner;
public class TeamsApp{
    public static void main(String[] args){
        // declare local variables
    	int numberStudents = 0;
    	int teamSize = 0;
        //declare a variable called input and create an object of type Scanner
    	Scanner sc = new Scanner(System.in);
    	Team myTeams = new Team();	
        // declare a variable called myTeams to be able to work with an object of type Teams and create an object of type Teams
        System.out.println("Please enter the number of students: ");
        numberStudents = sc.nextInt();
        System.out.println("Please enter the size of the groups: ");
        teamSize = sc.nextInt();
    	//input "Please enter the number of students: "
        //input "Please enter the size of the groups: "
        myTeams.setNumOfStudents(numberStudents);
        myTeams.setTeamSize(teamSize);
        myTeams.calculateTeams();
        //process
      
        int numberOfTeams;
		//int numTeams = myTeams.getNumberOfTeams(numberOfTeams);
      
		int remmainings;
		//int rem = myTeams.getRemmainigs(remmainings);
        //output of getNumOfTeams, getRemmainigs
		
     //  System.out.println("The number of teams of "+teamSize+" from a group of "
    //           + numberStudents+" will be "+numTeams+" teams with "+rem+" left over");
    }
}

