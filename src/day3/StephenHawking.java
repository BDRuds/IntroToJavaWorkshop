package day3;

import javax.swing.JOptionPane;

public class StephenHawking {

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {

			String speak = JOptionPane.showInputDialog("What would you like me to say?");
			speak(speak);
		}
	}

	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
