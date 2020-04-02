package _08_happy_pet;
import javax.swing.JOptionPane;
import java.util.Random;
public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		int happinessLevel = 0;
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		int whattodo;
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
		whattodo = JOptionPane.showOptionDialog(null, "What do you want to do?", "HappyPet", 0, JOptionPane.QUESTION_MESSAGE, null, new String[] { "Feed it", "Give it water", "Take it for a walk" }, null);
			//    Make sure to customize the title and question too.
			System.out.println(whattodo);

			// 5. Use user input to call the appropriate method created in step 4.
			
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.



	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	}
	void walk(){
		Random ran=new Random();
		int hap = ran.nextInt(5)+ 5;
		JOptionPane.showMessageDialog(null, "You're pet increased in happiness by ");
		
	}
}

	
	

