package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		JOptionPane.showMessageDialog(null, "Hello There! I have a couple riddles for you..If you answer correctly, i'll give you one point! Try to get most of them correct! Or else...");
		String r1 = JOptionPane.showInputDialog("What runs around a backyard but never moves?");
		if(r1.contains("fence")) {
			JOptionPane.showMessageDialog(null, "Correct!! On to the next question..");
			score+=1;
		} else {
			JOptionPane.showMessageDialog(null, "WRONG!! The correct answer is fence. Next question!");
		}
		String r2 = JOptionPane.showInputDialog("What can travel the world while staying in a corner?");
		if(r2.contains("stamp")) {
			JOptionPane.showMessageDialog(null, "Correct!! On to the next question..");
			score+=1;
		} else {
			JOptionPane.showMessageDialog(null, "WRONG!! The correct answer is a stamp. Next question!");
		}
		String r3 = JOptionPane.showInputDialog("What has a head and a tail but no body?");
		if(r3.contains("coin")) {
		JOptionPane.showMessageDialog(null, "Correct!! On to the next question..");
		score+=1;
		} else {
		JOptionPane.showMessageDialog(null, "WRONG!! The correct answer is coin. Next question!");
		}
		String r4 = JOptionPane.showInputDialog("What gets broken without being held?");
		if(r4.contains("promise")) {
		JOptionPane.showMessageDialog(null, "Correct!! That was all..");
		score+=1;
		} else {
		JOptionPane.showMessageDialog(null, "WRONG!! The correct answer is promise.");
		}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is"+ score);
	}
}

