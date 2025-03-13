//Main.java


import java.util.*;

public class Main{
	static void humanGuesser{
		System.out.print("human guesser");
		int answer = (int)(Math.random() * 101);
		boolean keepGoing = true;
		String guess = "12";
		int counter = 1;
		
		while (keepGoing){
			System.out.print(counter + ") Please enter a number: ");
			Scanner input = new Scanner(System.in);
			guess = input.nextline();
			System.out.println();
			if(guess == answer){
				System.out.println("got it!");
				keepGoing = false;
			}//end if
			else if(guess < answer){
				System.out.println("too low")
			}//end if
			else if(guess > answer){
				System.out.println("too high");
			}//end if
			counter = counter + 1
		}//end while
	}// end humanGuesser
	
	public static void main(String[] args) {
		boolean keepGoing = true;
		Scanner choice = new Scanner(System.in);
		while (keepGoing){
			system.out.println("0) Exit");
			systen.out.println("1) Human Guesser");

		}//end while
	}//end main
}//end class
