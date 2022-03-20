/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rockpaperscissors;

import java.util.Random;

/**
 *
 * @author huytr
 */
public class Computer {
    // Computer will generate number 1 or 2 or 3 for 3 different options
        private int input;  ///
	public int getInput() {
		Random random = new Random();
		input = random.nextInt(3) + 1;
		return input;
	}
    
}
