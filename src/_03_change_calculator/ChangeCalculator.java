package _03_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String happy = JOptionPane.showInputDialog("How many nickels do you have? (integer please)");
		// Convert their answer to an int using Integer.parseInt()
		int AAAAA = Integer.parseInt(happy);
		// Ask the user how many dimes they have, and convert their answer
		String sad = JOptionPane.showInputDialog("How many nickels do you have? (integer please)");
		// Ask the user how many quarters they have, and convert their answer
		int quadrupleAbattery = Integer.parseInt(sad);
		// Calculate how much money the user has and save it in a double variable 
AAAAA *= 5;
quadrupleAbattery *= 10;

		// Tell the user how much money they have
AAAAA += quadrupleAbattery;
JOptionPane.showMessageDialog(null, "You have " + AAAAA + " cents!");
	}
}

