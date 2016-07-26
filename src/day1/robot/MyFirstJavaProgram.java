package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		Robot Blake = new Robot();
		Blake.hide();
		Blake.penDown();
		Blake.setSpeed(10);
		for (int i = 0; i < 4; i++) {
			Blake.move(200);
			Blake.turn(90);
			
		}
		Blake.turn(45);
		Blake.move(285);

	
		
		
	}
}
