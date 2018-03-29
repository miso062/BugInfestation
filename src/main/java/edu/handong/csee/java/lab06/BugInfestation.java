package edu.handong.csee.java.lab06;

//Insert scanner
import java.util.Scanner;

/**
 * Class BugInfestaion
 * 
 * There are two final double, one bug volume and growth rate
 * and one method, calculate total bug's volume and bug's number.
 * 
 * This program gets house volume and start population of bugs from user
 * and prints total volume of bugs, total population of bugs,
 * and how many weeks have passed until the house was filled with roaches.
 * 
 * @author smile
 * 
 */
// Define Class
public class BugInfestation {
	
	// Define constant number
	final double ONE_BUG_VOLUME = 0.002; // one bug's volume
	final double GROWTH_RATE = 0.95; // bug's increasing rate in one week
	
	/**
	 * Main program
	 * 
	 * Get the house volume and starting number of bugs from user
	 * and call method myBugInfestation to know total volume of bugs, total number of bugs
	 * and how many weeks have passed until the house was filled with roaches. 
	 *  
	 * @param args
	 */
	// Define main
	public static void main(String[] args) {

		// Insert double variable to get house volume and starting number of bugs.
		double houseVolume, startPopulation;
		// Insert integer variable to count the week when the house is full of roaches.
		int countWeeks;
		
		// Create an object of the Scanner
		Scanner keyboard = new Scanner (System.in);
		// Instantiate an object of class BugInfestation
		BugInfestation myBugInfestation = new BugInfestation(); // instantiation
		
		// Use the print to get the house volume.
		System.out.print("Enter the total volume of your house in cubic feet: ");
		// Use scanner object(keyboard) to enter the next number as houseVolume
		houseVolume = keyboard.nextDouble();
		// Use the print to get the starting number of roaches.
		System.out.print("Enter the estimated number of roaches in your house: ");
		// Use scanner object(keyboard) to enter the next number as startPopulation
		startPopulation = keyboard.nextDouble();
		
		// Call the method myBugInfestation
		myBugInfestation.calculateRoach(houseVolume, startPopulation);
	}
	
	/**
	 * Method that get the houseVol and startPopul from the main variable,
	 * calculate the population of the roach in house and total bus's volume and how many weeks have passed until the house was filled with roaches,
	 * and print the result 
	 * 
	 * @param houseVol represent the house volume user want!
	 * @param startPopul represent the starting number of roach!
	 */
	public void calculateRoach(double houseVol, double startPopul){

		// Put the variable houseVol(main variable) in main into the variable houseVolume.
		double houseVolume = houseVol;
		// Put the variable startPopul(main variable) in main into the variable startPopulation.
		double startPopulation = startPopul;
		// Put the variable startPopulation in main into the variable population.
		double population = startPopulation;
		// Total bug's volume is multiply population by ONE_BUG_VOLUME(one bug's volume)
		double totalBugVolume = population * ONE_BUG_VOLUME;
		
		// Insert integer variable to count the week when the house is full of roaches.
		int countWeeks = 0;
		
		// The loop statement that calculate the population, totalBugVolume, and countWeeks
		while(totalBugVolume < houseVolume)
		{
			// Insert double variable and put the population*GROWTH_RATE into newBugs. 
			double newBugs = population * GROWTH_RATE; // represent the growing numbers of roach
			// Insert double variable and put the nuwBugs*ONE_BUG_VOLUME into nuwBugVolume
			double newBugVolume = newBugs * ONE_BUG_VOLUME; // represent the newBug's volume.
			// Set the population to population + newBugs.
			population = population + newBugs;
			// Set the totalBugVolume to totalBugVolume + newBugVolume
			totalBugVolume = totalBugVolume + newBugVolume;
			// One loop statement means passing one week, so finishing point the loop statement add one to countWeek
			countWeeks = countWeeks+1;
			
			// Shows the decimal point of the double variable totalBugVolume up to the zero point.
			totalBugVolume = Double.parseDouble(String.format( "%.0f" , totalBugVolume));
			// Shows the decimal point of the double variable population up to the zero point.
			population = Double.parseDouble(String.format("%.0f", population));
		}


		// print the result of calcuateRoach.
		System.out.println("\nStarting with a roach population of " + startPopulation);
		System.out.println("and a house with a volume of "+ houseVolume + " cubic feet,");
		System.out.println("after " + countWeeks + " weeks,");
		System.out.println("the house will be filled with "+ population + " roaches.");
		System.out.println("They will fill a volume of "+ totalBugVolume + " cubic feet.");
		System.out.println("Better call Debugging Experts Inc.");
		
	}

}
