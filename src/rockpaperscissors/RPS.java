/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rockpaperscissors;

/**
 *
 * @author huytr
 */
public class RPS{
//Instance variables declaration
	private Player player;
	private Computer computer;
	private int playerScore;
	private int computerScore;
	private int numberOfGames;

	//Default Constructor initializing the instance variables
	public RPS() {
		player = new Player();
		computer = new Computer();
		playerScore = 0;
		computerScore = 0;
		numberOfGames = 0;
	}
    public static void main(String[] args) {
	RPS rps = new RPS();//Initialization occured.
		rps.getplayerName();//Getting user name
		rps.startGame();
	}
	//This function is called recursively till the player wants to play.
	//It is even exited if the user of computer completes the first 3 wins.
	public void startGame() {
		int playerinput = player.getInput();
		GameControl.display(player.getName(), playerinput);
		// Get moves
		int computerinput = computer.getInput();
		GameControl.display("computer", computerinput);
		// Compare moves and determine winner
		int compareResult=GameControl.compareSelections(playerinput, computerinput);
		switch (compareResult) {
		case 0: // Tie
			System.out.println("Tie!");
                        score();   //
			break;
		case 1: // player wins
			System.out.println(player.getName()+ " Beats " + "computer" +" You won!");
			playerScore++;
                        score();   //
			break;
		case -1: // Computer wins
			System.out.println("Computer" +" Beats "+ player.getName()+" You Lost!");
			computerScore++;
                        score();   //
			break;
		}
		numberOfGames++;
		if(playerScore==3)
		{
			System.out.println(player.getName()+" HAS WON THE GAME.............");
			new RPS();
		}
		if(computerScore==3)
		{
			System.out.println("Computer "+" HAS WON THE GAME............");
			new RPS();
		}
		// Ask the player to play again
		if (player.playAgain()) {
			System.out.println();
			startGame();
		} else {
			printStats();
		}
	}
	//helps to get the users name
	public void getplayerName() {
		player.askName();
	}
	//Prints the result.
	public void printStats()
	{
		System.out.println("Number of games played is "+numberOfGames);
		System.out.println(player.getName()+"'s score "+playerScore);
		System.out.println("Computers score "+computerScore);
        }
        
        public void score() //
	{
		System.out.print(player.getName()+" : "+playerScore + "\t");
		System.out.println("Computers : "+computerScore);
        }
        
    
}
