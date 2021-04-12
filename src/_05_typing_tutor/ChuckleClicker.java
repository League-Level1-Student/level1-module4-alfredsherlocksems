package _05_typing_tutor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker {
	JButton button = new JButton();
	JButton button1 = new JButton();
	button.addActionListener(this);
	button1.addActionListener(this);
	public static void main (String[] args) {
		
		new ChuckleClicker().makeButtons();
	}
	void makeButtons() {
		JFrame window = new JFrame();
		window.setVisible(true);
		JPanel panel = new JPanel();
		window.add(panel);
		button.setText("Joke");
		button1.setText("Punchline");
		panel.add(button);
		panel.add(button1);
		window.pack();
	}
}
