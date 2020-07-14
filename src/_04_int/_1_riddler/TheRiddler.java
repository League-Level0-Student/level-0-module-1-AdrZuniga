package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog("What is greater than God,\r\n" + 
				"more evil than the devil,\r\n" + 
				"the poor have it,\r\n" + 
				"the rich need it,\r\n" + 
				"and if you eat it, you'll die?");
		
		if (riddle.equals("nothing")) {
			score++;
		JOptionPane.showMessageDialog(null, "Correct! your score is " +score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong, the answer is 'nothing'");
		}
		
		String secondRiddle = JOptionPane.showInputDialog("There's a one-story house and every thing is yellow,\r\n" +
		"yellow walls, yellow doors, yellow furniture. What color are the stairs");
		
		if (secondRiddle.equals("There aren`t any")) {
			score++;
		JOptionPane.showMessageDialog(null, "Correct! your score is " +score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong, 'there aren`t any'");
		}
		
		String thirdRiddle = JOptionPane.showInputDialog("What can you keep after giving it to someone");
				
		if (thirdRiddle.equals("your words")) {
			score++;
		JOptionPane.showMessageDialog(null, "Correct! your score is " +score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong, the answer is 'your words'");
		}
		
		
		String fourthRiddle = JOptionPane.showInputDialog("Last one. What has legs, but can`t walk");
		
		if (fourthRiddle.equals("a table")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct! your score is " +score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong, the asnwer is 'a table'");
		}
		
		
		

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

