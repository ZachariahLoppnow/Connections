/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	//put an intro with rules
	System.out.println("------------------------------------------------------------------------------------------------------");
	    System.out.println("CONNECTIONS RULES: Sort 4 categories of 4 words.");
	    System.out.println();
	    System.out.println("You will be given a 4x4 grid filled with random words that can be sorted into 4 different categories.");
	    System.out.println("Input 4 valid words to solve each category. **First letter of each word must be capitalized**");
	    System.out.println("After inputing 4 words, it will tell you if you were correct of not.");
	    System.out.println("Your final score will give you the amount of guesses it took you to complete the game!");
	System.out.println("------------------------------------------------------------------------------------------------------");
	System.out.println();
	System.out.println();

	//making the array that has all the right answers
	Word connections = new Word();
	connections.getCategories();
	//answers=new array with the correct answers
	String[][] answers=connections.getAnswer();
	//changing answers arr to be scrambled
    String[][] scramble = connections.randomize();
    //printing new scrambled arr
	connections.print(scramble);

	System.out.println(" ");

	//while loop that keeps taking in guesses from the user until they get 4 categories correct
	int answercorrect=0;
	int guessnumber=0;
	Scanner sc=new Scanner(System.in);
	while(answercorrect<4){

	System.out.print("Guess 1: ");
	String guess1=sc.nextLine();
	System.out.print("Guess 2: ");
	String guess2=sc.nextLine();
	System.out.print("Guess 3: ");
	String guess3=sc.nextLine();
	System.out.print("Guess 4: ");
	String guess4=sc.nextLine();

	if(connections.checkGuess(guess1, guess2, guess3, guess4)==true){
		System.out.println("Correct!");
		answercorrect++;
		System.out.println(" ");
		guessnumber++;
	}
	else{
		System.out.println("Try again.");
		System.out.println(" ");
		guessnumber++;
	}
}

	//print out congratulations message
	System.out.println("Congratulations! You completed the connections in "+guessnumber+" tries!");

	//print out correct answer
	System.out.println("Correct answer: ");
	connections.print(answers);
	System.out.println("");


	}
}