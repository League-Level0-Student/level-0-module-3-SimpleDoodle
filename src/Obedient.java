import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient {
public static void main(String[] args) {
	Robot walle = new Robot();
String s = JOptionPane.showInputDialog(null, "What shape do you want? Choose between a square, triangle, or triacosihexe(a)contagon.");
if (s.equalsIgnoreCase("Square")) {
	drawSquare(walle);
}
if (s.equalsIgnoreCase("triangle")) {
	drawTriangle(walle);
}
if (s.equalsIgnoreCase("triacosihexe(a)contagon")) {
	drawCircle(walle);
}
	
	
}
private static void drawSquare(Robot walle) {
	walle.penDown();
	int i = 0;
	while (i<4) {
		walle.setSpeed(50000);
		walle.move(200);
		walle.turn(90);
		i++;
		
		
	}
	walle.moveTo(1, 1);
}
private static void drawTriangle(Robot walle) {
	walle.penDown();
	int i = 0;
	while (i<3) {
		walle.setSpeed(50000);
		walle.move(200);
		walle.turn(240);
		i++;
		
		
	}
	walle.moveTo(1, 1);
}
private static void drawCircle(Robot walle) {
	walle.penDown();
	int i = 0;
	while (i<360) {
		walle.setSpeed(50000);
		walle.move(3);
		walle.turn(1);
		i++;
		
		
	}
	walle.moveTo(1, 1);
}
}
