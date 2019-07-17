package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog(null, "What is your star sign?");
		if (s.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "You're brave and commanding.");
		} else if (s.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "You're controlling and peaceful.");
		} else if (s.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "You enjoy learning and hate lonliness.");
		} else if (s.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, "You're emotional and seek security.");
		} else if (s.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "You're generous and protective.");
		} else if (s.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "You're logical and practical.");
		} else if (s.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "You have a sense of justice and balance.");
		} else if (s.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "You're passionate and extreme.");
		} else if (s.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "You're happy and creative.");
		} else if (s.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "You're calculating and ambitious.");
		} else if (s.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "You're stubborn and dedicated.");
		} else if (s.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "You're likeable and sensitive.");
		} else {
			JOptionPane.showMessageDialog(null, "That's not a star sign!");
		}
	}
}
