//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _02_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String c = JOptionPane.showInputDialog(null, "How many cats do you have have?");
		// 2. Convert their answer into an int
		int i = Integer.parseInt(c);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if (i >= 3) {
			JOptionPane.showMessageDialog(null, "You're a crazy cat (insert gender neutral pronoun)");
		}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below
		// to show them a cat video
		if (i > 0 && i < 3) {
			playVideo("https://www.youtube.com/watch?v=J---aiyznGQ");
		}
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a
		// Human
		if (i == 0) {
			playVideo("https://www.youtube.com/watch?v=oHg5SJYRHA0");
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
