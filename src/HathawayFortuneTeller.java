
import java.util.Scanner;

public class HathawayFortuneTeller {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		
		System.out.println("What is your age?");
		int age = input.nextInt();
		
		System.out.println("In which month (XX) were you born?");
		int birthMonth = input.nextInt();
		
		input.nextLine();
		
		System.out.println("What is your favorite ROYGBIV color? If you're unclear on what \"ROYGBIV\" means, type \"Help\"");
		String favoriteColor = input.nextLine().toString();
		
		if (favoriteColor.contentEquals("Help")) {
			System.out.println("ROYGBIV stands for red, orange, yellow, green, blue, indigo, and violet. Which of these is your favorite color?");
			favoriteColor = input.nextLine();
		}
		
		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();
		
		//Even/Odd age --> time being experimented upon//
		
		int waitTime;
		if (age % 2 == 0) {
			waitTime = 7;
		}
		else {
			waitTime = 34;
		}

		// Siblings --> passengers Code//	
		
		String passengers;
	
		switch(siblings) {
		case 0:
			passengers = "with 7 other humans";
			break;
		case 1:
			passengers = "along with a stray dog, a duck, and an earthworm";
			break;
		case 2:
			passengers = "despite their best efforts to fight them off";
			break;
		case 3:
			passengers = "along with an asortment of farm animals";
			break;
		default:
			passengers = "with some farm animals";
		}
		
		if (siblings > 3) {
			passengers = "with their best friend";
		}
		
		if (siblings < 0) {
			passengers = "all alone";
		}
	
		
		
		//Favorite Color --> planet Code//

		String planet;
		switch(favoriteColor.toLowerCase())  {
		case "red":
			planet = "Mercury";
			break;
		
		case "orange":
			planet = "Venus";
			break;
		
		case "yellow":
			planet = "Mars";
			break;
			
		case "green":
			planet = "Jupiter";
			break;
			
		case "blue":
			planet = "Saturn";
			break;
			
		case "indigo":
			planet = "Uranus";
			break;
			
		case "violet":
			planet = "Neptune";
			break;
			
		default:
			planet = "Ganymede";
			break;
		}
		
			
		//Birth Month --> fate Code//
		String fate;
		
		if (birthMonth < 4) {
			fate = "be put in a human zoo";
		} 
		
		else if (birthMonth < 8) {
			fate = "be given lukewarm tea";
		}
		
		else if (birthMonth <= 12) {
			fate = "be given to young aliens as a plaything";
		}
		else {
			fate = "be disintigrated";
		}
		
		input.close();
		
		System.out.println(firstName + " " + lastName + " will be abducted by aliens, " + passengers + ". They will be taken to " + planet + ", where they will " + fate + " after " + waitTime + " years of being experimented upon.");
		}
	}


	


