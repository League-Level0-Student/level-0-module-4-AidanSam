package _08_happy_pet;
import javax.swing.JOptionPane;
import java.util.Random;
public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet

	static int totalhap = 0;
	public static void main(String[] args) {
		if(totalhap == 0) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What pet do you want to buy?");
		if(totalhap >250) {
			JOptionPane.showMessageDialog(null, "Your pet is happy!");
		}
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		}
		int whattodo;
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
		whattodo = JOptionPane.showOptionDialog(null, "What do you want to do?", "HappyPet", 0, JOptionPane.QUESTION_MESSAGE, null, new String[] { "Feed it", "Give it water", "Take it for a walk" }, null);
			//    Make sure to customize the title and question too.
if(whattodo == 0) {
	feedit();
}
if(whattodo == 1) {
	givewater();
}
if(whattodo == 2) {
	walk();
}
			// 5. Use user input to call the appropriate method created in step 4.
			
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.



	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	}
	static void feedit(){
		Random ran=new Random();
		int hap = ran.nextInt(5)+ 5;
		totalhap += hap;
		JOptionPane.showMessageDialog(null, "Your pet increased in happiness by " + hap + ".");
		System.out.println(totalhap);
		main(null);
	}
		static void givewater() {
			Random rand = new Random();
			int bap = rand.nextInt(13);
			totalhap += bap;
			JOptionPane.showMessageDialog(null, "Your pet increased in happiness by " + bap + ".");
			System.out.println(totalhap);
			main(null);
	}
		static void walk() {
			Random rando = new Random();
			int zap = rando.nextInt(101) - 50;
			totalhap +=zap;
			if( zap < 0) {
				JOptionPane.showMessageDialog(null, "Your pet was bitten by a dog");
				JOptionPane.showMessageDialog(null, "Your pet decreased in happiness by " + zap + ".");
			}
			if(zap>0) {
			JOptionPane.showMessageDialog(null, "Your pet increased in happiness by " + zap + ".");
			System.out.println(totalhap);
			}
			main(null);
		}
	
}

	
	

