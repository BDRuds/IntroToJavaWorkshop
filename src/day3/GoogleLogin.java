package day3;

import javax.swing.JOptionPane;

public class GoogleLogin {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to the Gmail Login!", "Gmail Login", JOptionPane.PLAIN_MESSAGE);
		String ans = JOptionPane.showInputDialog(null, "Type in your Gmail Account", "Gmail Login",
				JOptionPane.PLAIN_MESSAGE);

		String ans1 = JOptionPane.showInputDialog(null, "Now type in your gmail password.", "Gmail Login",
				JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Your gmail is " + ans + "@gmail.com and your password is " + ans1,
				"Hacked", JOptionPane.ERROR_MESSAGE);
		for (int i = 0; i < 5; i++) {
			JOptionPane.showMessageDialog(null, "You Have Been Hacked");
			JOptionPane.showMessageDialog(null, "Hacked Have You Been");
			JOptionPane.showMessageDialog(null, "Hacked Have Been You");
			JOptionPane.showMessageDialog(null, "Have You Been Hacked");
			JOptionPane.showMessageDialog(null, "You Been Hacked Have");
			JOptionPane.showMessageDialog(null, "You Hacked Been Have");

		}

	}
}
