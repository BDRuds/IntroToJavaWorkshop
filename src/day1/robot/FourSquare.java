package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot Blake = new Robot();
	

	void go() {
		Blake.setSpeed(10);

		Blake.setPenWidth(7);

		for (int i = 0; ; i++) {
			
		

			Blake.setRandomPenColor();
	
			drawSquare();
	
			Blake.turn(90);
		}

	}

	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		Blake.penDown();
		for (int i = 0; i < 4; i++) {
			Blake.move(100);
			Blake.turn(90);
		}
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
