package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton jokeButton = new JButton();
	JButton punchlineButton = new JButton();
	public static void main (String[] args) {
		
		new ChuckleClicker().makeButtons();
	}
	void makeButtons() {
		JFrame window = new JFrame();
		window.setVisible(true);
		JPanel panel = new JPanel();
		window.add(panel);
		jokeButton.setText("Joke");
		punchlineButton.setText("Punchline");
		panel.add(jokeButton);
		panel.add(punchlineButton);
		window.pack();
		jokeButton.addActionListener(this);
		punchlineButton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
			System.out.println("Hi");
			if (arg0.getSource() == jokeButton) {
				JOptionPane.showMessageDialog(null, "What do you call a train carrying bubblegum? A chew chew train.");
			}
			if (arg0.getSource() == punchlineButton) {
				JOptionPane.showMessageDialog(null, "Not too sure what a punchline is, but make one up if you'd like.");
			}
	}
}
