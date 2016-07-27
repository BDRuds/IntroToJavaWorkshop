package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		String ans = JOptionPane.showInputDialog("Do you know how to code?");
		if (ans.equals("yes") || ans.equals("yeah")) {
			JOptionPane.showMessageDialog(null, "You Rule The World");
		}
		// 2. If they say "yes", tell them they will rule the world.

		else if (ans.equals("no") || ans.equals("nah")) {
			JOptionPane.showMessageDialog(null, "Good Luck cleaning the dishes");
		} else {
			JOptionPane.showMessageDialog(null, "You Answered Wrong! Learn to type!");
		}

	}
}
