package Lesson2.java;
/*
Problem 3
        You have been asked to develop a java application
        to allow to enter the number of Students can hit in the group. The application
        should then calculate and display how many Students can be filled  in the Team and how
        many Students have left over.
        Your application should use instantiable classes to separate the calculations from the user input and output.
        Teams.java
        -- takes input from the user
        -- uses the Teams -- the instantiable class to perform the actual computations
        hint is in the TeamsApp.java System.out.println
*/

    

public class Team {
//declare data members
	private int numberStudents;
	private int teamSize;
	private int numberOfTeams;
	int remmainings;
	
    //constructor
	public Team() {
	
		
	}
    //constructor taking in two parameters numberStudents, teamSize
	public void setNumOfStudents( int numberStudents) {
		this.numberStudents = numberStudents;
	}
    //setters for setNumOfStudents and setTeamSize
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
    
	//compute method
	
	public int getNumberOfTeams(int numberOfTeams  ) {
		return numberOfTeams;
		//getters for getNumOfTeams and getRemmainigs
	}
	public int getRemmainigs(int remmainings) {
		return remmainings;
	}
	public void calculateTeams() {
		numberOfTeams = numberStudents / teamSize;
		remmainings = numberStudents%teamSize;
	}
} 
