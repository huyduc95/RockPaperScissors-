
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rockpaperscissors;

/**
 *
 * @author huytr
 */
//This class will represent the computer who is playing with the user.

import java.util.Random;

public class Computer{
	// This function helps the computer do the selection among ROCK,
	// PAPER,SCISSORS
	// we have used Random class from java.util.
        private int input;  ///
	public int getInput() {
		Random random = new Random();
		input = random.nextInt(3) + 1;
		return input;
	}  
    
}

