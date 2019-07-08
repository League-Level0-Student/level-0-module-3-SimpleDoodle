package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
	String first = JOptionPane.showInputDialog(null,"Are you happy?");
		if (first.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		} else {
			String second = JOptionPane.showInputDialog(null,"Do you want to be happy?");
			if (second.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			} else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
		}
		
	}
}
