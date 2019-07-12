//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot walle = new Robot();
		// 3. Ask the user what color they would like the robot to draw

		// 5. Use an if/else statement to set the pen color that the user requested

		while (true) {
			Random rande = new Random();
			int a = rande.nextInt(256);
			int b = rande.nextInt(256);
			int c = rande.nextInt(256);
			String color = JOptionPane.showInputDialog(null, "What color would you like the robot to draw with?");
			if (color.equalsIgnoreCase("red")) {
				walle.setPenColor(255, 0, 0);
			} else if (color.equalsIgnoreCase("orange")) {
				walle.setPenColor(255, 128, 0);
			} else if (color.equalsIgnoreCase("yellow")) {
				walle.setPenColor(255, 255, 0);
			} else if (color.equalsIgnoreCase("green")) {
				walle.setPenColor(0, 255, 0);
			} else if (color.equalsIgnoreCase("blue")) {
				walle.setPenColor(0, 0, 255);
			} else if (color.equalsIgnoreCase("purple")) {
				walle.setPenColor(128, 0, 128);
			} else {
				walle.setPenColor(a, b, c);
			}
			walle.setPenWidth(10);
			int l = 100;
			int s = 90;
			walle.setSpeed(300);
			walle.penDown();
			for (int i = 0; i < 4.; i++) {
				walle.move(l);
				walle.turn(s);
			}
		}
		// 6. If the user doesn’t enter anything, choose a random color

		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 4. Set the pen width to 10

		// 2. Make the robot draw a shape (this will take more than one line of code)

	}

}
