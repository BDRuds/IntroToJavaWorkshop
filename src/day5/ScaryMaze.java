package day5;

import java.applet.AudioClip;
import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener {
	
	BufferedImage maze;
	final int frameWidth = 800;
	final int frameHeight = 600;
	int x = 110;
	int y = 100;

	ScaryMaze() throws Exception {
		//1. Use this online tool to make a maze image and drop it into your day5 package: http://pixlr.com/editor/
		maze = ImageIO.read(getClass().getResource("Maze.jpg"));
		new Robot().mouseMove(x, y);
		//new Robot().mouseMove(xPosition, yPosition)
		
		addMouseMotionListener(this);
		//addMouseMotionListener(this)
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);
		int back = maze.getRGB(1, 1);
		System.out.println(mouseColor);

		//5. make a variable to hold the background color. 

		if(mouseColor == back){
		scare();	
		}
		
				if(mouseColor == -15990536){
					JOptionPane.showMessageDialog(null, "You win nerd");
				}
		
	}

	private void scare() {
		System.out.println("BOO!");
		AudioClip sound = JApplet.newAudioClip(getClass().getResource("scream.wav"));
		
		sound.play();		
		
		showScaryImage("ScaryImage.jpg");

	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new ScaryMaze());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("June's Scary Maze");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {}

}



