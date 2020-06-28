package _04_test_scores;

import javax.swing.JOptionPane;

public class Test {
public static void main(String[] args) {
	String beep = JOptionPane.showInputDialog("What is your swords damage?");
	int num = Integer.parseInt(beep);
	
	String combat = JOptionPane.showInputDialog("What is your combat level?");
	int damage = Integer.parseInt(combat);
	int dps = ((damage*4)+ 100)/100;
	System.out.println(dps);
	
	String critdmg = JOptionPane.showInputDialog("What is your swords crit damage?");
	int yum = Integer.parseInt(critdmg);

	String strength = JOptionPane.showInputDialog("What is your swords strength?");
	int bum = Integer.parseInt(strength);
	JOptionPane.showMessageDialog(null, "On a crit you will deal " + (dps *(((num + 5 + (bum/5)) * (1 + (bum/100))) * (yum/100))));
	}
}

