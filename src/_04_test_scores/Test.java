package _04_test_scores;

import javax.swing.JOptionPane;

public class Test {
public static void main(String[] args) {
	String quantity = JOptionPane.showInputDialog("What score did you get on your test? (Just the number)");
	
	int num = Integer.parseInt(quantity);
	
	if (num>80) {
		JOptionPane.showMessageDialog(null, "Nice job!");
	}else if(num>60){
		JOptionPane.showMessageDialog(null, "You could study more.");
	}else if(num<61){
		JOptionPane.showMessageDialog(null, "Mcdonalds is hiring.");
		
	}
}
}
