
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "February 14th";
		String dadsBirthday = "June 8th";
		String myBirthday = "June 22th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String s = JOptionPane.showInputDialog(null, "Which birthday do you want? Mom, Dad or Michael?");
		// 3. Print out what the user typed
		System.out.println(s);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (s.equalsIgnoreCase("mom")) {
			System.out.println(momsBirthday);
		}
		else if (s.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);
		}
		else if (s.equalsIgnoreCase("michael")) {
			System.out.println(myBirthday);
		}
		else {
			System.out.println("Invalid Birthday");
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
