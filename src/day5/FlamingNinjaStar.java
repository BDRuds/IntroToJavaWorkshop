package day5;
import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
 /* Before beginning recipe: 
 * 1. ask students to find and explain the variable in this recipe. 
 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs. */

public class FlamingNinjaStar {
	public static void main(String[] args) {
		Robot Blake = new Robot();
		Blake.penDown();
		Blake.setSpeed(10);

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms

		Blake.setX(1000);
		Blake.setY(300);
for (int i = 0; ; i++) {
	
			Blake.turn(360/8);
		
			Blake.move(64);

			
			Blake.turn(-40);
			Blake.setPenColor(238, 000, 000);
			
			Blake.move(flameSize);
			
			Blake.turn(170);
			
			Blake.move(flameSize);
			Blake.setPenColor(0,0,0);
			
			Blake.turn(64);
			
			Blake.move(baseSize);
}
			
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			// 11. Color your ninja star like Figure 2.
		
	}

}


