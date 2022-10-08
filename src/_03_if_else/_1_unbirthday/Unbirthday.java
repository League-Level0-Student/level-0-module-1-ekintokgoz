package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bdayDate = JOptionPane.showInputDialog("Hello! When is your birthday? MM/DD/YY");
		if(bdayDate.equals("10/07/22")) {
			JOptionPane.showMessageDialog(null, "Well have a very very happy birthday!");

		} else {
			JOptionPane.showMessageDialog(null, "That's too bad...have a very happy UNbirthday!");
		}
	}

}
