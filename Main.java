//Main.java


import java.util.*;

public class Main{
	static void humanGuesser(){
		System.out.print("human guesser");
		int answer = (int)(Math.random() * 101);
		boolean keepGoing = true;
		String guess = "12";
		int counter = 1;
		
		while (keepGoing){
			System.out.print(counter + ") Please enter a number: ");
		                   	Scanner input = new Scanner(System.in);
			guess = input.nextLine();
			System.out.println();
			if(Integer.parseInt(guess) == answer){
				System.out.println("got it!");
				keepGoing = false;
			}//end if
			else if(Integer.parseInt(guess) < answer){
				System.out.println("too low");
			}//end if
			else if(Integer.parseInt(guess) > answer){
				System.out.println("too high");
			}//end if
			else {
				System.out.println("Invalid Answer");

			}// end else
			counter = counter + 1;
		}//end while
	}// end humanGuesser
	
	public static void main(String[] args) {
		boolean keepGoing = true;
		Scanner input = new Scanner(System.in);
		while (keepGoing){
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
		}//end while
	}//end main
}//end class
