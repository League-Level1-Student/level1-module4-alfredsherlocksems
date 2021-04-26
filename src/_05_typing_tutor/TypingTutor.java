package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	public static void main (String[] args) {
		new TypingTutor().setup();
		TypingTutor tutor = new TypingTutor();
		tutor.setup();
	}
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	void setup() {
		currentLetter = generateRandomLetter();
		label.setText( "" + currentLetter);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.pack();
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyChar());
		if (arg0.getKeyChar() == currentLetter) {
			System.out.println("Correct");
		}
		if (arg0.getKeyChar() == currentLetter) {
			panel.setBackground(Color.GREEN);
		}
		else {
			panel.setBackground(Color.RED);
		}
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter); 
		frame.pack();
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
