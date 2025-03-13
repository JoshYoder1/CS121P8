//Main.java
import java.util.*;

public class Main{
	public static void main(String[] args) {
		boolean keepGoing = true;
		while (keepGoing){
			Scanner input = new Scanner(System.in);
			System.out.println("0) Exit");
			System.out.println("1) Human Guesser");
			System.out.println("2) Computer Guesser");
			System.out.print("Please enter 0-2: ");
			String choice = input.nextLine();
			System.out.println(" ");
			if(choice.equals("0")){
				System.out.println("Goodbye!");
				keepGoing = false;
			}//end if
			else if(choice.equals("1")){
				humanGuesser(input);
			}//end elif
			else if(choice.equals("2")){
				computerGuesser(input);
			}//end elif
			else{
				System.out.println("!!!INVALID CHOICE!!!");
			}//end else
		}//end while
		//input.close();
	}//end main
	
	public static void humanGuesser(Scanner input){
		System.out.println("human guesser");
		int answer = (int)(Math.random() * 101);
		boolean keepGoing = true;
		int guess;
		int counter = 1;
		while (keepGoing){
			try{
			System.out.print(counter + ") Please enter a number: ");
			guess = Integer.parseInt(input.nextLine());
			if(guess == answer){
				System.out.println("got it!");
				keepGoing = false;
				System.out.println();
			}//if
			else if(guess == 00){
				System.out.println(" ");
				keepGoing = false;
			}//end elif
			else if(guess < answer){
				System.out.println("too low...");
			}//end if
			else if(guess > answer){
				System.out.println("too high...");
			}//end if
			else {
				System.out.println("Invalid Answer");
			}// end else
			counter = counter + 1;
			} catch (Exception e){
			System.out.println("!!!INVALID ANSWER!!!");
			}//end catch
		}// end while
	}//end humanGuesser

	public static void computerGuesser(Scanner input){
		System.out.println("computer guesser");
		int guess = 50;
		boolean keepGoing = true;
		int upper = 100;
		int lower = 1;
		int counter = 1;

		while(keepGoing){
			guess = getMedian(upper, lower);
			System.out.println(counter + ") I guess " + guess);
			System.out.print("Too (H)igh, Too (L)ow, (C)orrect: ");
			String result = input.nextLine();
			if(result.equals("H") || result.equals("h")){
				upper = guess;
				counter = counter + 1;
			}//end if
			else if(result.equals("L") || result.equals("l")){
				lower = guess;
				counter = counter + 1;
			}//end elif
			else if(result.equals("C") || result.equals("c")){
				keepGoing = false;
			}//end elif
			else{
				System.out.println("INVALID CHOICE");
			}//end else
		}//end while
		System.out.println(" ");
	}// end computerGuesser

	public static int getMedian(int upper, int lower){
		System.out.println("Getting Guess...");
		int guess = upper + lower;
		guess = guess / 2;
		guess = Math.round(guess);
		return guess;
	}//end getMedian
}//end class