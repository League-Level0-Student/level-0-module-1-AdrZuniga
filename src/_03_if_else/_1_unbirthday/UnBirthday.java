package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class UnBirthday {
public static void main(String[] args) {
	String Bday = JOptionPane.showInputDialog("When is your birthday?");
	if (Bday.equals("june 23")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Happy Unbirthday");
	}
}
}
