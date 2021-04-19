package _05_typing_tutor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton button = new JButton();
	JButton button1 = new JButton();
	
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
		button.addActionListener(this);
		button1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
