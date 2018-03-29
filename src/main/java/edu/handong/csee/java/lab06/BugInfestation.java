package edu.handong.csee.java.lab06;

import java.util.Scanner;
public class BugInfestation {
	
	final double ONE_BUG_VOLUME = 0.002;
	final double GROWTH_RATE = 0.95;
	
	public static void main(String[] args) {

		double houseVolume, startPopulation;
		int countWeeks;
		
		Scanner keyboard = new Scanner (System.in);
		BugInfestation myBugInfestation = new BugInfestation(); // instantiation
		
		System.out.print("Enter the total volum of your house in cubic feet: ");
		houseVolume = keyboard.nextDouble();
		System.out.print("Enter the estimated number of roaches in your house: ");
		startPopulation = keyboard.nextDouble();
		
		myBugInfestation.calculateRoach(houseVolume, startPopulation);
	}
	
	public void calculateRoach(double houseVol, double startPopul){
		
		Scanner myScanner = new Scanner (System.in);
		double houseVolume = houseVol;
		double startPopulation = startPopul;
		double population = startPopulation;
		double totalBugVolume = population * ONE_BUG_VOLUME;
		
		int countWeeks = 0;
		
		while(totalBugVolume < houseVolume)
		{
			double newBugs = population * GROWTH_RATE;
			double newBugVolume = newBugs * ONE_BUG_VOLUME;
			population = population + newBugs;
			totalBugVolume = totalBugVolume + newBugVolume;
			countWeeks = countWeeks+1;
		}
		
		System.out.println("\nStarting with a roach population of " + startPopulation);
		System.out.println("and a house with a volume of "+ houseVolume + " cubic feet,");
		System.out.println("after " + countWeeks + " weeks,");
		System.out.println("the house will be filled with "+ houseVolume + " roaches.");
		System.out.println("They will fill a volume of "+ totalBugVolume + " cubic feet.");
		System.out.println("Better call Debugging Experts Inc.");
		
	}

}
