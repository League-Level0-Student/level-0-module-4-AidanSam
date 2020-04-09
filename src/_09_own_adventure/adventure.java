package _09_own_adventure;

import java.util.Random;

import javax.swing.JOptionPane;

public class adventure {
public static void main(String[] args) {
	int action = 0;
	int escape = 0;
	int hunger = 10;
	JOptionPane.showMessageDialog(null, "You are lost in a cave. You see 10 different paths in front of you. Only one leads outside.");
	action = JOptionPane.showOptionDialog(null, "What do you want to do?", "Ạ̸̢͍̈Ȁ̴̧̛͙̻̗̟̤͚͙̬͉̘̰͍̗̥̈́͂̈̆͗̈́̀̋̉̚̚̚A̸͙̹̠͖͕̯̟̾̈́̊A̴͚͇͒́̉͛̇̄̄̅͘͝Ą̷͚̙̻̹̙̘̙̪̣͕̞̫͉̽̽̔̆A̷̞̤̯̼͙̞̱̖̥̥̣͕̘̤͐̃̀̈́͋͛̉͌̅́̎̐͘͝A̴̡͙̖̩͉̦̻͍͓̹͕̲̜͐̚ͅA̴̜̞̝̾̀Ą̷͓̦̯̙̳̳̱̭̘̯̯̳̽͑̈́A̶̧̖͙̬̓̎̐̏A̴̧̻̺̗̦̝̲͈͈͈͔͑̈́͂̓͑̿̀̄͂̄͑͐͜͝", 0, JOptionPane.QUESTION_MESSAGE, null, new String[] { "Yell for help", "Do nothing", "Pick a path" }, null);
	if(action == 0) {
		JOptionPane.showMessageDialog(null, "Nobody comes.");
		hunger -=1;
	}
	if(action == 1) {
		JOptionPane.showMessageDialog(null, "Nothing happens.");
		hunger -=1;
	}
	if(action == 2) {
		JOptionPane.showMessageDialog(null, "You pick a random path and folow it.");
		Random rando = new Random();
	}
	
	
}
}
