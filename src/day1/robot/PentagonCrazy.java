package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		Robot Blake = new Robot();
		int f = 5;
		int a = 360/5;
		Blake.hide();
		Blake.penDown();

		Blake.setSpeed(100);

		Blake.setPenColor(0,0,0);

		for (int i = 0;; i++) {
			

			Blake.move(i);
	
			Blake.turn(a);
	
			Blake.turn(1);

	}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}