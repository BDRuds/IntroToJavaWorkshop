package day3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String answer1 = JOptionPane.showInputDialog("Type in an adjective here.");
		String answer = JOptionPane.showInputDialog("What's your name?");
		JOptionPane.showMessageDialog(null, "Hi, " + answer + ", You are " + answer1);
	}
}
