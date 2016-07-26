package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	Robot B = new Robot();
	
	
	
	void go() {
		int l = 50;
	
	l = l+10;

		B.setSpeed(10);
		B.hide();
		B.penDown();


		for (int i = 0; i < 60; i++) {
			
		

			B.setRandomPenColor();
	
			// 8. Increase the length of the side by 10 pixels
	
			drawTriangle(l);
	
			B.turn(6);
		}

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		for (int i = 0; i < 3; i++) {
			B.move(length);
			B.turn(120);
		}
		
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
