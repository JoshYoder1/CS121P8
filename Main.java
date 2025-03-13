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
			String choice = input.nextLine();
			if(choice.equals("0")){
				System.out.println("Goodbye!");
				keepGoing = false;
			}//end if
			else if(choice.equals("1")){
				humanGuesser();
			}
		}//end while
		input.close();
	}//end main
	
	public static void humanGuesser(){
		System.out.print("human guesser");
		int answer = (int)(Math.random() * 101);
		boolean keepGoing = true;
		int guess;
		int counter = 1;
		
		while (keepGoing){
			System.out.print(counter + ") Please enter a number: ");
			guess = Integer.parseInt(input.nextLine());
			System.out.println();
			if(guess == answer){
				System.out.println("got it!");
				keepGoing = false;
			}//end if
			else if(guess < answer){
				System.out.println("too low");
			}//end if
			else if(guess > answer){
				System.out.println("too high");
			}//end if
			else {
				System.out.println("Invalid Answer");

			}// end else
			counter = counter + 1;
		}//end while
	}// end humanGuesser
	
	
}//end class
