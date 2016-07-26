package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot Blake = new Robot();
		Blake.penDown();
		Blake.setSpeed(10);
		for (int i = 0; ; i++) {
			Blake.setRandomPenColor();
			Blake.move(1);
			Blake.turn(360/360);
			Blake.setPenWidth(i);
		}
	}
}
