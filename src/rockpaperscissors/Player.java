
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rockpaperscissors;

/**
 *
 * @author huytr
 */
import java.util.Scanner;

public class Player{
    private String name;// Represents the Players name
	Scanner k = new Scanner(System.in);
	// sc will help to take inputs from keyboard

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
                    //enterName
	public void askName() {// Will let the user enter his name
		System.out.print("Please enter your name: ");
		name = k.next();
	}

	public int getInput() {
		// This function lets the user do the selection among
		// ROCK PAPER SCISSORS
		// and return what has been selected
		System.out.println("Select  ROCK  PAPER SCISSOR");

		String input = k.next();
		input = input.toUpperCase();
		char c = input.charAt(0);
		// checking the 1st character in the input
		if (c == 'R')
			return GameControl.ROCK;
		else if (c == 'P')
			return GameControl.PAPER;
		else if (c == 'S')
			return GameControl.SCISSORS;
		else {
			getInput();
			return 0;
		}
	}

	public boolean playAgain() {
		// This function will ask if the user wants to
		// play again and return true or false accordingly.
		k=new Scanner(System.in);
		System.out.print("Do you want to play again? ");
		String userInput = k.nextLine();
		userInput = userInput.toUpperCase();
		return userInput.charAt(0) == 'Y';
	}
    
}
