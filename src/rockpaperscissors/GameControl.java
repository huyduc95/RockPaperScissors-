
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rockpaperscissors;

/**
 *
 * @author huytr
 */
public class GameControl{
    //These instance variables will act as constants through out the project
	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSORS = 3;

	//This function will help to display who selected what
	public static void display(String who, int s) {
		switch (s) {
		case GameControl.ROCK:
			System.out.print(who + " selected ROCK   ");
			break;
		case GameControl.PAPER:
			System.out.print(who + " selected PAPER   ");
			break;
		case GameControl.SCISSORS:
			System.out.print(who + " selected SCISSORS   ");
			break;
		default:
			break;
		}
	}
	//This function contains the actual buisness logic
	//and help to decide who won
	public static int compareSelections(int userSelection, int computerSelection) {
		if(userSelection==computerSelection) return 0;
		switch (userSelection) {
		case ROCK:
			return (computerSelection == SCISSORS ? 1 : -1);

		case PAPER:
			return (computerSelection == ROCK ? 1 : -1);

		case SCISSORS:
			return (computerSelection == PAPER ? 1 : -1);
		}
		return 0;
	}
    
    
}