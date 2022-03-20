/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rockpaperscissors;

import java.util.Scanner;

/**
 *
 * @author huytr
 */
public class Player {
    private String name; // Playername
	Scanner k = new Scanner(System.in);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}                   
	public void sayName() {
		System.out.print("Enter your Name: ");
		name = k.next();
	}
        
   
}
