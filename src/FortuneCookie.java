import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie {
	public static void main(String[] args) {

		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
		fc.actionPreformed();
	}

	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		System.out.println("Button clicked");
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener((ActionListener) this);
	}

	public void actionPreformed() {
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if (rand == 1) {
			System.out.println("You are lucky today");
		}
		if (rand == 2) {
			System.out.println("You will win your next big event");
		}
		if (rand == 3) {
			System.out.println("You will have fun in the next week");
		}
		if (rand == 4) {
			System.out.println("You will recieve the answer what you are looking for");
		}
		if (rand == 5) {
			System.out.println("Your luck numbers are 14,45,77, and 39");
		}
	}
}
