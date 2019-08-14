import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();
public static void main(String[] args) {
	rob.setSpeed(100);
	rob.penDown();
	String shape = JOptionPane.showInputDialog("Do you want a triagnle or a square?");
	String color = JOptionPane.showInputDialog("Do you want your shape to be blue or red?");
	if (color.equalsIgnoreCase("red")) {
		rob.setPenColor(Color.red);
	} else if (color.equalsIgnoreCase("blue")) {
		rob.setPenColor(Color.blue);
	}
	if(shape.equalsIgnoreCase("square")) {
		square();
	} else if (shape.equalsIgnoreCase("triangle")) {
		triangle();
	}
	
	}

static void triangle() {
	rob.turn(270);
	rob.move(200);
	rob.turn(120);
	rob.move(200);
	rob.turn(120);
	rob.move(200);
}

static void square () {
	for (int i = 0; i < 4; i++) {
		rob.move(200);
		rob.turn(90);
	}
}



}

